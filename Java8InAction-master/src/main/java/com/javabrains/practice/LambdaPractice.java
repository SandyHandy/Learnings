package com.javabrains.practice;

import java.util.function.Predicate;

public class LambdaPractice {

	public static void main(String[] args) {
	
		MyTestLambda myTestLambda = ()->System.out.println("Checking the Lambda Interface");
		myTestLambda.something();
	}
	
	
	

}

@FunctionalInterface
interface MyTestLambda{
	public void something();
}