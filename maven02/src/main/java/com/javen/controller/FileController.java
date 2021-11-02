package com.javen.controller;

import com.javen.model.Files;
import com.javen.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/file")
public class FileController {
    @Autowired
    private IFileService iFileService;

    @ResponseBody
    @RequestMapping("/show")
    public Map<String,Object> show(){
        List<Files> files =  iFileService.show();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("rows",files);
        map.put("count",100);
        map.put("massage","成功");
        map.put("status","0");
        return map;
    }


    /**
     * 文件上传功能
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/upload",method= RequestMethod.POST)
    @ResponseBody
    public  String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {

        // uploads文件夹位置
        String rootPath = request.getSession().getServletContext().getRealPath("WEB-INF/upload");
        // 原始名称
        String originalFileName = file.getOriginalFilename();

        // 新文件
        File newFile = new File(rootPath + File.separator  + File.separator + originalFileName);
        // 判断目标文件所在目录是否存在
        if( !newFile.getParentFile().exists()) {
            // 如果目标文件所在的目录不存在，则创建父目录
            newFile.getParentFile().mkdirs();
        }
        System.out.println(newFile);
        // 将内存中的数据写入磁盘
        file.transferTo(newFile);

        //设置到数据库当中
        Files file1 = new Files();
        file1.setFileName(originalFileName);
        iFileService.insert(file1);

        return  "{\"data\":\"success\"}";
    }

    /**
     * 文件下载功能
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/down")
    public void down(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String filename = request.getParameter("filename");
        //模拟文件，myfile.txt为需要下载的文件
        String fileName = request.getSession().getServletContext().getRealPath("WEB-INF/upload")+"/"+filename;
        //获取输入流
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
        //假如以中文名下载的话
       // String filename = "下载文件.txt";
        //转码，免得文件名中文乱码
        filename = URLEncoder.encode(filename,"UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }
}
