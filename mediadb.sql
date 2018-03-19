/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : mediadb

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-03-15 14:04:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL COMMENT '文章标题',
  `tags` varchar(45) DEFAULT NULL COMMENT '文章标签',
  `description` varchar(300) DEFAULT NULL COMMENT '文章摘要',
  `content` text NOT NULL COMMENT '正文',
  `author` varchar(45) DEFAULT NULL COMMENT '作者',
  `timestamp` int(11) DEFAULT '0' COMMENT '发表的时间',
  `readNum` int(11) DEFAULT '-1' COMMENT '阅读数量',
  `commentNum` int(11) DEFAULT '-1' COMMENT '评论数量',
  `url` varchar(200) NOT NULL COMMENT '源链接',
  `categery1` varchar(45) NOT NULL COMMENT '一级目录',
  `categery2` varchar(45) NOT NULL COMMENT '二级目录',
  `categery3` varchar(45) NOT NULL COMMENT '三级目录',
  `image1` varchar(255) DEFAULT NULL COMMENT '图片1',
  `image2` varchar(255) DEFAULT NULL COMMENT '图片2',
  `image3` varchar(255) DEFAULT NULL COMMENT '图片3',
  `imagecount` int(11) NOT NULL DEFAULT '0' COMMENT '图片数量',
  `status` int(11) NOT NULL COMMENT '审核状态',
  `origin` varchar(45) NOT NULL COMMENT '网址名称',
  `failed_msg` varchar(45) DEFAULT NULL COMMENT '错误信息',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `title_UNIQUE` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8 COMMENT='文章数据表';

-- ----------------------------
-- Table structure for articleurllist
-- ----------------------------
DROP TABLE IF EXISTS `articleurllist`;
CREATE TABLE `articleurllist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `md5` varchar(64) NOT NULL COMMENT 'url的MD5值，用来区分是否重复',
  `url` varchar(200) NOT NULL COMMENT '文章链接',
  `channel` varchar(45) NOT NULL COMMENT '安全教育新闻资讯的频道ID',
  `crawlingTime` int(11) DEFAULT '0' COMMENT 'url的处理时间',
  `status` int(11) DEFAULT '-2' COMMENT '处理状态\\n默认-2代表未处理过\\n-1：正在处理\\n0：处理成功\\n1-n：重试次数',
  `host` varchar(45) DEFAULT NULL COMMENT '处理的主机（mac)',
  `articleurllistcol` varchar(45) DEFAULT NULL,
  `thread` varchar(45) DEFAULT NULL COMMENT '主机线程ID',
  `proxyIPAndPort` varchar(45) DEFAULT NULL COMMENT '代理的ip和端口\\n127.0.0.1:80',
  `decoder` varchar(45) NOT NULL COMMENT '解析url的类：com.abc.spider.XXX',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `md5_UNIQUE` (`md5`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章链接列表';

-- ----------------------------
-- Table structure for proxyipandport
-- ----------------------------
DROP TABLE IF EXISTS `proxyipandport`;
CREATE TABLE `proxyipandport` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `ip` varchar(45) NOT NULL COMMENT '代理IP',
  `port` int(11) NOT NULL COMMENT '代理端口',
  `delay` int(11) DEFAULT '-1' COMMENT 'ip.cn网络延迟',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代理ip和端口数据库';

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL COMMENT '主键ID',
  `account` varchar(32) DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `surname` varchar(32) DEFAULT NULL COMMENT '昵称',
  `sign` varchar(255) DEFAULT NULL COMMENT '签名',
  `last_login_ip` varchar(16) DEFAULT NULL COMMENT '上次登录ip',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `last_logout_time` datetime DEFAULT NULL COMMENT '最后登出时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
