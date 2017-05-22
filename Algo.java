
public class Algo {

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

		Algo tester = new Algo();

		System.out.println("Before being sorted");

		for (int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + ", ");
		}

		tester.selection_sort(testArr, testArr.length);

		System.out.println("\nAfter being sorted");

		for (int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + ", ");
		}

	}

}