package com.hc.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.common.system.SysRole;

/**
 * @Entity com.hc.common.system.SysRole
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {
    /**
     *
     * @mbg.generated 2021-04-08 11:49:20
     */
    int deleteByPrimaryKey(String roleId);

    /**
     *
     * @mbg.generated 2021-04-08 11:49:20
     */
    int insert(SysRole record);

    /**
     *
     * @mbg.generated 2021-04-08 11:49:20
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbg.generated 2021-04-08 11:49:20
     */
    SysRole selectByPrimaryKey(String roleId);

    /**
     *
     * @mbg.generated 2021-04-08 11:49:20
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbg.generated 2021-04-08 11:49:20
     */
    int updateByPrimaryKey(SysRole record);
}
