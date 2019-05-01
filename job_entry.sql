/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 16:49:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for job_entry
-- ----------------------------
DROP TABLE IF EXISTS `job_entry`;
CREATE TABLE `job_entry` (
  `entry_id` varchar(40) NOT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `entry_post` varchar(40) DEFAULT NULL,
  `entry_salary` double DEFAULT NULL,
  `entry_date` datetime DEFAULT NULL,
  PRIMARY KEY (`entry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of job_entry
-- ----------------------------
INSERT INTO `job_entry` VALUES ('001', '001', 'java开发工程师', '10000', '2019-05-01 15:59:54');
