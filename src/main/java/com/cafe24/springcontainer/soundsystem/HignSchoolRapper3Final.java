package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;
// Implicit 방식임
//@Component
@Named("hignSchoolRapper3Final")
public class HignSchoolRapper3Final implements CompactDisc {
	
	private String title = "지구멸망";
	private String artist = "양승호";
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist );

	}

}
