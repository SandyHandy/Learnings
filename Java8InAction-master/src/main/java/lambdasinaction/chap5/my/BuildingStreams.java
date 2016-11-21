package lambdasinaction.chap5.my;

import java.util.Arrays;
import java.util.stream.Stream;

public class BuildingStreams {
	
	public static void main(String ...args){
		// Building the streams from Values, statis method Stream of
		
		Stream<String> stream = Stream.of("Sandeep", "Java 8", "Lambdas", "in", "Action");
		stream.map(String::toUpperCase).forEach(System.out::println);
		
		//Streams for Array, Arrays.Stream
		/*String[] words = {"Sandeep", "Java 8", "Lambdas", "in", "Action"};
		Stream<String> streamArr = Arrays.stream(words);*/
		
		//streams from Files
		
		//streams from functions: creating infinite streams
		Stream.iterate(0, n->n+2)
		.limit(10)// if you remove the this everything, its just produce the infinite even nubmer
		.forEach(System.out::println);
		
		//iterate method`
		//Geneate the first 20 Fabancci number using the stream or iterate
		Stream.iterate(new int[] {0,1}, n->new int[] {n[1], n[0]+n[1]})
		.limit(20)
		.map(t->t[0])// in the tiple {0,1}{1,1}{1,2},{2,3} the first array element represetns the fabanaci number
		.forEach(System.out::println);
		//.forEach(n-> System.out.println(n[0]+n[1]));
		
		//Generate
		Stream.generate(Math::random)
		.limit(5)
		.forEach(System.out::println);
	}

}
