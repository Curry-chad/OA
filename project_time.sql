/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:32:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for project_time
-- ----------------------------
DROP TABLE IF EXISTS `project_time`;
CREATE TABLE `project_time` (
  `time_id` char(40) NOT NULL,
  `main_id` varchar(40) DEFAULT NULL,
  `time_start` datetime DEFAULT NULL,
  `time_end` datetime DEFAULT NULL,
  PRIMARY KEY (`time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of project_time
-- ----------------------------
INSERT INTO `project_time` VALUES ('001', '001', '2019-04-30 21:30:56', '2019-04-30 21:31:00');
