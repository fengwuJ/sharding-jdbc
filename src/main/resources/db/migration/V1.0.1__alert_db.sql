-- ----------------------------
-- Table structure for table_user_info
-- ----------------------------
DROP TABLE IF EXISTS `table_user_info`;
CREATE TABLE `table_user_info` (
`id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增id' ,
`user_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '注册者姓名' ,
`tel_phone`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号码，唯一' ,
`year_limit`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年限，见枚举year_limit' ,
`position`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位，见position表' ,
`company_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司名称' ,
`created_time`  datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间' ,
`updated_time`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `index_uni_user_info_tel_phone` (`tel_phone`) USING BTREE COMMENT '电话号码的唯一索引'
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='课程领取注册表'
AUTO_INCREMENT=1

;

alter table table_user_info add test_column varchar(110);