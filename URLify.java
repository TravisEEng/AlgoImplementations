package chapter1;

/**
 * Excercise 1.3
 * 
 * @author elite COMPLETED
 *
 *
 *
 */

public class URLify {

	public static String changeToURL(String inputS, int strLen) {

		
		
		String test = inputS.trim();
		
		test=test.replace(" ", "%20");
		
		//char[] newString = new char[strLen+spaceCount];
		
		//for(int i = 0; i < newString.length; i++) {
			
	//	}
		
		
		return test;
		
	}
	
	public static void main(String[] args) {
		System.out.println(changeToURL("Mr John Smith ",13));
	}
	
}
