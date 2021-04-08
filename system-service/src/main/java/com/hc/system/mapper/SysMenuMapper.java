package com.hc.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.common.system.SysMenu;

/**
 * @Entity com.hc.common.system.SysMenu
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     *
     * @mbg.generated 2021-04-08 14:19:57
     */
    int deleteByPrimaryKey(Integer menuId);

    /**
     *
     * @mbg.generated 2021-04-08 14:19:57
     */
    int insert(SysMenu record);

    /**
     *
     * @mbg.generated 2021-04-08 14:19:57
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbg.generated 2021-04-08 14:19:57
     */
    SysMenu selectByPrimaryKey(Integer menuId);

    /**
     *
     * @mbg.generated 2021-04-08 14:19:57
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbg.generated 2021-04-08 14:19:57
     */
    int updateByPrimaryKey(SysMenu record);
}