package lambdasinaction.chap5.my;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lambdasinaction.chap5.my.Trader;
import lambdasinaction.chap5.my.Transaction;

import static java.util.Comparator.comparing;
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
		
		
		 /* 1 .Find all transactions in the year 2011 and sort them by value (small to high).*/
		List<Transaction> trasaction2011 = transactions
				.stream()
				.filter(transaction->transaction.getYear()==2011)
				.sorted(comparing(Transaction::getValue))
				.collect(toList());
		System.out.println("**2011 Transactions**");
		trasaction2011.forEach(System.out::println);
		
		
		 /*2.What are all the unique cities where the traders work?*/
		List<String> uniqueCities = transactions
				.stream()
				.map(d->d.getTrader().getCity())
				.distinct()
				.collect(toList());
		System.out.println("**Unique Cities for the Trader**");
		uniqueCities.forEach(System.out::println);
		
		/*3.Find all traders from Cambridge and sort them by name.*/
		List<Trader> traderFromCam = transactions
				.stream()
				.map(d->d.getTrader())//map(Transaction::getTrader)
				.filter(d->d.getCity().equals("Cambridge"))
				.collect(toList());
		System.out.println("**All the traders from Cambrdige*");
		traderFromCam.forEach(System.out::println);
		
		/*4. Return a string of all traders’ names sorted alphabetically.*/
		
		String names =transactions
		.stream()
		.map(Transaction::getTrader)
		.sorted(comparing(Trader::getName))
		.map(Trader::getName)
		.reduce("",String::concat);
		
		System.out.println("**String of all traders name sorted* =" + names);
	
		
		/*5. Are any traders based in Milan?*/
		Optional<Trader> anyTraderMilan =transactions.stream()
			.map(Transaction::getTrader)	
			.filter(trader->trader.getCity().equals("Milan"))
			.findAny();
		
		anyTraderMilan.ifPresent(trader->System.out.println("**Any Trader based in Milan" + trader));
		
		/*6. Print all transactions’ values from the traders living in Cambridge. */
		
		transactions.stream().map(Transaction::getTrader).collect(toList());
		
		 /* 7. What’s the highest value of all the transactions?*/
		/*8. Find the transaction with the smallest value*/
	}
}
