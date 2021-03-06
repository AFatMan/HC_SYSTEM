package com.hc.common.system;

import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName sys_dictionaries
 */
@Data
public class SysDictionaries implements Serializable {
    /**
     * 
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String dictionariesId;

    /**
     * 名称
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String name;

    /**
     * 英文
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String nameEn;

    /**
     * 编码
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String bianma;

    /**
     * 排序
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private Integer orderBy;

    /**
     * 上级ID
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String parentId;

    /**
     * 备注
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String bz;

    /**
     * 排查表
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String tbsname;

    /**
     * 
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String tbfield;

    /**
     * 
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private String yndel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dictionaries
     *
     * @mbg.generated 2021-04-08 14:13:52
     */
    private static final long serialVersionUID = 1L;
}