package chapter1;

import java.util.Arrays;

/**
 * Excercise 1.2
 * 
 * @author elite SOLVED
 *
 *
 *
 */

public class CheckPermutation {

	// check if one string is a permutation of the other
	public static boolean isPermutation(String s1, String s2) {
		boolean result = false;

		
		
		try {
			
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		
		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);
		
		if(s1Arr.length == s2Arr.length) {
			for(int i = 0; i < s1Arr.length; i++) {
				if(s1Arr[i] != s2Arr[i]) {
					result = false;
					break;
				}else {
					result = true;
				}
			}
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return result;
	}

	public static void main(String[] args) {

		System.out.println(isPermutation(null,null));
	}
}
