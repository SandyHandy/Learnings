package lambdasinaction.chap4.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import lambdasinaction.chap4.my.Dish.Type;

public class Dish {
	private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    private final String color;
    
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type
				+ ", color=" + color + "]";
	}
	public Dish(String name, boolean vegetarian, int calories, Type type, String color) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
		this.color = color;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}
	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	public enum Type {VEG, MEAT, VEGAN, FISH, OTHER }
    
	public static final  List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT, "red"),
        new Dish("beef", false, 700, Dish.Type.MEAT,"brown"),
        new Dish("chicken", false, 400, Dish.Type.MEAT, "white"),
        new Dish("french fries", true, 530, Dish.Type.OTHER,"yellow"),
        new Dish("rice", true, 350, Dish.Type.OTHER, "white"),
        new Dish("season fruit", true, 120, Dish.Type.OTHER, "other"),
        new Dish("pizza", true, 550, Dish.Type.OTHER, "red"),
        new Dish("prawns", false, 400, Dish.Type.FISH, "red"),
        new Dish("salmon", false, 450, Dish.Type.FISH, "red")); 
	
}
