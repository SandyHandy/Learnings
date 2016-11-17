package lambdasinaction.chap5.my;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;

import lambdasinaction.chap4.my.Dish;

public class Mapping {

	public static void main(String[] args) {
		/*
		 * A very common data processing idiom is to select information from
		 * certain objects. For example, in SQL you can select a particular
		 * column from a table. The Streams API provides similar facilities
		 * through the map and flatMap methods.
		 */

		/*
		 * stream map method takes a method as argument and maps each of the
		 * stream element to the new , may be its kind of transforming it
		 */

		/*
		 * extract the name of the dishes from the Menu
		 */
		System.out.println("****** Extracting the elment fromt the List *****");

		List<String> dishNames = Dish.menu.stream().map(Dish::getName).collect(toList());
		dishNames.forEach(System.out::println);
		
		/*Given a list of
		words, you’d like to return a list of the number of characters for each word. How would you do it?*/
		
		System.out.println("****** Words lenght *****");
		List<String> words = Arrays.asList("Sandeep", "Saneel", "Neela","Havaragi");
		
		List<Integer> wordLengh = words.stream().
				map(String::length)
				.collect(toList());
		wordLengh.forEach(System.out::println);
		
		System.out.println("****** Lenght of the each of the Dish Name *****");
		List<Integer> dishNameslength = Dish.menu
				.stream()
				.map(Dish::getName)
				.map(String::length)
				.collect(toList());
		dishNameslength.forEach(System.out::println);
		
		System.out.println("****** Unique Characters *****");
		
				
		List<String> uniqueChar = words.stream()
				.map(word->word.split("")) // converts each word in to an array of individual letters
				.flatMap(Arrays::stream) // Flattens each generated steam in sinle stream
				.distinct()
				.collect(toList());
		uniqueChar.forEach(System.out::println);
		
/*		1. Given a list of numbers, how would you return a list of the square of each number? For
				example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].*/
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		List<Integer> squares= nums
				.stream()
				.map(num->num*num)
				.collect(toList());
		squares.forEach(System.out::println);
		
/*		2. Given two lists of numbers, how would you return all pairs of numbers? For example, given a
				list [1, 2, 3] and a list [3, 4] you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. For
				simplicity, you can represent a pair as an array with two elements.*/
		
		List<Integer> nums1 = Arrays.asList(1,2,3);
		List<Integer> nums2 = Arrays.asList(4,5);
		
		List<int[]> pairs = nums1.stream()
				.flatMap(i->nums2.stream()
						.map(j-> new int[]{i,j}))
				.collect(toList());
		
		//pairs.forEach(System.out.println("("+a[0]+","+a[1]+")"));
		
		pairs.forEach(a->System.out.println("("+a[0]+","+a[1]+")"));

		
		System.out.println("****** Paris devide by 3 *****");
/*		3. How would you extend the previous example to return only pairs whose sum is divisible by 3?
				For example, (2, 4) and (3, 3) are valid.*/
		
		List<int[]> pairsDivide = pairs.stream()
				.filter(a->(a[0]+a[1])%3==0)
				.collect(toList());
		
		pairsDivide.forEach(a->System.out.println("("+a[0]+","+a[1]+")"));
		
		List<Integer> nums3 = Arrays.asList(1,2,3);
		List<Integer> nums4 = Arrays.asList(4,5);
		
		List<int[]> pairDivide3 = nums3.stream()
				.flatMap(i-> nums4.stream()
						.filter(j-> (i+j) %3 ==0)
						.map(j-> new int[]{i,j})
						)
				.collect(toList());
				
		pairDivide3.forEach(a->System.out.println("("+a[0]+","+a[1]+")"));		
				

	}

}
