package com.javen.service.impl;

import com.javen.dao.UserDao;
import com.javen.model.User;
import com.javen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    /*
     * pageInteger:代表我们现在在第几页上
     * limitInteger：每页的个数
     * (non-Javadoc)
     * @see com.javen.service.IRegistService#selectAll(int, int)
     */
    public List<User> findAll(int pageInteger, int limitInteger) {
        int pageIndex = (pageInteger-1) * limitInteger;
        int pageSize = limitInteger;
        return this.userDao.findAll(pageIndex,pageSize);
    }



    public int deleteById(Integer id) {
        return this.userDao.deleteById(id);
    }

    public int insert(User user) {
        return this.userDao.insert(user);
    }

    public int update(User user) {
        return this.userDao.update(user);
    }

    public int selectCount() {
        return this.userDao.selectCount();
    }
}
