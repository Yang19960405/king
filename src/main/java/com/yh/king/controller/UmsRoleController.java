package com.yh.king.controller;


import com.yh.king.model.auto.UmsRole;
import com.yh.king.service.IUmsRoleService;
import com.yh.king.tool.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2020-08-12
 */
@Slf4j
@RestController
@RequestMapping("/umsrole")
@Api(value = "用户角色类")
public class UmsRoleController {

    @Autowired
    private IUmsRoleService umsRoleService;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/getUmsRole")
    @ApiOperation(value = "获取所有用户角色信息",notes = "返回角色List")
    public List<UmsRole> getUmsRole(){
        redisUtil.set("UmsRoleList1",umsRoleService.list());
        return umsRoleService.list();
    }
}
