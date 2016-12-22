package com.ch02.soundSystem;

import org.springframework.stereotype.Component;

@Component
public class SirisCompactDisc implements CompactDisc {

	public void play() {
		System.out.println("The song is played by the SirisCompactDisc");

	}

}
