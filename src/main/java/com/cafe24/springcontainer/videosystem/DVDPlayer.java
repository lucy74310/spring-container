package com.cafe24.springcontainer.videosystem;


//자동아니라서 컴포넌트 및 오토와이어드 못붙인당...
public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
		
	}
	
	public void play() {
		dvd.play();
	}

	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	
	
	
}
