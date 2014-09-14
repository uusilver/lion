/*
Navicat MySQL Data Transfer

Source Server         : yyyyf
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : lion

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2014-09-14 13:03:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------

-- ----------------------------
-- Table structure for `m_agent_code`
-- ----------------------------
DROP TABLE IF EXISTS `m_agent_code`;
CREATE TABLE `m_agent_code` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `AGENT_ID` varchar(20) NOT NULL,
  `AGENT_CODE` varchar(11) NOT NULL,
  `AGENT_ACCOUNT` varchar(255) DEFAULT NULL,
  `AGENT_ACCOUNT_TYPE` varchar(10) DEFAULT NULL,
  `A_REMARKS1` varchar(100) DEFAULT NULL,
  `A_REMARKS2` varchar(100) DEFAULT NULL,
  `A_REMARKS3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_agent_code
-- ----------------------------
INSERT INTO `m_agent_code` VALUES ('21', '21', '21ub', 'zfb13851483034', '支付宝', null, null, null);

-- ----------------------------
-- Table structure for `m_agent_tb`
-- ----------------------------
DROP TABLE IF EXISTS `m_agent_tb`;
CREATE TABLE `m_agent_tb` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `A_NAME` varchar(20) NOT NULL,
  `A_TELNO` varchar(11) NOT NULL,
  `A_ADDDATE` date NOT NULL,
  `A_EDITDATE` date NOT NULL,
  `A_SEX` char(1) DEFAULT NULL,
  `A_AGE` int(3) DEFAULT NULL,
  `A_LOCATE` varchar(100) DEFAULT NULL,
  `A_UNIVERSITY` varchar(100) DEFAULT NULL,
  `A_LEVEL` varchar(3) DEFAULT NULL,
  `A_REMARKS1` varchar(100) DEFAULT NULL,
  `A_REMARKS2` varchar(100) DEFAULT NULL,
  `A_REMARKS3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_agent_tb
-- ----------------------------
INSERT INTO `m_agent_tb` VALUES ('21', '李俊英', '13851483034', '2014-08-29', '2014-08-29', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `m_product`
-- ----------------------------
DROP TABLE IF EXISTS `m_product`;
CREATE TABLE `m_product` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(40) NOT NULL,
  `pro_type` varchar(20) NOT NULL,
  `pro_org_price` varchar(10) NOT NULL,
  `pro_cur_price` varchar(10) NOT NULL,
  `pro_vip_price` varchar(10) NOT NULL,
  `pro_mem_price` varchar(10) NOT NULL,
  `pro_store_nums` int(11) NOT NULL,
  `pro_img_adr` varchar(300) NOT NULL,
  `pro_detail_table_name` varchar(30) NOT NULL,
  `pro_order_seq` int(11) NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_product
-- ----------------------------

-- ----------------------------
-- Table structure for `m_pro_detail`
-- ----------------------------
DROP TABLE IF EXISTS `m_pro_detail`;
CREATE TABLE `m_pro_detail` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `pro_id` int(20) NOT NULL,
  `pro_desc` varchar(1000) NOT NULL,
  `pro_detail_img_adr_list` varchar(300) NOT NULL,
  `pro_sold_nums` int(11) NOT NULL,
  `pro_comments_table_name` varchar(50) NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_pro_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `m_user`
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(6) NOT NULL,
  `user_pwd` varchar(32) NOT NULL,
  `reg_date` date NOT NULL,
  `tel_no` mediumtext NOT NULL,
  `email_adr` varchar(32) DEFAULT NULL,
  `user_lvl` int(11) DEFAULT NULL,
  `user_type` varchar(3) DEFAULT NULL,
  `willing_cart_table_name` varchar(20) DEFAULT NULL,
  `user_history_table_name` varchar(100) DEFAULT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_user
-- ----------------------------

-- ----------------------------
-- Table structure for `pro_comments`
-- ----------------------------
DROP TABLE IF EXISTS `pro_comments`;
CREATE TABLE `pro_comments` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `pro_id` int(20) NOT NULL,
  `user_id` int(20) NOT NULL,
  `stars` varchar(10) NOT NULL,
  `comments` varchar(60) NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_comments
-- ----------------------------

-- ----------------------------
-- Table structure for `user_act_histoty`
-- ----------------------------
DROP TABLE IF EXISTS `user_act_histoty`;
CREATE TABLE `user_act_histoty` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `search_key_his` varchar(500) NOT NULL,
  `vis_page_his` varchar(300) NOT NULL,
  `vis_time_his` varchar(300) NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_act_histoty
-- ----------------------------

-- ----------------------------
-- Table structure for `user_order`
-- ----------------------------
DROP TABLE IF EXISTS `user_order`;
CREATE TABLE `user_order` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `status` int(2) NOT NULL,
  `shipping_order` varchar(20) NOT NULL,
  `return_flag` char(1) NOT NULL,
  `return_caused_by` varchar(50) NOT NULL,
  `eve_img_1` varchar(10) NOT NULL,
  `eve_img_2` varchar(10) NOT NULL,
  `eve_img_3` varchar(10) NOT NULL,
  `order_total_price` varchar(10) NOT NULL,
  `address_id` int(20) NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_order
-- ----------------------------

-- ----------------------------
-- Table structure for `user_shipping_adr`
-- ----------------------------
DROP TABLE IF EXISTS `user_shipping_adr`;
CREATE TABLE `user_shipping_adr` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `ship_adr_info` varchar(100) NOT NULL,
  `default_flag` char(1) NOT NULL,
  `add_date` date NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_shipping_adr
-- ----------------------------

-- ----------------------------
-- Table structure for `user_willing_cart1`
-- ----------------------------
DROP TABLE IF EXISTS `user_willing_cart1`;
CREATE TABLE `user_willing_cart1` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `cart_content` varchar(1000) NOT NULL,
  `add_date` date NOT NULL,
  `remarks1` varchar(100) DEFAULT NULL,
  `remarks2` varchar(100) DEFAULT NULL,
  `remarks3` varchar(100) DEFAULT NULL,
  `remarks4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_willing_cart1
-- ----------------------------
