/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : production_ssm

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 27/04/2019 19:35:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement`  (
  `announcement_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `announcement_text` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `announcement_date` datetime(0) NULL DEFAULT NULL,
  `emp_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`announcement_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES ('001', '全体成员，今天下午两点开会', '2019-04-27 16:51:53', NULL);
INSERT INTO `announcement` VALUES ('002', '@全体成员，今天下午放假', '2019-04-27 00:00:00', NULL);

SET FOREIGN_KEY_CHECKS = 1;
