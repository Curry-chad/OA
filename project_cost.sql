/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:32:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for project_cost
-- ----------------------------
DROP TABLE IF EXISTS `project_cost`;
CREATE TABLE `project_cost` (
  `main_id` varchar(40) DEFAULT NULL,
  `cost_id` varchar(40) NOT NULL,
  `cost_expect` double DEFAULT NULL,
  `cost_fact` double DEFAULT NULL,
  PRIMARY KEY (`cost_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of project_cost
-- ----------------------------
INSERT INTO `project_cost` VALUES ('001', '001', '1000', '2000');
