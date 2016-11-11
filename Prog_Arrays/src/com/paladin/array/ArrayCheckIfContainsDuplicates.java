package com.paladin.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//This are the ways to check it only contains the duplicate 
//elements are we not finding what are the duplicate number
public class ArrayCheckIfContainsDuplicates {
	
	/**
	 * @param arg
	 */
	public static void main(String arg[]){
		int[] arrDuplicateInt = {1,3,4,5,5,6,7,8,9,3};
		Integer[] arrDuplicate = {1,3,4,5,5,6,7,8,9,3};
		String[] arrStrDups ={ "one","two","three", "three"};
		
		//checkDupsWithSet(Arrays.asList(arrDuplicate));
		//checkDupsWithSet(Arrays.asList(arrStrDups));
		
//		checkDupsWithHashSet(Arrays.asList(arrDuplicate));
//		checkDupsWithHashSet(Arrays.asList(arrStrDups));
		
		checkDupsWithOutCollectionFramework(arrDuplicateInt);
	}

	private static <T> void checkDupsWithHashSet(List<T> asList) {
		Set<T> newSet = new HashSet<T>();
		for(T item: asList){
			if(!newSet.add(item)){
				 System.out.println("The array contains the dups");
				 System.out.println("The dups is = " + item);
				 return;
			}
		}
		System.out.println("No Dups");
	}

	/**
	 * @param arrDuplicate
	 */
	private static <T> void checkDupsWithSet(List<T> dupList) {
		//first convert it in to Set and check the length, if its less then the orinigal 
		//then its contains the duplicate
		
		Set<T> setDups = new HashSet<T>(dupList);
		if (setDups.size()<dupList.size()){
		 System.out.println("The array contains the dups");
		 
		}else{
			System.out.println("No dups");
		}
	}
	
	public static void checkDupsWithOutCollectionFramework(int[] arrDup){
		for (int i = 0; i < arrDup.length; i++) {		
				for(int j=i; j>0; ){			
					if (arrDup[i] == arrDup[--j]){
						System.out.println("Int: The array contains the dups = " + arrDup[i]);
					
					}
				}
			
		}
	}

}
