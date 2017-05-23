
public class Algo {

	public int findmatch(String p, String t) {

		int i, j;
		int m, n;

		m = p.length();
		n = t.length();

		for (i = 0; i <= (n - m); i = i + 1) {
			j = 0;
			while ((j < m) && (t.charAt(i+j) == p.charAt(j)))
				j = j + 1;
			if (j == m)
				return i;

		}

		return (-1);
	}

	public void selection_sort(int s[], int n) {
		int temp, i, j; // Counters
		int min; // index of minimum

		for (i = 0; i < n; i++) {
			min = i;
			for (j = i + 1; j < n; j++)
				if (s[j] < s[min])
					min = j;

			temp = s[i];
			s[i] = s[min];
			s[min] = temp;
		}
	}

	public static void main(String args[]) {

		int[] testArr = new int[] { 4, 8, 5, 7, 8, 234, 654, 123, 8765 };
		String testString = "Hello how are you doing today?";

		Algo tester = new Algo();

		/*
		 * System.out.println("Before being sorted");
		 * 
		 * for (int i = 0; i < testArr.length; i++) {
		 * System.out.print(testArr[i] + ", "); }
		 * 
		 * tester.selection_sort(testArr, testArr.length);
		 * 
		 * System.out.println("\nAfter being sorted");
		 * 
		 * for (int i = 0; i < testArr.length; i++) {
		 * System.out.print(testArr[i] + ", "); }
		 */
		
		System.out.print(tester.findmatch("are", testString));

	}

}