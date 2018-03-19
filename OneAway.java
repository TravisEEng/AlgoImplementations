package chapter1;

/**
 * Excercise 1.5
 * 
 * @author elite There are three types of edits that can be performed on
 *         strings: insert a char, remove a char, or replace a char given two
 *         strings write a function to check if they are one or zero edits away
 */

public class OneAway {

	boolean oneEditAway(String first, String second) {
		//Length checks
		if(Math.abs(first.length()- second.length()) > 1) {
			return false;
		}
		
		//Get shorter and longrer string
		
		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;
		
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while(index2 < s2.length() && index1 < s1.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				//ensure that this is the first different found
				if(foundDifference) return false;
				foundDifference = true;
				
				if(s1.length()==s2.length()) {
					index1++;
				}
			} else {
				index1++;
			}
			index2++;
		}
		return true;
	}
}
