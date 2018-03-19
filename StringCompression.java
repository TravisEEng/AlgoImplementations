package chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Exercise 1.6 - String compression implement a method to perform basic string
 * compression using the counts of repeated characters. For example, aabcccccaaa
 * would become a2b1c5a3 if the "compressed" string would not become smaller
 * than the original string, your method should return the original string. you
 * can assume the string has only uppercase and lowercase letters (a-z)
 * 
 * @author elite
 *
 */
public class StringCompression {

	public static String compress(String input) {
		Set<Character> keys;
		String test = "";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (!map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), 1);
			} else {
				int sumOfChar = map.get(input.charAt(i));
				map.put(input.charAt(i), sumOfChar + 1);
			}
		}

		keys = map.keySet();
		
		for(Character entry : keys) {
			test+=entry;
			test+=map.get(entry);
		}
		//test = map.toString();
		//for (int i = 0; i < keys.size(); i++) {
		//	test += keys[];
		//}
		return test;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String toBeCompressed = sc.nextLine();

		String compressedVersion = compress(toBeCompressed);

		System.out.println(compressedVersion);
	}

}
