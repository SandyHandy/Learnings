package lambdasinaction.chap5.my;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lambdasinaction.chap4.my.Dish;

public class Finding {

	public static void main(String... args) {
		// Streams the finding facility allMatch, anyMatch, noneMatch, findFirst
		// and findAny
		// these are termial operations as they done return the stream elements,
		// it returns boolean value
		// anyMatch - ist there a element in the a list that mataches the given
		// predicate?

		if (Dish.menu.stream().anyMatch(Dish::isVegetarian)) {
			System.out.println("This menu is somewhat veggie freindly");
		}

		if (Dish.menu.stream().allMatch(d -> d.getCalories() < 1000)) {
			System.out.println("Found some with less 1000");
		}

		if (Dish.menu.stream().noneMatch(d -> d.getCalories() >= 1000)) {
			System.out.println("Good: nothing is more than 1000");
		}

		/*
		 * these are shot-circuting evaluation -In relation to streams, certain
		 * operations such as allMatch, noneMatch, findFirst, and findAny don’t
		 * need to process the whole stream to produce a result.
		 */

		Optional<Dish> lowCalDish = Dish.menu.stream().filter(d -> d.getCalories() < 1000).findFirst();
		if (lowCalDish.isPresent()) {
			System.out.println(lowCalDish);
		}

		Optional<Dish> anyVeggie = Dish.menu.stream().filter(Dish::isVagetarian).findAny();
		if (anyVeggie.isPresent()) {
			System.out.println(anyVeggie);
		}
		
		Dish.menu.stream().filter(Dish::isVagetarian).findAny().ifPresent(d->System.out.println(d));
		
		// for given list of numbers find the first square thats divisible by 3
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println("The first num whose square divisible by 3");
		
		//this is wrong as it find the first number whose squre is divisible by 3
		Optional<Integer> firstSqaureDivisbileby3 = nums.stream().filter(d->(d*d)%3==0).findFirst();
		firstSqaureDivisbileby3.ifPresent(d->System.out.println(d));
		
		//but we want the first square which is divisible by 3
		System.out.println("The first square divisible by 3");
		Optional<Integer> squareNum = nums.stream().map(n->n*n).filter(y->y%3==0).findFirst();
		squareNum.ifPresent(d->System.out.println(d));
	}

}
