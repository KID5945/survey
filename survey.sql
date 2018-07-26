/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 50718
Source Host           : rm-2ze36tam64p4ph076po.mysql.rds.aliyuncs.com:3306
Source Database       : survey

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-06-04 16:17:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for module
-- ----------------------------
DROP TABLE IF EXISTS `module`;
CREATE TABLE `module` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL COMMENT '类型',
  `muse` char(1) DEFAULT NULL COMMENT '模板是否启用',
  `mexplain` varchar(2000) DEFAULT NULL COMMENT '模板说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for problem
-- ----------------------------
DROP TABLE IF EXISTS `problem`;
CREATE TABLE `problem` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(2000) DEFAULT NULL,
  `aanswer` varchar(255) DEFAULT NULL,
  `banswer` varchar(255) DEFAULT NULL,
  `canswer` varchar(255) DEFAULT NULL,
  `danswer` varchar(255) DEFAULT NULL,
  `ptid` int(11) DEFAULT NULL COMMENT '题目类型id',
  `puse` char(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qap
-- ----------------------------
DROP TABLE IF EXISTS `qap`;
CREATE TABLE `qap` (
  `qaid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL COMMENT '调查表id',
  `qid` int(11) DEFAULT NULL COMMENT '问题id',
  PRIMARY KEY (`qaid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for questionnaire
-- ----------------------------
DROP TABLE IF EXISTS `questionnaire`;
CREATE TABLE `questionnaire` (
  `qid` int(11) NOT NULL AUTO_INCREMENT COMMENT '调查表id',
  `qname` varchar(255) DEFAULT NULL COMMENT '调查表名字',
  `uid` int(11) DEFAULT NULL COMMENT '编辑用户id',
  `etime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
  `stime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `ftime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  `qexplain` varchar(255) DEFAULT NULL COMMENT '问卷说明',
  `mid` int(11) DEFAULT NULL COMMENT '模板类型id',
  `quse` char(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) DEFAULT NULL COMMENT '用户账号',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL COMMENT '用户权限等级id',
  `peid` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for useranswer
-- ----------------------------
DROP TABLE IF EXISTS `useranswer`;
CREATE TABLE `useranswer` (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT '答案id',
  `uid` int(11) DEFAULT NULL COMMENT '答题者id',
  `qaid` int(11) DEFAULT NULL COMMENT '问卷——题目关系id',
  `answer` varchar(255) DEFAULT NULL COMMENT '答案',
  `age` int(11) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
