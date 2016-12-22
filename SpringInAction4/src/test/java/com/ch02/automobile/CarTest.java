package com.ch02.automobile;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {VehicleConfig.class, com.ch02.soundSystem.SoundSystemConfig.class } )
public class CarTest {
	@Autowired
	public Car sorento;

	@Test
	public void testCar(){
	assertSame(sorento.getColor(), "red");	
	assertSame(sorento.getSeats().get(1).getCategory(), "normal");
	}
}
