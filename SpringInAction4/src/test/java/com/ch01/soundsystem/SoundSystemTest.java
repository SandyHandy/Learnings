package com.ch01.soundsystem;

import com.ch02.soundSystem.CdPlayer;
import com.ch02.soundSystem.SoundSystemConfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Get the Application Context for it to run the test
//Know the place where the Beans are defined, that is the config

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
public class SoundSystemTest {
	
	@Autowired
	public CdPlayer cdPlayer;
	
	@Test
	public void testCdPLayerCompactDisc(){
		assertNotNull(cdPlayer.getCompactDisc());
	}
}
