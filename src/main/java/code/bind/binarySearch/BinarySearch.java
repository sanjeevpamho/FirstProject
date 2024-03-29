package code.bind.binarySearch;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[])
	{
		System.out.println("Please enter the input::");

		int[] arr={1,2,3,5,6,9,10,15};
		int pos=binSearch(arr,4,0,arr.length-1);
		System.out.println("Does num is present at pos::"+pos);

	}

	private static int binSearch(int[] arr, int ele,int left,int right) {

		if(left>right){
			return -1;
		}
		int mid= (left+right)/2;

		if(arr[mid]==ele){
			return mid;
		}
		else if(ele > arr[mid]){
			return binSearch(arr, ele, mid+1, right);
		}
		else
			return binSearch(arr, ele, left, mid-1);


		//return -1;
	}
}
