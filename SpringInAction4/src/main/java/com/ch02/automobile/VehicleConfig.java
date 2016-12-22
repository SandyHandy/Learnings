package com.ch02.automobile;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan//(basePackages = {"com.ch02"})
public class VehicleConfig {
	
	@Bean(name = "sorento")
	public Car car(){
		Car car =new Car();
		car.setColor("red");
		car.setSeats(Arrays.asList(seat(), seatBack()));
		return car;
		
	}
	
	@Bean(name="frontSeat")
	public Seat seat(){
		Seat seat = new Seat();
		seat.setCategory("luxury");
		seat.setColor("black");
		seat.setGrade(1);
		return seat;
	}

	@Bean(name="backSeat")
	public Seat seatBack(){
		Seat seat = new Seat();
		seat.setCategory("normal");
		seat.setColor("black");
		seat.setGrade(2);
		return seat;
	}
}
