/*
Navicat MySQL Data Transfer

Source Server         : YL
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : train

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2017-02-20 20:03:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `train_info`
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info` (
  `train_no` varchar(50) NOT NULL DEFAULT '' COMMENT '车次编号',
  `start_station` varchar(50) NOT NULL COMMENT '始发站',
  `arrival_station` varchar(50) NOT NULL COMMENT '终点站',
  `start_time` varchar(50) NOT NULL COMMENT '出发时间',
  `arrival_time` varchar(50) NOT NULL COMMENT '到达时间',
  `type` varchar(50) NOT NULL COMMENT '车次类型',
  `runtime` varchar(50) NOT NULL COMMENT '运行时间',
  `mile` double NOT NULL COMMENT '里程',
  PRIMARY KEY (`train_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of train_info
-- ----------------------------
INSERT INTO `train_info` VALUES ('D211', '北京', '上海', '10:30', '17:30', '动车', '7', '1200');
INSERT INTO `train_info` VALUES ('D301', '成都', '深圳', '6:30', '15:30', '动车', '9', '2000');
INSERT INTO `train_info` VALUES ('fsadf', 'fasf', 'fsaf', 'fsdf', 'fasf', 'fasf', 'fsfd', '32');
INSERT INTO `train_info` VALUES ('K104', '北京', '成都', '8:30', '14:30', '普快', '30', '3500');
INSERT INTO `train_info` VALUES ('K109', '北京', '深圳', '10:30', '22:30', '普快', '12', '1000');
INSERT INTO `train_info` VALUES ('K501', '深圳', '成都', '12:00', '10:00', '普快', '22', '2500');
INSERT INTO `train_info` VALUES ('T105', '北京', '广州', '10:30', '20:30', '特快', '10', '1000');
INSERT INTO `train_info` VALUES ('yasf', 'fasfsd', 'fasf', 'fasdf', 'fasf', 'asfsda', 'fasf', '23');
INSERT INTO `train_info` VALUES ('yasfasdf', 'fasfd', 'fsf', 'fasdfadsf', 'ffsadf', 'asfsd', 'asdf', '213');
