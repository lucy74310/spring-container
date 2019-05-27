package com.cafe24.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.CDPlayerConfig;

/*
 * AUTO Configuration - XML Config 
 * Component Scanning(@Component(= @Named ), @Autowired( = @Inject) )
 * @Named랑 @Injection은 스프링 종속이 아니라 자바표준- 용도는 똑같 (스프링 스페셜)  
 * 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/soundsystem/CDPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer player;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	
	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}
	
	@Test
	public void testPlay() {
		player.play();
		
		//assertEquals("", systemOutRule.getLog());
		assertEquals("Playing 지구멸망 by 양승호\r\n", systemOutRule.getLog());
		//콘솔로도 보내고 systemOutRule이 가짐
		
		
	}
	
}
