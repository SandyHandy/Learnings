package com.ch02.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CdPlayer {
	
	private CompactDisc compactDisc;
	
	@Autowired
	public CdPlayer(CompactDisc compactDisc){
		this.compactDisc=compactDisc;
	}
	
	public CompactDisc getCompactDisc(){
		return compactDisc;
	}

}
