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

 Date: 27/04/2019 19:35:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for technology
-- ----------------------------
DROP TABLE IF EXISTS `technology`;
CREATE TABLE `technology`  (
  `technology_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `technology_type` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `technology_theme` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `technology_date` datetime(0) NULL DEFAULT NULL,
  `emp_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `technology_note` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `technology_file` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`technology_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of technology
-- ----------------------------
INSERT INTO `technology` VALUES ('001', '财务', '第一季度', '2019-04-25 16:47:54', 'chad', '第二季度财务报表', NULL);
INSERT INTO `technology` VALUES ('002', 'efhs', 'hef', '2019-04-25 00:00:00', NULL, 'heufhus&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;', NULL);
INSERT INTO `technology` VALUES ('2432422', 'w3w', 'wrewe', '2019-04-27 00:00:00', NULL, 'werwr', NULL);
INSERT INTO `technology` VALUES ('asfas', '阿斯弗', 'sfs', '2019-04-25 00:00:00', NULL, 'sdf', NULL);

SET FOREIGN_KEY_CHECKS = 1;
