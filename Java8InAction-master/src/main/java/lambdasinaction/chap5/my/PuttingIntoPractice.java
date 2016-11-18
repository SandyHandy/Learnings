package lambdasinaction.chap5.my;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan =new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);
		
		
		 /*Find all transactions in the year 2011 and sort them by value (small to high).*/
//		List<Transaction> trasaction2011 = transactions.stream().filter(d->d.getYear()==2011).sorted().collect(toList());
//		trasaction2011.forEach(System.out::println);
//		
		 /*What are all the unique cities where the traders work?*/
		List<String> uniqueCities = transactions.stream().map(d->d.getTrader().getCity()).distinct().collect(toList());
		uniqueCities.forEach(System.out::println);
		
//		Find all traders from Cambridge and sort them by name.
		List<Trader> traderFromCam = transactions.stream().map(d->d.getTrader()).filter(d->d.getCity().equals("Cambridge")).collect(toList());
		traderFromCam.forEach(System.out::println);
		
	}
}
