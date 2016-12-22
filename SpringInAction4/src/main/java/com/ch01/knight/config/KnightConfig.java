package com.ch01.knight.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ch01.knights.BraveKnight;
import com.ch01.knights.Knight;
import com.ch01.knights.Quest;
import com.ch01.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {
	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		return new SlayDragonQuest(System.out);
	}

}
