package com.itheima.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.itheima.po.IdCard;
import com.itheima.po.Orders;
import com.itheima.po.Person;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;

public class MybatisAssociatedTest {
	
	
	
	@Test
	public void findOrdersTest(){
		SqlSession session=MybatisUtils.getSession();
		
		Orders orders=session.selectOne("com.itheima.mapper."+"OrdersMapper.findOrdersWithProduct",1);
		System.out.println(orders);
		session.close();
		
	}
	
/*34
	@Test
	public void findUserTest(){
		SqlSession session=MybatisUtils.getSession();
		
		User user=session.selectOne("com.itheima.mapper."+"UserMapper.findUserWithOrders",1);
		System.out.println(user);
		session.close();
		
	}
*/
	/*2
	@Test
	public void findPersonByIdTest2(){
		SqlSession session=MybatisUtils.getSession();
		
		Person person=session.selectOne("com.itheima.mapper."+"PersonMapper.findPersonById2",1);
		System.out.println(person);
		session.close();
	}
	*/
	
	/*1
@Test
public void findPersonByIdTest(){
	SqlSession session=MybatisUtils.getSession();
	
	Person person=session.selectOne("com.itheima.mapper."+"PersonMapper.findPersonById",1);
	System.out.println(person);
	session.close();
}
*/


}
