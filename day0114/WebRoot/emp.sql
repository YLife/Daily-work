/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2017-01-13 17:14:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(5) NOT NULL AUTO_INCREMENT,
  `ename` varchar(20) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `sal` float DEFAULT NULL,
  `comm` float DEFAULT NULL,
  `mgr` int(5) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `deptno` int(5) DEFAULT NULL,
  PRIMARY KEY (`empno`),
  KEY `fk_dept_no` (`deptno`),
  CONSTRAINT `fk_dept_no` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=7955 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('7369', 'SMITH', 'CLERK', '2000', null, null, '1988-09-10', '20');
INSERT INTO `emp` VALUES ('7499', 'ALLEN', 'SALESMAN', '1605', null, null, '1981-02-20', '10');
INSERT INTO `emp` VALUES ('7521', 'WARD', 'SALESMAN', '1250', '500', '7698', '1981-02-22', '30');
INSERT INTO `emp` VALUES ('7566', 'JONES', 'MANAGER', '2000', null, null, '1981-04-02', '20');
INSERT INTO `emp` VALUES ('7654', 'MARTIN', 'SALESMAN', '1250', '1400', '7698', '1981-09-28', '30');
INSERT INTO `emp` VALUES ('7698', 'BLAKE', 'MANAGER', '2855', null, '7839', '1981-05-01', '30');
INSERT INTO `emp` VALUES ('7782', 'CLARK', 'MANAGER', '2450', null, '7839', '1981-06-09', '10');
INSERT INTO `emp` VALUES ('7788', 'SCOTT', 'ANALYST', '3000', null, '7566', '1987-04-19', '20');
INSERT INTO `emp` VALUES ('7839', 'KING', 'PRESIDENT', '5000', null, null, '1981-11-17', '10');
INSERT INTO `emp` VALUES ('7844', 'TURNER', 'SALESMAN', '1500', '0', '7698', '1981-09-08', '30');
INSERT INTO `emp` VALUES ('7876', 'ADAMS', 'CLERK', '1100', null, '7788', '1987-05-23', '20');
INSERT INTO `emp` VALUES ('7900', 'JAMES', 'CLERK', '950', null, '7698', '1981-12-03', '30');
INSERT INTO `emp` VALUES ('7902', 'FORD', 'ANALYST', '3002', null, null, '1981-12-03', '20');
INSERT INTO `emp` VALUES ('7934', 'MILLER', 'CLERK', '1300', null, '7782', '1982-01-23', '10');
INSERT INTO `emp` VALUES ('7946', '张三', null, null, null, null, null, '46');
INSERT INTO `emp` VALUES ('7947', '张三', null, null, null, null, null, '47');
INSERT INTO `emp` VALUES ('7949', '张三', null, null, null, null, null, '49');
INSERT INTO `emp` VALUES ('7950', '张三', null, null, null, null, null, '50');
INSERT INTO `emp` VALUES ('7952', 'hello', null, null, null, null, null, '51');
INSERT INTO `emp` VALUES ('7953', 'hello', null, null, null, null, null, '52');
INSERT INTO `emp` VALUES ('7954', 'hello', null, null, null, null, null, '53');
