/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:32:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for project_main
-- ----------------------------
DROP TABLE IF EXISTS `project_main`;
CREATE TABLE `project_main` (
  `main_id` varchar(40) NOT NULL,
  `main_name` varchar(20) DEFAULT NULL,
  `main_amount` double DEFAULT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `main_start` date DEFAULT NULL,
  `main_end` date DEFAULT NULL,
  PRIMARY KEY (`main_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of project_main
-- ----------------------------
INSERT INTO `project_main` VALUES ('001', '河南手表', '100000', '001', '2019-04-29', '2019-04-30');
INSERT INTO `project_main` VALUES ('002', '新项目', null, null, '2019-04-30', '2019-04-30');
INSERT INTO `project_main` VALUES ('0304', 'adas', '20000', null, '2019-04-30', '2019-04-30');
