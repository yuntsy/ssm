package com.itheima.test;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

import com.itheima.po.Customer;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;



public class MybatisTest {
	
	
	/*bind
	  @Test
	  public void findCustomerByNameTest(){
		  SqlSession session=MybatisUtils.getSession();
		  Customer customer=new Customer();
		  customer.setUsername("j");
		  List<Customer> customers=session.selectList("com.itheima.mapper" + ".CustomerMapper.findCustomerByName",customer);
	    	for(Customer customer2:customers){
	    		System.out.println(customer2);
	    	}
	    	session.close();
	  }
	*/
	
	
	/*foreach
	  @Test
		 
	  public void findCustomerByIdsTest(){
	    	SqlSession session=MybatisUtils.getSession();
	    	List<Integer> ids=new ArrayList<Integer>();
	    	ids.add(1);
	    	ids.add(2);
	   
	    	List<Customer> customers=session.selectList("com.itheima.mapper" + ".CustomerMapper.findCustomerByIds",ids);
	    	for(Customer customer:customers){
	    		System.out.println(customer);
	    	}
	    	session.close();
	 }
	*/
	
	/*set
	@Test
	public void updateCustomerTest(){
		SqlSession sqlSession=MybatisUtils.getSession();
	 

   Customer customer = new Customer();
   customer.setId(3);
   customer.setPhone("13311111234"); 
   int rows = sqlSession.update("com.itheima.mapper"
         + ".CustomerMapper.updateCustomer", customer);
   if(rows>0){
	   System.out.println("您成功修改了"+rows+"条数据!");
   }
   else {
	   System.out.println("执行修改操作失败!!!");
   }
   sqlSession.commit();
   sqlSession.close();
}
	*/
	
/*if
	  @Test
	 
	  public void findCustomerByNameAndJobsTest(){
	    	SqlSession session=MybatisUtils.getSession();
	    	Customer customer=new Customer();
	    	customer.setUsername("jack");
	    	customer.setJobs("teacher");
	    	List<Customer> customers=session.selectList("com.itheima.mapper" + ".CustomerMapper.findCustomerByNameAndJobs",customer);
	    	for(Customer customer2:customers){
	    		System.out.println(customer2);
	    	}
	    	session.close();
	 }
	*/
	
	/*
	@Test
	  public void findCustomerByNameOrJobsTest(){
	    	SqlSession session=MybatisUtils.getSession();
	    	Customer customer=new Customer();
	    	customer.setUsername("jack");
	    	customer.setJobs("teacher");
	    	List<Customer> customers=session.selectList("com.itheima.mapper" + ".CustomerMapper.findCustomerByNameOrJobs",customer);
	    	for(Customer customer2:customers){
	    		System.out.println(customer2);
	    	}
	    	session.close();
	 }
	*/
	
	
	/*
	 @Test
	  public void findAllUserTest(){
	    	SqlSession sqlSession=MybatisUtils.getSession();
	    	List<User> list=sqlSession.selectList("com.itheima.mapper.UserMapper.findAllUser");
	    	for(User user:list){
	    		System.out.println(user);
	    	}
	    	sqlSession.close();
	 }
	*/
	
	/*
	 @Test
	  public void findCustomerByIdTest(){
	    	SqlSession sqlSession=MybatisUtils.getSession();
	    	Customer customer=sqlSession.selectOne("com.itheima.mapper"+".CustomerMapper.findCustomerById",1);
	    	System.out.println(customer.toString());
	    	sqlSession.close();
	 }

	*/
	
	
    /*@Test
  public void addCustomerTest(){
    	SqlSession sqlSession=MybatisUtils.getSession();
    	Customer customer=new Customer();
    	customer.setUsername("rose");
    	customer.setJobs("student");
    	customer.setPhone("1332");
    	 int rows = sqlSession.insert("com.itheima.mapper" + ".CustomerMapper.addCustomer", customer);
    	 System.out.println(customer.getId());
         if(rows>0){
      	   System.out.println("您成功插入了"+rows+"条数据!");
         }
         else {
      	   System.out.println("执行插入操作失败!!!");
         }
         sqlSession.commit();
         sqlSession.close();
    }
    
    */
 
    //查找
   /* public void findCustomerByIdTest() throws Exception {		                     
            String resource = "mybatis-config.xml";
InputStream inputStream = Resources.getResourceAsStream(resource);
SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream); 	
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<Customer> customers=sqlSession.selectList("com.itheima.mapper"  + ".CustomerMapper.findCustomerByName","j");
            for(Customer customer : customers){
            	System.out.println(customer);
            }
            
            
//Customer customer = sqlSession.selectOne("com.itheima.mapper"  + ".CustomerMapper.findCustomerById", 1); 	     System.out.println(customer.toString()); 
//sqlSession.close();
 * 
 * 
    }
    */
    
    //插入
   /* public void addCustomerTest() throws Exception{
    	
    	 String resource = "mybatis-config.xml";
    	 InputStream inputStream = Resources.getResourceAsStream(resource);
    	 SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream); 	
    	             SqlSession sqlSession = sqlSessionFactory.openSession();
    	             
        Customer customer = new Customer();
        customer.setUsername("rose");
        customer.setJobs("student");
        customer.setPhone("13333533092");
        int rows = sqlSession.insert("com.itheima.mapper" + ".CustomerMapper.addCustomer", customer);
       if(rows>0){
    	   System.out.println("您成功插入了"+rows+"条数据!");
       }
       else {
    	   System.out.println("执行插入操作失败!!!");
       }
       sqlSession.commit();
       sqlSession.close();
}
*/
    
    //修改
   /* public void updateCustomerTest() throws Exception{
    	
    	 String resource = "mybatis-config.xml";
    	 InputStream inputStream = Resources.getResourceAsStream(resource);
    	 SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream); 	
    	             SqlSession sqlSession = sqlSessionFactory.openSession();
    	             
        Customer customer = new Customer();
        customer.setId(4);
        customer.setUsername("rose");
        customer.setJobs("programmer");
        customer.setPhone("13311111111"); 
        int rows = sqlSession.update("com.itheima.mapper"
              + ".CustomerMapper.updateCustomer", customer);
        if(rows>0){
     	   System.out.println("您成功修改了"+rows+"条数据!");
        }
        else {
     	   System.out.println("执行修改操作失败!!!");
        }
        sqlSession.commit();
        sqlSession.close();
}
*/
    //删除
  /*  public void deleteCustomerTest() throws Exception{
    	
    	String resource = "mybatis-config.xml";
   	 InputStream inputStream = Resources.getResourceAsStream(resource);
   	 SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream); 	
   	             SqlSession sqlSession = sqlSessionFactory.openSession();
   	             
        int rows = sqlSession.delete("com.itheima.mapper"
                         + ".CustomerMapper.deleteCustomer", 4);
        if(rows>0){
      	   System.out.println("您成功删除了"+rows+"条数据!");
         }
         else {
      	   System.out.println("执行删除操作失败!!!");
         }
         sqlSession.commit();
         sqlSession.close();
}
    */

}
