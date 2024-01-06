/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : caiwuguanli

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 04/07/2023 20:16:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gongjijintiqujilu
-- ----------------------------
DROP TABLE IF EXISTS `gongjijintiqujilu`;
CREATE TABLE `gongjijintiqujilu`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `yonghuid` int NULL DEFAULT NULL COMMENT '用户',
  `tiqujine` decimal(10, 2) NULL DEFAULT NULL COMMENT '提取金额',
  `tiqushijian` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '提取时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gongjijintiqujilu
-- ----------------------------
INSERT INTO `gongjijintiqujilu` VALUES (1, 1, 1000.00, '2023-07-04');
INSERT INTO `gongjijintiqujilu` VALUES (2, 1, 500.00, '2023-07-04');

-- ----------------------------
-- Table structure for gongzi
-- ----------------------------
DROP TABLE IF EXISTS `gongzi`;
CREATE TABLE `gongzi`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `yuefen` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '月份',
  `gonghao` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '工号',
  `xingming` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '姓名',
  `jibengongzi` decimal(10, 2) NULL DEFAULT NULL COMMENT '基本工资',
  `gongjijingerenjine` decimal(10, 2) NULL DEFAULT NULL COMMENT '公积金个人金额',
  `gongjijinzongjine` decimal(10, 2) NULL DEFAULT NULL COMMENT '公积金总金额',
  `shifagongzi` decimal(10, 2) NULL DEFAULT NULL COMMENT '实发工资',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gongzi
-- ----------------------------
INSERT INTO `gongzi` VALUES (1, '2023-07', '10001', '刘云', 5000.00, 500.00, 1000.00, 4500.00);
INSERT INTO `gongzi` VALUES (4, '2023-05', '10001', '刘洋', 5000.00, 500.00, 1000.00, 4500.00);
INSERT INTO `gongzi` VALUES (5, '2023-06', '10001', '刘洋', 5000.00, 500.00, 1000.00, 4500.00);
INSERT INTO `gongzi` VALUES (6, '2023-03', '10001', '刘洋', 5000.00, 500.00, 1000.00, 4500.00);
INSERT INTO `gongzi` VALUES (7, '2023-02', '10001', '刘洋', 5000.00, 500.00, 1000.00, 4500.00);

-- ----------------------------
-- Table structure for jiaofeixitong
-- ----------------------------
DROP TABLE IF EXISTS `jiaofeixitong`;
CREATE TABLE `jiaofeixitong`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `jiaofeixiangmu` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '缴费项目',
  `beizhu` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '备注',
  `yonghuid` int NULL DEFAULT NULL COMMENT '用户',
  `jiaofeijine` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '缴费金额',
  `zhuangtai` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiaofeixitong
-- ----------------------------
INSERT INTO `jiaofeixitong` VALUES (1, '停车费', '备注', 1, '1000', '已开发票');
INSERT INTO `jiaofeixitong` VALUES (2, '水费', '备注', 1, '500', '已缴费');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for xiangmushouquan
-- ----------------------------
DROP TABLE IF EXISTS `xiangmushouquan`;
CREATE TABLE `xiangmushouquan`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `xiangmumingcheng` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '项目名称',
  `beizhu` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '备注',
  `kahao` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '卡号',
  `mima` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '密码',
  `zhuangtai` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '状态',
  `jine` decimal(10, 2) NULL DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xiangmushouquan
-- ----------------------------
INSERT INTO `xiangmushouquan` VALUES (1, '项目名称', '1', '147258369', '123456', '待认领', 1000.00);
INSERT INTO `xiangmushouquan` VALUES (2, '项目名称1', '1', '123456789', '12345', '待认领', 1000.00);

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NULL DEFAULT NULL COMMENT '性别',
  `age` int NULL DEFAULT NULL COMMENT '年龄',
  `jibengongzi` decimal(10, 0) NULL DEFAULT NULL COMMENT '基本工资',
  `gongjijingerenjine` decimal(10, 0) NULL DEFAULT NULL COMMENT '公积金个人金额',
  `gongjijinzongjine` decimal(10, 0) NULL DEFAULT NULL COMMENT '公积金总金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (1, '10001', '10001', '刘洋', '男', 25, 5000, 500, 1000);

SET FOREIGN_KEY_CHECKS = 1;
