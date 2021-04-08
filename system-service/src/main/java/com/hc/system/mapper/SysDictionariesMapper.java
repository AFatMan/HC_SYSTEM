package com.hc.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.common.system.SysDictionaries;

/**
 * @Entity com.hc.common.system.SysDictionaries
 */
public interface SysDictionariesMapper extends BaseMapper<SysDictionaries> {
    /**
     *
     * @mbg.generated 2021-04-08 14:11:55
     */
    int deleteByPrimaryKey(String dictionariesId);

    /**
     *
     * @mbg.generated 2021-04-08 14:11:55
     */
    int insert(SysDictionaries record);

    /**
     *
     * @mbg.generated 2021-04-08 14:11:55
     */
    int insertSelective(SysDictionaries record);

    /**
     *
     * @mbg.generated 2021-04-08 14:11:55
     */
    SysDictionaries selectByPrimaryKey(String dictionariesId);

    /**
     *
     * @mbg.generated 2021-04-08 14:11:55
     */
    int updateByPrimaryKeySelective(SysDictionaries record);

    /**
     *
     * @mbg.generated 2021-04-08 14:11:55
     */
    int updateByPrimaryKey(SysDictionaries record);
}
