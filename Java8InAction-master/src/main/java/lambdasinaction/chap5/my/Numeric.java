package lambdasinaction.chap5.my;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import lambdasinaction.chap4.my.Dish;

public class Numeric {
	
	public static void main(String[] args) {
		// Streams provide 3 specilized primitive streams, IntStream, doubleStream, logSteram
		int calories = Dish.menu.stream() //returns Stream<T>
				.mapToInt(Dish::getCalories) //returns intStream
				.sum();
		OptionalInt caloriesMax = Dish.menu.stream() //returns Stream<T>
				.mapToInt(Dish::getCalories) //returns intStream
				.max();
		OptionalDouble caloriesAvg = Dish.menu.stream() //returns Stream<T>
				.mapToInt(Dish::getCalories) //returns intStream
				.average();
		// range of 1 to 100 number that are divisible by 2
		
		IntStream evenNumbers = IntStream.rangeClosed(1, 100)
				.filter(n->n%2==0);
		evenNumbers.forEach(System.out::println);
	}
	

}
