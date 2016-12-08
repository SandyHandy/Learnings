package com.ds.chap02;

public class HighArrayApp {
	
	public static void main(String args[]){
		HighArray highArray = new HighArray(30);
		highArray.display();
		highArray.insert(4);
		highArray.insert(45);
		highArray.insert(33);
		highArray.insert(4);
		highArray.insert(3454);
		highArray.insert(6);
		highArray.insert(4);
		highArray.insert(4);
		highArray.insert(4);
		highArray.insert(4);
		highArray.insert(88);
		highArray.insert(4);
		highArray.insert(3);
		highArray.display();
		System.out.println("Size: " + highArray.size());
		
		System.out.println("Finding 45 = " +highArray.find(45));
		
	
		highArray.delete(33);
		System.out.println("Size: " + highArray.size());
		
		highArray.display();
		
		
		
	/*	HighNoDupsArrays highNoDupsArrays = new HighNoDupsArrays(20);
		highNoDupsArrays.display();
		highNoDupsArrays.insert(4);
		highNoDupsArrays.insert(3);
		highNoDupsArrays.insert(45);
		highNoDupsArrays.insert(33);
		highNoDupsArrays.insert(33);
		highNoDupsArrays.insert(6);
		highNoDupsArrays.insert(6);
		highNoDupsArrays.insert(4);
		highNoDupsArrays.insert(88);
		
		highNoDupsArrays.display();
		highNoDupsArrays.delete(4);
		highNoDupsArrays.display();*/
	}

}
