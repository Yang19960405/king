package com.yh.king.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName(value = "ums_admin")
public class UserAdmin {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String icon;

    private String email;

    private String nick_name;

    private String note;

    private Date create_time;

    private Date login_time;

    private Integer status;

}
