package com.paladin.play;

public class PlayWithStrings {
	
		
	public static void main(String[] args){
		
		System.out.println("Is Madam pal = " + isPal("madam"));
		
	}
	
//	private static void allString(String allThatCanBeDone){
//		
//	}

	private static boolean isPal(String palString) {

		char[] strChar = palString.toCharArray();

		for (int i = 0; i < (strChar.length / 2); i++) {
			if (strChar[i] != strChar[strChar.length - i -1])
				return false;
		}
		return true;
	}
	
}
