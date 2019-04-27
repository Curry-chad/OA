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

 Date: 27/04/2019 19:36:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for process_document
-- ----------------------------
DROP TABLE IF EXISTS `process_document`;
CREATE TABLE `process_document`  (
  `document_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `document_type` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `document_theme` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `document_date` datetime(0) NULL DEFAULT NULL,
  `emp_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `document_note` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `document_file` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`document_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of process_document
-- ----------------------------
INSERT INTO `process_document` VALUES ('001', '会议纪要', '讨论节假日工作安排', '2019-04-25 14:01:16', NULL, '待办事项：2', '/file/随手记.txt,/file/基于BS的OA系统的设计与实现_程炜_201520182123(1).docx');
INSERT INTO `process_document` VALUES ('002', '日程安排', '计划', '2019-04-25 00:00:00', NULL, '毕业论文', '/file/基于BS的OA系统的设计与实现_程炜_201520182123.docx');
INSERT INTO `process_document` VALUES ('003', '商业计划书', '计划书', '2019-04-25 00:00:00', NULL, '商业计划书', '/file/基于BS的OA系统的设计与实现_程炜_201520182123.docx,/file/随手记(1).txt');

SET FOREIGN_KEY_CHECKS = 1;
