/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:31:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for forum_work
-- ----------------------------
DROP TABLE IF EXISTS `forum_work`;
CREATE TABLE `forum_work` (
  `work_id` varchar(40) NOT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `work_text` varchar(500) DEFAULT NULL,
  `work_date` date DEFAULT NULL,
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of forum_work
-- ----------------------------
INSERT INTO `forum_work` VALUES ('001', null, '今天上班真累啊，，，，', '2019-04-29');
