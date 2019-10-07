package com.niit.projectbackend;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.config.AppContext;
import com.niit.dao.userdao;
import com.niit.model.User;

@RunWith(SpringRunner.class) 
@SpringJUnitConfig (classes=AppContext.class)
public class UserTestcase {
	
	@Autowired
	userdao userdao;
	
	@Before
	public void setup() throws Exception{
		
	}
	@After
	public void tearDown() throws Exception {
		
	}
    @Ignore
    @Test
    public void userListTest() {
    	
    List<User>getUserList =userdao.getUserList();
     assertEquals(5, getUserList.size());
    }
   
   @Test
   public void addUser() {
	   User user =new User();
	   user.setUsername("Jhon");
	   user.setPassword("12345");
	   user.setPhone_number("1234567890");
	   
	   assertEquals(true, userdao.createUser(user));
	   
   }
   @Ignore
   @Test(expected= IndexOutOfBoundsException.class)
   public void updateUser() {
		User user = userdao.getUserById("S001");
		user.setPhone_number("9820704323");
		assertEquals(true, userdao.updateUser(user));
	}
   @Ignore
	@Test
	public void deleteUser() {
		assertEquals(true, userdao.deleteUser(1));
	}
   
   }  
   
	   
	   
   
   

