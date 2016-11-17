package lambdasinaction.chap5.my;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lambdasinaction.chap4.my.Dish;

public class Reducing {

	// Reducing is also called as folding in other Fuctional Programming world

	/*
	 * Reduce takes two arguments 1) An Intial Value 2) A binaryOperator<T> to
	 * combine 2 elements and produce a new value
	 */
	public static void main(String[] args) {
		// sum = n(n+1)/2 = 7(8/2)=28
		List<Integer> someNums = Arrays.asList(1, 2, 3, 456, 4, 5, 6, 3445, 7);

		Integer sum = someNums.stream().reduce(0, (a, b) -> a + b);
		int sumInt = someNums.stream().reduce(0, Integer::sum);
		Optional<Integer> sumNoInitialValue = someNums.stream().reduce(Integer::sum);
		sumNoInitialValue.ifPresent(d -> System.out.println("No Initial Sum Value :" + d));

		System.out.println("Sumr: " + sum + "SumInt: " + sumInt);

		Integer product = someNums.stream().reduce(1, (a, b) -> a * b);
		long productmin = someNums.stream().reduce(1, Integer::min);
		System.out.println("Product: " + product);

		Optional<Integer> Max = someNums.stream().reduce(Integer::max);
		Optional<Integer> MaxExp = someNums.stream().reduce((a, b) -> a > b ? a : b);

		Max.ifPresent(d -> System.out.println("MAx Value :" + d));
		MaxExp.ifPresent(d -> System.out.println("MAxExp Value :" + d));

		/*
		 * How would you count the number of dishes in a stream using the map
		 * and reduce methods?
		 */
		//A chain of map and reduce is commonly known as the map-reduce pattern,
		Integer dishCount = Dish.menu.stream().mapToInt(d->1).reduce(0,(x,y)->x+y);
		System.out.println("Dish Count : " + dishCount);
		// More straight forward
		
		long dishCountStream = Dish.menu.stream().count();
		
	}

}
