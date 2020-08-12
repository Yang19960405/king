package com.yh.king.controller;


import com.yh.king.model.auto.UmsRole;
import com.yh.king.service.IUmsRoleService;
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
public class UmsRoleController {

    @Autowired
    private IUmsRoleService umsRoleService;

    @GetMapping("/getUmsPole")
    public List<UmsRole> getUmsRole(){
        return umsRoleService.list();
    }
}
