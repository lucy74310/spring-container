package com.cafe24.springcontainer.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=UserConfig01.class)
public class UserTest {
	
	@Autowired
	private User user;
	
	
	//러너가 @Test실행
	@Test
	public void testUser() {
		assertNotNull(user);
		
	}
}
