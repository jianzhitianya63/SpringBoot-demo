/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : articlesdb

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-03-15 14:04:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for articles
-- ----------------------------
DROP TABLE IF EXISTS `articles`;
CREATE TABLE `articles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `tags` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `content` text NOT NULL,
  `author` varchar(50) NOT NULL DEFAULT '',
  `origin` varchar(100) NOT NULL DEFAULT '',
  `originUrl` varchar(400) NOT NULL DEFAULT '',
  `timestamp` datetime NOT NULL,
  `category1` int(11) NOT NULL,
  `category2` int(11) NOT NULL,
  `category3` int(11) NOT NULL,
  `image1` varchar(400) NOT NULL DEFAULT '',
  `image2` varchar(400) NOT NULL DEFAULT '',
  `image3` varchar(400) NOT NULL DEFAULT '',
  `imageCount` int(1) NOT NULL DEFAULT '0',
  `status` int(1) NOT NULL DEFAULT '1',
  `addTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `readNum` int(11) NOT NULL DEFAULT '0',
  `praiseNum` int(11) NOT NULL DEFAULT '0',
  `commentNum` int(11) NOT NULL DEFAULT '0',
  `lastOperateTime` datetime DEFAULT NULL,
  `lastOperator` varchar(50) NOT NULL DEFAULT '',
  `from` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=220 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for article_category
-- ----------------------------
DROP TABLE IF EXISTS `article_category`;
CREATE TABLE `article_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `parentId` int(11) NOT NULL,
  `level` int(1) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  `sort` int(3) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
