package com.example.sharding.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 课程领取注册表
 *
 * @author Apollo Jiang
 * @date 2022-10-5
 */
@Entity
@Data
@Table(name = "table_user_info")
public class TableUserInfo {
    /**
     * 自增id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 注册者姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 电话号码，唯一
     */
    @Column(name = "tel_phone")
    private String telPhone;

    /**
     * 年限，见枚举year_limit
     */
    @Column(name = "year_limit")
    private String yearLimit;

    /**
     * 职位，见position表
     */
    @Column(name = "position")
    private String position;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 创建时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    
}