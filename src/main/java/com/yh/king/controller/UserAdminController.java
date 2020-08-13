package com.yh.king.controller;

import com.yh.king.model.UserAdmin;
import com.yh.king.service.IUserAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserAdmin")
@Api(value = "管理员用户类")
public class UserAdminController {
    @Autowired
    private IUserAdminService userAdminService;

    @GetMapping("/getAll")
    @ApiOperation(value = "获取所有管理员信息",notes = "返回管理员List")
//    @ApiImplicitParam(paramType = "query",name="getAllUserAdmin",value = "管理员",required = true)
//    @ApiResponse(code = 400,message = "请求失败",response = String.class)
    public List<UserAdmin> getAllUserAdmin(){
        return userAdminService.list();
    }
}
