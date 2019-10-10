/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : mydb01

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-10-07 22:51:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_account`
-- ----------------------------
DROP TABLE IF EXISTS `tb_account`;
CREATE TABLE `tb_account` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account_name` varchar(32) NOT NULL COMMENT '账户名',
  `money` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '账户余额，单位是分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户的银行账号及余额信息';

-- ----------------------------
-- Records of tb_account
-- ----------------------------
INSERT INTO `tb_account` VALUES ('1', '虎哥', '10000');
INSERT INTO `tb_account` VALUES ('2', '虎妹', '10000');

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(60) NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '注册邮箱',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL COMMENT '修改时间',
  `source_type` varchar(1) DEFAULT NULL COMMENT '会员来源：1:PC，2：H5，3：Android，4：IOS',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `status` varchar(1) DEFAULT NULL COMMENT '使用状态（1正常 0非正常）',
  `head_pic` varchar(150) DEFAULT NULL COMMENT '头像地址',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ号码',
  `is_mobile_check` varchar(1) DEFAULT '0' COMMENT '手机是否验证 （0否  1是）',
  `is_email_check` varchar(1) DEFAULT '0' COMMENT '邮箱是否检测（0否  1是）',
  `sex` varchar(1) DEFAULT '1' COMMENT '性别，1男，0女',
  `user_level` int(11) DEFAULT NULL COMMENT '会员等级',
  `points` int(11) DEFAULT NULL COMMENT '积分',
  `experience_value` int(11) DEFAULT NULL COMMENT '经验值',
  `birthday` datetime DEFAULT NULL COMMENT '出生年月日',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`username`),
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('13904211939', '123123', '13904211939', null, '2019-03-06 15:40:47', '2019-03-06 15:40:47', null, null, null, '1', null, null, '1', '0', null, null, '0', null, null, null);
INSERT INTO `tb_user` VALUES ('17701265258', '111222', '17701265258', null, '2019-03-06 15:22:32', '2019-03-06 15:22:32', null, null, null, '1', null, null, '1', '0', null, null, '0', null, null, null);
INSERT INTO `tb_user` VALUES ('chuanzhi777', 'f1c1592588411002af340cbaedd6fc33', '17701265258', null, '2018-08-07 21:19:08', '2018-08-07 21:19:08', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('honghaier', 'f14029217ff5e7a50cdc7e70f686cf29', '13919991999', null, '2017-10-08 11:23:02', '2017-10-08 11:23:02', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('lijialong', '4297f44b13955235245b2497399d7a93', '13260006290', null, '2017-08-20 12:23:37', '2017-08-20 12:23:37', null, null, null, '1', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('lisi', '8fbaad286e993d37b34b41749894b4a7', '13401341444', null, '2017-08-20 11:08:29', '2017-08-20 11:08:29', null, null, null, '1', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('litianwang', 'b0baee9d279d34fa1dfd71aadb908c3f', '17338118923', null, '2017-10-08 12:28:25', '2017-10-08 12:28:25', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('nezha', '1a100d2c0dab19c4430e7d73762b3423', '17338118923', null, '2017-10-08 12:23:27', '2017-10-08 12:23:27', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('niumowang', '4297f44b13955235245b2497399d7a93', '13900112222', null, '2017-10-07 23:46:53', '2017-10-07 23:46:53', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('shaheshang', '$2a$10$F48iE1IbKR0pz.HP/glY8.Ml/L7zqyqUBKAM9ZMnrF8DK.qz3VVWi', '13900112222', null, '2017-08-19 22:37:44', '2017-08-19 22:37:44', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('sunwukong', '$2a$10$F48iE1IbKR0pz.HP/glY8.Ml/L7zqyqUBKAM9ZMnrF8DK.qz3VVWi', '1112221111', null, '2017-08-19 20:50:21', '2017-08-19 20:50:21', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('taiba', '97d84aa49109e72a54980e79802844be', '17338118923', null, '2017-10-08 12:34:53', '2017-10-08 12:34:53', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('tangseng', '4297f44b13955235245b2497399d7a93', '13901223232', null, '2017-10-07 23:07:42', '2017-10-07 23:07:42', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('tieshanxian', 'f14029217ff5e7a50cdc7e70f686cf29', '13999999999', null, '2017-10-08 12:10:26', '2017-10-08 12:10:26', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('wangwu', 'd41d8cd98f00b204e9800998ecf8427e', '13601566766', null, '2017-08-20 11:09:26', '2017-08-20 11:09:26', null, null, null, '1', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('xiaogao', '967856e8dd46d819c09d4999e64b9eed', '13900002222', null, '2018-08-08 11:56:41', '2018-08-08 11:56:41', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('xiaoxiong', '4297f44b13955235245b2497399d7a93', '13900009999', null, '2018-08-08 12:30:12', '2018-08-08 12:30:12', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('zhangsan', '00b7691d86d96aebd21dd9e138f90840', '17701265258', null, '2017-08-19 23:44:45', '2017-08-19 23:44:45', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('zhaoliu', 'f379eaf3c831b04de153469d1bec345e', '13669669966', null, '2017-08-20 12:09:27', '2017-08-20 12:09:27', null, null, null, '1', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('zhubajie', '4297f44b13955235245b2497399d7a93', '111122', null, '2017-08-19 21:00:23', '2017-08-19 21:00:23', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
