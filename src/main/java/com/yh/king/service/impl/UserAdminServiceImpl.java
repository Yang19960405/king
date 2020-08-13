package com.yh.king.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yh.king.mapper.auto.UserAdminMapper;
import com.yh.king.model.UserAdmin;
import com.yh.king.service.IUserAdminService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
@Transactional
public class UserAdminServiceImpl extends ServiceImpl<UserAdminMapper, UserAdmin> implements IUserAdminService {
}
