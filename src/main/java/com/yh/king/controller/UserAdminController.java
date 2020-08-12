package com.yh.king.controller;

import com.yh.king.model.UserAdmin;
import com.yh.king.service.IUserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserAdmin")
public class UserAdminController {
    @Autowired
    private IUserAdminService userAdminService;

    @GetMapping("/getAll")
    public List<UserAdmin> getAllUserAdmin(){
        return userAdminService.list();
    }
}
