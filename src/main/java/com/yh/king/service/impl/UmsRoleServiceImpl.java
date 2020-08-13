package com.yh.king.service.impl;

import com.yh.king.model.auto.UmsRole;
import com.yh.king.mapper.auto.UmsRoleMapper;
import com.yh.king.service.IUmsRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-08-12
 */
@Service
@Primary
@Transactional
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper, UmsRole> implements IUmsRoleService {

}
