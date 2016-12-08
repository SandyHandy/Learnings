package lambdasinaction.chap6.my;

import java.util.Arrays;
import java.util.List;

import lambdasinaction.chap4.Dish;

public class MyDish {

	private final String name;
	private final boolean vegeterican;
	private final int calories;
	private final Type type;
	
	private enum Type {MEAT,VEG,FISH,OTHER}
	
	public String getName() {
		return name;
	}

	public boolean isVegeterican() {
		return vegeterican;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	/**
	 * @param name
	 * @param vegeterican
	 * @param calories
	 * @param type
	 */
	private MyDish(String name, boolean vegeterican, int calories, Type type) {
		super();
		this.name = name;
		this.vegeterican = vegeterican;
		this.calories = calories;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyDish [name=" + name + ", vegeterican=" + vegeterican + ", calories=" + calories + ", type=" + type
				+ "]";
	}


	public static final List<MyDish> menu = Arrays.asList( new MyDish("pork", false, 800, Type.MEAT),
            new MyDish("beef", false, 700, Type.MEAT),
            new MyDish("chicken", false, 400, Type.MEAT),
            new MyDish("french fries", true, 530, Type.OTHER),
            new MyDish("rice", true, 350, Type.OTHER),
            new MyDish("season fruit", true, 120, Type.OTHER),
            new MyDish("pizza", true, 550, Type.OTHER),
            new MyDish("prawns", false, 400, Type.FISH),
            new MyDish("salmon", false, 450, Type.FISH));
	
}
