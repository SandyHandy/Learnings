package com.ch02.automobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ch02.soundSystem.CdPlayer;

@Component
public class Car {
	
	private String color;
	@Autowired
	private CdPlayer cdPlayer;
	private List<Seat> seats;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	
	
	

}
