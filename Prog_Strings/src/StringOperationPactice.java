import java.util.Locale;

public class StringOperationPactice {

	public static void main(String[] arg){
		System.out.println("If the strings are same = " + compareToString("Sandeep","Hab"));
		System.out.println("The sub string is Sandeep from 2 to 6 is " + "Sandeep".substring(1,6+1));
		System.out.println("Sandeep print and " + "Sandeep".substring(1, 4));
		System.out.println("Lenght of a string is = " + "Sandeep".length());
		System.out.println("CharAt is 3 should be d = " + "Sandee".charAt(3));
		System.out.println("Trim a string is = " + "  Sandeep  ".trim());
		System.out.println("Lenght of a string is = " + "Sandeep".length());
		
		System.out.println("Last Occurence of Hello in Hello world and hello USA"
				+ LastOccurenceIndex("Helle World, Hello India", "a") );
		
		System.out.println("replace e from Sandeep Havaragi " + "Sandeep".replace("S", "")
				+ "Havaragi ".replace('a','t'));
		System.out.println("Replace Hello" + "at Hello, Hello world what I'm doing when hello coming to"
				+ "super man and Hello batman not hello movie ".replaceAll("hello", ""));
		System.out.println("super man and Hello batman not hello movie".replaceFirst("hello", "jello"));
		System.out.println("Remove 4 " + removeCharAt("Sandeep",7));
		
		System.out.println("Sandeep reverse " + reverseString("Sandeep"));
		String statement = "Check if I can get the word from the statement, how many time the work as has";
		String word = "has";		
		System.out.println("Does it contain the word :" + searchWord(statement, word));
		System.out.println("Does it contain the word :" + betterSearchWord(statement, word));
		splitString();
		toUpperCaseChange();
		
	}

	private static boolean compareToString(String a, String b) {
		boolean result = false;
		if (a.compareToIgnoreCase(b) == 0)
			result = true;
		else
			result = false;

		return result;
	}

	private static int LastOccurenceIndex(String OrgiString, String subString) {
		int indexOfSubString = OrgiString.lastIndexOf(subString);
		System.out.println("For now the index is = " + indexOfSubString);
		return indexOfSubString;
	}

	private static String removeCharAt(String removeString, int pos){
		if(pos<=(removeString.length()-1)){
		return removeString.substring(0,pos) + 
				removeString.substring(pos+1, removeString.length());
		}else return removeString;
	}
		
	private static String reverseString(final String origiString){
		String revString = null;
		char[] revOriChar = new char[origiString.length()];
		char temp;
		revOriChar = origiString.toCharArray();
		for(int i=0; i<origiString.length()/2; i++){
			temp = revOriChar[i];
			revOriChar[i] = revOriChar[origiString.length()-1-i];
			revOriChar[origiString.length()-1-i] = temp;
		}
		revString =String.valueOf(revOriChar, 0, origiString.length());
		return revString;
	  
	}
	

	private static boolean searchWord(String statement, String word){
		// is it any string or just the word
		// could it be the last word in the string , yes
		// are there any spaces in this word? no
		boolean foundWord = false;
		// split the string space and put then in set, check if the set contians it
		
		String[] words = statement.split(" ");
		for(String w: words){
			if(w.equals(word)){
				foundWord = true;
				break;
			}
		}
		
		return foundWord;
	}
	
	private static boolean betterSearchWord(String statement, String word){
		if (statement.indexOf(word) != -1)
		return true;
		else
		return false;
		
	}
	private static void splitString(){
		String statement = "Jan-Feb-Mar.Jun-July-Aug$end";
		String[] months = statement.split("-");
		System.out.println(months);
		for(String month: months){
			System.out.println(month);
		}
		
		//String[] q = statement.split('.'); 
		//No char that a error
		String[] qs = statement.split("\\.");// . is predefined in regex, need to escape
		
		System.out.println(qs);
		System.out.println("HOw is quaters lenght :" + qs.length);
		for(String quater: qs){
			System.out.println("Quater: " + quater);
		}
		
		String[] distincts = statement.split("\\$");// predefined
		System.out.println(distincts);
		for(String distict: distincts){
			System.out.println("Distinct: " + distict);
		}
		
	}
	
	private static void toUpperCaseChange(){
		Locale lc = new Locale("tr");
	String orgiString = "sadjemdfjbnbd80%^&";
	System.out.println("Upper" + orgiString.toUpperCase());
	System.out.println("Upper Locale" + orgiString.toUpperCase(lc));
	}
}
