package code.bind.array.easy;

import java.util.Arrays;

public class SegregateZeroOneTwo {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		segregateUsingDutchNationalFlag(arr, arr.length);
		System.out.println("Array after segregataion :");
		System.out.println(Arrays.toString(arr));
	}
  //  DutchNationalFlag	
  //  <0 ---- 0s ---- low-1> <low ---- 1s ---- mid-1> <mid ---- unsorted ---- high> <high+1 ---- 2s ---- n-1>
	private static void segregateUsingDutchNationalFlag(int[] arr, int length) {
		int low = 0, mid = 0;
		int high = length - 1;

		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}

	}
}
