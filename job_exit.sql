/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:32:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for job_exit
-- ----------------------------
DROP TABLE IF EXISTS `job_exit`;
CREATE TABLE `job_exit` (
  `exit_id` varchar(40) NOT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `exit_post` varchar(40) DEFAULT NULL,
  `exit_salary` double DEFAULT NULL,
  `exit_date` datetime DEFAULT NULL,
  PRIMARY KEY (`exit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of job_exit
-- ----------------------------
INSERT INTO `job_exit` VALUES ('001', '001', 'java开发工程师', '10000', '2019-05-01 15:59:54');
