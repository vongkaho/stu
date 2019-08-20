package com.jt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.Dao.UserMapper;
import com.jt.pojo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestSpringBoot {
@Autowired
private UserMapper userMapper;
@Test
public void insert() {
	User user =new User();
	user.setId(null)
	    .setName("mubatisplus入库")
        .setAge(3)
        .setSex("男");
	int rows =userMapper.insert(user);
	System.out.println("susees影响行数"+rows);
        
}



@Test
public void testFind() {
	List<User>userList=userMapper.findAll();
	System.out.println(userList);
	System.out.println("获取代理对象的类型:"+userList);
	
}
@Test
public void insertUser() {
	User user=new User();
	user.setId(null).setName("孙杨")
	.setAge(25).setSex("爷们");
	userMapper.insertUser(user);
	System.out.println("入库成功!!!");
	
}



}
