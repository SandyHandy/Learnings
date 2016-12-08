package com.javabrains.practice;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run(){
				System.out.println("The runnable is nurring");
			}
		});
		
		myThread.start();
		
		Thread myThread1= new Thread(()->System.out.println("Lambda running"));
		myThread1.start();
	}
}



