package com.ch01.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/minstrelCh01.xml");
		Knight knight = (Knight)applicationContext.getBean("knight");
		knight.embarkOnQuest();

	}

}
