package com.hc.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.common.system.SysUser;

/**
 * @Entity com.hc.common.system.SysUser
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     *
     * @mbg.generated 2021-04-08 14:23:29
     */
    int deleteByPrimaryKey(String userId);

    /**
     *
     * @mbg.generated 2021-04-08 14:23:29
     */
    int insert(SysUser record);

    /**
     *
     * @mbg.generated 2021-04-08 14:23:29
     */
    int insertSelective(SysUser record);

    /**
     *
     * @mbg.generated 2021-04-08 14:23:29
     */
    SysUser selectByPrimaryKey(String userId);

    /**
     *
     * @mbg.generated 2021-04-08 14:23:29
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @mbg.generated 2021-04-08 14:23:29
     */
    int updateByPrimaryKey(SysUser record);
}