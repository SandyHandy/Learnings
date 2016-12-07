package lambdasinaction.chap6.my;

import lambdasinaction.chap6.my.MyDish;
import static java.util.stream.Collectors.counting;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyReducing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numOfDish = MyDish.menu.stream().collect(Collectors.counting());
		System.out.println("The number of Dishes = " + numOfDish);
		
		//Find the highest calory Dish
		Optional<MyDish> maxCalDish = MyDish.menu.stream().collect(Collectors.maxBy(Comparator.comparing(MyDish::getCalories)));
		maxCalDish.ifPresent(System.out::println);
		
		//find the least calories Dish
		Optional<MyDish> leastCalDish = MyDish.menu.stream().collect(Collectors.minBy(Comparator.comparing(MyDish::getCalories)));
		leastCalDish.ifPresent(System.out::println);
	}

}
