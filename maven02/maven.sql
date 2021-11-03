/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 50649
 Source Host           : localhost:3306
 Source Schema         : maven

 Target Server Type    : MySQL
 Target Server Version : 50649
 File Encoding         : 65001

 Date: 03/11/2021 12:37:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES (7, '测试数据.sql');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'userName',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES (1, '三三三', '123456');
INSERT INTO `login` VALUES (2, '李四', '123456');
INSERT INTO `login` VALUES (3, '王五', '123456');
INSERT INTO `login` VALUES (4, '李留', '123456');
INSERT INTO `login` VALUES (5, '小白', '123456');
INSERT INTO `login` VALUES (6, '小黑', '123456');
INSERT INTO `login` VALUES (7, '小红', '123456');
INSERT INTO `login` VALUES (8, 'admin', '123456');
INSERT INTO `login` VALUES (9, '小兰', '123456');
INSERT INTO `login` VALUES (10, '小绿', '123456');
INSERT INTO `login` VALUES (11, '赵三', '123456');
INSERT INTO `login` VALUES (12, '钱三', '123456');
INSERT INTO `login` VALUES (13, '孙三', '123456');
INSERT INTO `login` VALUES (14, '李三', '123456');
INSERT INTO `login` VALUES (15, '周三', '123456');
INSERT INTO `login` VALUES (16, '吴三', '123456');
INSERT INTO `login` VALUES (17, '郑三', '123456');
INSERT INTO `login` VALUES (18, '王三', '123456');
INSERT INTO `login` VALUES (19, '汉三', '123456');
INSERT INTO `login` VALUES (20, '陈三', '123456');
INSERT INTO `login` VALUES (21, '舒散', '123456');
INSERT INTO `login` VALUES (22, '魏三', '123456');
INSERT INTO `login` VALUES (23, 'ssssss', 'sssss');
INSERT INTO `login` VALUES (25, 'sdsd', 'das');
INSERT INTO `login` VALUES (26, 'sada', 'sss');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (3, '李四四', '123456', 188);
INSERT INTO `user` VALUES (4, '李四', '123456', 18);
INSERT INTO `user` VALUES (5, '小白1', '123456', 118);
INSERT INTO `user` VALUES (6, '小白1', '123456', 118);
INSERT INTO `user` VALUES (7, '小白1', '123456', 118);
INSERT INTO `user` VALUES (8, '小白1', '123456', 118);
INSERT INTO `user` VALUES (9, '小白1', '123456', 118);
INSERT INTO `user` VALUES (10, '小白1', '123456', 118);
INSERT INTO `user` VALUES (11, '小白1', '123456', 118);
INSERT INTO `user` VALUES (12, '小白1', '123456', 118);
INSERT INTO `user` VALUES (13, '小白1', '123456', 118);
INSERT INTO `user` VALUES (14, '小白1', '123456', 118);
INSERT INTO `user` VALUES (15, '小白1', '123456', 118);
INSERT INTO `user` VALUES (21, '张三', '123456789', 18);
INSERT INTO `user` VALUES (22, '三萨达', '123456', 18);

SET FOREIGN_KEY_CHECKS = 1;
