package code.bind.array.sortings;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		// int arr[] = {10, 80, 30, 90, 40, 50, 70};
		int arr[] = { 20, 10, 110, 90, 23, 5, 16, 8 };
		quickSortMethod(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSortMethod(int[] arr, int l, int h) {
		int pivot = arr[l];
		int down = l + 1;
		int up = h;
		while (down <= up) {
			while (down <= up && arr[down] <= pivot) {
				down++;
			}
			while (arr[up] > pivot) {
				up--;
			}
			if (down <= up) {
				int tmp = arr[down];
				arr[down] = arr[up];
				arr[up] = tmp;
				down++;
				up--;
			}
		}

		arr[l] = arr[up];
		arr[up] = pivot;
		if (l < up - 1)
			quickSortMethod(arr, l, up - 1);
		if (down < h)
			quickSortMethod(arr, down, h);
	}
}
