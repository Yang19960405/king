package com.yh.king.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yh.king.model.UserAdmin;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-08-12
 */
@Mapper
public interface IUserAdminService extends IService<UserAdmin> {

}
