package code.bind.array.easy;

//https://www.youtube.com/watch?v=2D0D8HE6uak&t=1182s
//8:08
public class FindMissingAndRepeatingNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		missingAndRepeatingNumbers(arr, arr.length);
	}

	public static void missingAndRepeatingNumbers(int[] arr, int n) {
		int repeatingNum = 0;
		int missingNum = 0;

		long sumofNaturalNumber = (n * (n + 1)) / 2;
		long sumOfSquareOfNaturalNumber = (n * (n + 1) * (2 * n + 1)) / 6;

		long sumOfArrayNumbers = 0;
		long sumOfSquareOfArrayNumbers = 0;
		for (int i = 0; i < n; i++) {
			sumOfArrayNumbers += arr[i];
			sumOfSquareOfArrayNumbers += (arr[i] * arr[i]);
		}

		long value1 = sumOfArrayNumbers - sumofNaturalNumber;
		long value2 = sumOfSquareOfArrayNumbers - sumOfSquareOfNaturalNumber;

		value2 = value2 / value1;

		repeatingNum = (int) ((value1 + value2) / 2);
		missingNum = (int) (value2 - repeatingNum);

		System.out.println("repeatingNum : " + repeatingNum);
		System.out.println("missingNum : " + missingNum);

	}
}
