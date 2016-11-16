package lambdasinaction.chap5.my;

import static java.util.stream.Collectors.toList;
import static lambdasinaction.chap4.Dish.menu;

import java.util.List;

import lambdasinaction.chap4.my.Dish;

public class Filtering {

	public static void main(String ...args){
		
		List<Dish> redDish = Dish.menu
				.stream().filter(d->d.getColor().equals("red"))
				.collect(toList());
		
		redDish.forEach(System.out::println);
	}
	
}
