package com.hc.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hc.common.system.SysUser;
import com.hc.system.mapper.SysUserMapper;
import com.hc.system.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * @Author 刘健生
 * @Date 2021-04-08 14:47
 * @Description
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
