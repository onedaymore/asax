package com.xin.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cim.xin.domain.User;
import cim.xin.service.UserService;

public class UserServiceTest extends SpringTestCase {
	
	@Autowired  
	private UserService userService;
	 
	Logger logger = Logger.getLogger(UserServiceTest.class);
	 
	@Test  
	public void selectUserByIdTest(){  
	    User user = userService.selectUserById(10);  
	    logger.debug("²éÕÒ½á¹û" + user);  
	}  
}
