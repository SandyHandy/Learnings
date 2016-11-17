package lambdasinaction.chap5.my;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import lambdasinaction.chap4.my.Dish;

public class Filtering {

	public static void main(String ...args){
		
/*		Stream interface support a filtering method, which take a predicate (method or Lambda ) returning boolean
		and return a stream including all the elements that matches the predicate	
*/		
		
		// All dishes red in Color
		List<Dish> redDish = Dish.menu
				.stream().filter(d->d.getColor().equals("red"))
				.collect(toList());
		
		redDish.forEach(System.out::println);
		
		//All dishes higher than 300 Calories
		List<String> highCaloriesDish = Dish.menu
				.stream().filter(s->s.getCalories()>300)
				.map(Dish::getName)
				.collect(toList());
	
		System.out.println("********All Dish that have more than 300 Cal******");		
		highCaloriesDish.forEach(System.out::println);
		
		//All dishes that are Vegetarians
		
		List<Dish> veggieDishes = Dish.menu.stream()
				.filter(Dish::isVagetarian)
				.collect(toList());
		
		System.out.println("********All Veggie Dishes******");
		veggieDishes.forEach(System.out::println);
		
		//Filer all the unique number, divisible by 2
		List<Integer> nums = Arrays.asList(3,4,6,3,4,5,7,7);
		
		List<Integer> distictNums = nums.stream()
				.filter(s->s%2==0)
				.distinct()
				.collect(toList());
		distictNums.forEach(System.out::println);
		
		//Truncating the stream to limit the element, first 3 dishes that have more than 500 Calories
		
		List<Dish> truncateHighCalorieDish = Dish.menu
				.stream()
				.filter(dish->dish.getCalories()>500)
				.limit(3)
				.collect(toList());
		System.out.println("********First 3 dishes that have more than 500 Calories******");
		truncateHighCalorieDish.forEach(System.out::println);
		
		//Skiping Element, Skip first 2 elements that have red color
		
		System.out.println("********Skipping first 2 Dish that are red******");
		//:-) Anonymous
		(Dish.menu.stream()
				.filter(food->food.getColor().equals("red"))
				.skip(2)
				.collect(toList())).forEach(System.out::println);
		
		//How would you use streams to filter the first two meat dishes?
		System.out.println("********How would you use streams to filter the first two meat dishes?******");
		List<Dish> meatDishes = Dish.menu
				.stream().filter(Dish::isMeat).limit(2).collect(toList());
		meatDishes.forEach(System.out::println);

		List<Dish> meatDishesNew = Dish.menu.stream().filter(dish->dish.getType()==Dish.Type.MEAT).limit(2).collect(toList());
		
		meatDishesNew.forEach(System.out::println);
	}
	
}
