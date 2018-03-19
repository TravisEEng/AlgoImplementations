package chapter1;

import java.util.Arrays;

/**
 * Excercise 1.1
 * 
 * @author elite SOLVED
 *
 *
 *
 */
public class IsUnique {

	public static boolean checkString(String inputString) {
		boolean result = true;

		char[] transformedString = inputString.toCharArray();

		Arrays.sort(transformedString);

		for (int i = 0; i < transformedString.length - 1; i++) {
			if (transformedString[i] == transformedString[i + 1]) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(checkString("hutg9mnd!nk9"));
	}
}
