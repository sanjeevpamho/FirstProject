package code.bind.array.sortings;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 4, 14, 8, 6, 15, 1, 3 };

		System.out.println("Sorted Array is : " + Arrays.toString(selSort(arr)));
	}

	public static int[] selSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
                if(arr[i]>arr[j]) {
                	int temp=arr[i];
                	arr[i]=arr[j];
                	arr[j]=temp;
                }
			}
			System.out.println("Array is : " + Arrays.toString(arr));
		}
		return arr;
	}
	

}
