package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	
	// 와이어링01 ( AutoWring이 방법이 하나만 있는게 아님)
	//@Autowired
	private CompactDisc cd;
	
	// 기본생성자가 없으면 있는 생성자 사용.
	// 생성자 두개이면 기본 생성자 사용 
	public CDPlayer() {
		
	}
	
	// 와이어링02
	// 항상 이 생성자를 가지고 실행. 자바스럽?
	//@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	
	// 와이어링03
	// 항상 이 생성자를 가지고 실행. 자바스럽?
	//@Autowired 
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	// 와이어링04
	@Autowired
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	
	public void play() {
		cd.play();
	}
}
