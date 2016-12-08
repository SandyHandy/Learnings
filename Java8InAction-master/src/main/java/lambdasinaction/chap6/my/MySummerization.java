package lambdasinaction.chap6.my;

import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;

public class MySummerization {
	
	public static void main(String[] args) {
		//Calculate the sum of the Menu Calories
		int calSum = MyDish.menu.stream().collect(summingInt(MyDish::getCalories));
		System.out.println("The Menu Sum = " + calSum);
		
		//Calculate the average of the Menu Calories
		//int avgOfCal = MyDish.menu.stream().collect(averagingInt(MyDish::getCalories));
		
		// Summeraize the Menu with the Cal Sum, Avg, min and Max
		IntSummaryStatistics menuStatistics = MyDish.menu.stream().collect(summarizingInt(MyDish::getCalories));
		System.out.println("Menu Summary : " + menuStatistics);
		
		//Joinig the String with Collect
		String allMemuNames = MyDish.menu.stream().map(MyDish::getName).collect(joining(","));
		System.out.println(allMemuNames);
		
		//Generalization  of the Summarization with reduction
		// total Calory 
		
			
	}


}


