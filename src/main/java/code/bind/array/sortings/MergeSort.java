package code.bind.array.sortings;

import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
	//	int arr[]={38, 27, 43, 3, 9, 82, 10};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	private static void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	//3,27,38,43   9,10,82
	private static void merge(int[] arr, int l, int m, int r) {
		System.out.println("merge call");
		int tmp[]=new int[arr.length];
		int i=l;
		int k=l;
		int j=m+1;
		while(i<=m && j<=r) {
			if(arr[i]<=arr[j]) {
				tmp[k]=arr[i];
				i++;k++;
			}
			else {
				tmp[k]=arr[j];
				j++;k++;
			}
		}
		while(i<=m) {
			tmp[k]=arr[i]; i++;k++;
		}
		while(j<=r) {
			tmp[k]=arr[j]; j++;k++;
		}
		for(int b=l;b<=r;b++) {
			arr[b]=tmp[b];
		}
		
	}
}
