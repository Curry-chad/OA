/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:32:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for job_hour
-- ----------------------------
DROP TABLE IF EXISTS `job_hour`;
CREATE TABLE `job_hour` (
  `hour_id` varchar(40) NOT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `hour_time` int(11) DEFAULT NULL,
  `hour_rest` int(11) DEFAULT NULL,
  PRIMARY KEY (`hour_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of job_hour
-- ----------------------------
INSERT INTO `job_hour` VALUES ('001', '001', '40', '8');
