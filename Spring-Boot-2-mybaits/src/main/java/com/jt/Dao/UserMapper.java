package com.jt.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;
//将mapper接口交给spring管理

public interface UserMapper extends BaseMapper<User> {
@Select("select * from user")
List<User>findAll();

void insertUser(User user);
}
