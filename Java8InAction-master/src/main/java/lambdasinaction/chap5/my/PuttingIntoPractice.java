package lambdasinaction.chap5.my;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import static java.util.stream.Collectors.toList;

import java.awt.HeadlessException;

import static java.util.Comparator.comparing;

public class PuttingIntoPractice {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// 1. Find all transactions in the year 2011 and sort them by value
		// (small to high).

		System.out.println("**** All the 2011 transaction sorted by value ****");
		List<Transaction> allTran2011 = transactions.stream().filter(d -> d.getYear() == 2011)
				.sorted(comparing(Transaction::getValue)).collect(toList());
		allTran2011.forEach(System.out::println);

		// 2. What are all the unique cities where the traders work?

		System.out.println("**** All Unique cities where the Trader worked ****");
		List<String> uniqeCities = transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct()
				.collect(toList());
		uniqeCities.forEach(System.out::println);

		// 3. Find all traders from Cambridge and sort them by name.
		System.out.println("**** Traders from Cambridge and sort them by name ****");

		List<Trader> traderCambridge = transactions.stream().map(Transaction::getTrader)
				.filter(t -> t.getCity().equals("Cambridge")).sorted(comparing(Trader::getName)).collect(toList());
		traderCambridge.forEach(System.out::println);

		// 4. Return a string of all traders’ names sorted alphabetically.
		System.out.println("**** Return a string of all traders’ names sorted alphabetically ****");

		String traderNames = transactions.stream().map(Transaction::getTrader).sorted(comparing(Trader::getName))
				.map(Trader::getName).reduce("", (n1, n2) -> n1 + n2);

		System.out.println(traderNames);

		// 5. Are any traders based in Milan?
		System.out.println("**** Are any traders based in Milan? ****");

		// Trader =get all the trader, filer, findAny
		Optional<Trader> miladTrader = transactions.stream().map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Milan")).findAny();
		miladTrader.ifPresent(t -> System.out.println(t));

		// 6. Print all transactions’ values from the traders living in
		// Cambridge.
		System.out.println("**** transactions’ values from the traders living in Cambridge ****");
		transactions.parallelStream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue).collect(toList()).forEach(System.out::println);

		// 7. What’s the highest value of all the transactions?

		Optional<Integer> heigestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);

		heigestValue.ifPresent(f -> System.out.println("The Max Value is " + f));

		// 8. Find the transaction with the smallest value.

		Optional<Integer> smallestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::min);

		smallestValue.ifPresent(d -> System.out.println("the Samllest Value is " + d));
		
		Optional<Integer> smallestValue1 = transactions.stream().map(Transaction::getValue).reduce((a,b)->a<b?a:b);
		
		smallestValue1.ifPresent(d -> System.out.println("the Samllest Value 1 is " + d));
		
		

	}
}
