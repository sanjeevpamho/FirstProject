package com.filereader;

import java.util.Arrays;

public class PrintDistinctElement {

	public static void main(String[] args) {
		int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}; 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int n = arr.length; 
		printDistinct(arr, n); 
	}

	private static void printDistinct(int[] arr, int n) {

		int left=1;
		int right=0;
		System.out.println();
		System.out.print(" "+arr[right]+" ");

		while(left < n){
			while(left < n && arr[left]==arr[right] ){
				left++;
			}
			right=left;
			System.out.print(" "+arr[right]+" ");
			left++;

		}
	}

}


