/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : production_ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-01 21:31:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for found
-- ----------------------------
DROP TABLE IF EXISTS `found`;
CREATE TABLE `found` (
  `found_id` varchar(40) NOT NULL,
  `found_text` varchar(500) DEFAULT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `found_date` datetime DEFAULT NULL,
  PRIMARY KEY (`found_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of found
-- ----------------------------
INSERT INTO `found` VALUES ('001', '遗失一副眼镜', '001', '2019-04-30 15:09:51');
