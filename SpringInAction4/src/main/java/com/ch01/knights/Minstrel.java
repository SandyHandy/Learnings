package com.ch01.knights;

import java.io.PrintStream;

public class Minstrel {
	
	private PrintStream stream;
	
	public Minstrel(PrintStream stream){
		this.stream=stream;
	}
	
	public void singBeforeQuest(){
		stream.println("Sing Before Embark");
	}
	
	public void singAfterQuest() {
		stream.println("Sing after Embark");
	}

}
