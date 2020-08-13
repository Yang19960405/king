package com.yh.king.controller;


import com.yh.king.model.auto.UmsRole;
import com.yh.king.service.IUmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
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
@RestController
@RequestMapping("/umsrole")
@Api(value = "用户角色类")
public class UmsRoleController {

    @Autowired
    private IUmsRoleService umsRoleService;

    @GetMapping("/getUmsPole")
    @ApiOperation(value = "获取所有用户角色信息",notes = "返回角色List")
//    @ApiImplicitParam(paramType = "query",name="getUmsRole",value = "角色",required = true)
//    @ApiResponse(code = 400,message = "请求失败",response = String.class)
    public List<UmsRole> getUmsRole(){
        return umsRoleService.list();
    }
}
