package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

import config.videosystem.DVDPlayerConfig;

/*
 * explicit Configuration - JavaConfig
 * Component Scanning(@Component(= @Named ), @Autowired( = @Inject) )
 * @Named랑 @Injection은 스프링 종속이 아니라 자바표준- 용도는 똑같 (스프링 스페셜)  
 * 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DVDPlayerConfig.class)
public class DVDPlayerJavaConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player;
	
	@Test
	public void testDVDNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNull() {
		assertNotNull(player);
	}
	
	@Test
	public void testPaly() {
		player.play();
		
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n","").replace("\n", ""));
		
		
	}
}
