package com.jt;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jt.Dao.UserMapper;
import com.jt.pojo.User;

@SpringBootTest//住启动类的操作 包含包扫描
@RunWith(SpringRunner.class)//类加载机制  像main方法
public class TestMybatisPlus {
   
	
//	@Test
//	public void testSelectOne() {
//	   int id=54;
//	   User user=userMapper.selectById(id);
//	   System.out.println(user);
//	   //根据非主键查询 queryWrapper条件构造器
//	   	QueryWrapper<User>queryWrapper
//	   	=new QueryWrapper<>();
//	   	queryWrapper.eq("name","mybatispuls入库");
//	   	User user2=userMapper.selectOne(queryWrapper);
//	   	System.out.println(user2);
//}
//	@Test
//	public void testList() {
//		//1.查询全部列表数据  不需要where条件
//		List<User> userList = userMapper.selectList(null);
//		System.out.println(userList);
//	
//	QueryWrapper<User>queryWrapper=new QueryWrapper<User>();
//	queryWrapper.ge("age",18)
//	            .eq("sex","女");
//	List<User> userAgeList =
//			userMapper.selectList(queryWrapper);
//	System.out.println(userAgeList);
	
	
//	
//	
//	//3查询年龄为18岁并且性别为女
//	User user3=new User();
//	user3.setAge(18).setSex("女");
//	QueryWrapper<User>quertWrapper3
//	=new QueryWrapper<User>(user3);
//	List<User>userList3=userMapper.selectList(quertWrapper3);
//	System.out.println(userList3);
//	}


/**
 * 关于更新操作的总结:
 * 如果更新操作是根据主键封信使用ById()
 * 如果更新操作中where条件有多个时或者更新没有主键时
 * 使用UpdatMapper
 * 
 * 
 * */
//    @Test
//    public void testUpdataUser() {
//    	User user=new User();
//    	user.setId(54).setName("黑寡妇")
//    	    .setAge(25).setSex("女");
//    	int rows=userMapper.updateById(user);
//    	System.out.println("影响行数"+rows+"行!");
//      
//    	User user2=new User();
//    	user2.setName("绿巨人")
//    	     .setAge(35)
//    	     .setSex("男");
//    	UpdateWrapper<User>updateWrapper
//    	=new UpdateWrapper<>();
//    	updateWrapper.eq("id",55);
//    	int rows2=userMapper.update(user2, updateWrapper);
//    	System.out.println("条件构造器更新"+rows2);
//    } 	     
    /**
     * 删除操作
     * 需求:将id=56行删除
     * 需求2:将年龄为2的删除
     * 需求3:批量删除55.56.57
     * */
	@Autowired
    private UserMapper userMapper;
    @Test 
    //1删除id=56的数据
    public void testDeleteUser() {
    	
    userMapper.deleteById(56);
    System.out.println("删除数据库成功");
   //2.删除年龄为2的数据
    QueryWrapper<User>queryWrapper=new QueryWrapper<User>();
    queryWrapper.eq("age",2);
    userMapper.delete(queryWrapper);
    System.out.println("删除2行数据成功");
   //3.批量删除数据
    Integer[]intArray= {55,56,57};
    List<Integer>idList=Arrays.asList(intArray);
    		userMapper.deleteBatchIds(idList);
    System.out.println("批量操作成功");
    
    
    
    
    }
    
    






}