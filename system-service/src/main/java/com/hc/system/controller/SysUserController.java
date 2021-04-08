package com.hc.system.controller;

import com.hc.common.system.SysUser;
import com.hc.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 刘健生
 * @Date 2021-04-08 14:38
 * @Description
 */
@Controller
@RequestMapping("/sys_user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/findUser")
    @ResponseBody
    public SysUser findUser(@RequestParam("id") String userId){
        SysUser byId = sysUserService.getById(userId);
        return byId;
    }

    @RequestMapping("findUser2")
    @ResponseBody
    public SysUser findUser2(){
        SysUser byId = sysUserService.getById("018885251d08497d84a7ee9e0aa66ff6");
        return byId;
    }


}
