package code.bind.array.easy;

//https://www.geeksforgeeks.org/find-second-largest-element-array/
public class Find2ndLargestElement {
	public static void main(String[] args) {
		Integer arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		print2largest(arr, n);
	}

	private static void print2largest(Integer[] arr, int n) {
		int first, second;
		first = second = Integer.MIN_VALUE;
		if (n < 2) {
			System.out.println("size is less than 2");
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}
}
