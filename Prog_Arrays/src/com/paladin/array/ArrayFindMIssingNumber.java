package com.paladin.array;

import java.util.Arrays;
import java.util.BitSet;

public class ArrayFindMIssingNumber extends ArrayOperationsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arrMissing = {1,2,3,4,5,7,6,9,10,
						11,12,13,14,15,16,17,18,19,20};
	
	int[] arrWithDupMissing = {1,2,7,6,9,10,11,12,15,17,20};
	
	findMissingNumberInSequentialArray(arrMissing);	
	findMissingNumberInArrayWithDuplicates(arrWithDupMissing, 20);
		
	}

	/**
	 * 
	 * How to find the missing number in integer array of 1 to 100
	 * 
	 * Solution: Calculate the series sum n(n+1)/2 - the sum of the all number
	 * Only one missing in a sequence
	 * 
	 * @param arrMissing
	 */
	private static void findMissingNumberInSequentialArray(int[] arrMissing) {
		// sum of 1 to n is n(n-1)/2
		 
		 int sum = 20*(20+1)/2;
		 System.out.println("the total sum = " + sum);
		 int missingSum = 0;
		 
		 for (int i=0; i<arrMissing.length; i++){
			 missingSum= missingSum+ arrMissing[i];
		 }
		 System.out.println("missing Sum =" + missingSum);
		System.out.println("The missing number = " + (sum-missingSum));
	}
	
	/**
	 * 
	 * How to find the missing number in integer array with contains duplicates
	 * 
	 * Solution: Calculate the series sum n(n+1)/2 - the sum of the all number
	 * Only one missing in a sequence
	 * 
	 * @param arrMissing
	 */
	
	public static void findMissingNumberInArrayWithDuplicates(int[] arrWithDupMissin ,int count) {
		int NumOfMissingNum = count-arrWithDupMissin.length;
		
		BitSet bitSet = new BitSet(count);
		
		for (int arrEle: arrWithDupMissin){
			bitSet.set(arrEle-1); // sets the specified indices to true;
		}
		
		System.out.println("The Bit array is  =" + bitSet.toString());
		System.out.printf("Missing numbers in interger array %s, with total number %d is %n ", Arrays.toString(arrWithDupMissin), count);
		
		int lastMissingIndex = 0;
		for (int i = 0; i < NumOfMissingNum; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}

}
