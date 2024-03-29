package code.bind.array.medium;

import java.util.Arrays;

//Program was to first replace 10 by 1 and then move 1's to left side
public class ArrangeOne {
	public static void main (String[] args)  
	{
		int[] arr={2,10,4,10,4,10,6,2,7,10};
		int n=arr.length;
		replaceAndRearrange(arr, n, 10);

	} 
	
	private static void replaceAndRearrange(int[] arr,int n,  int num) {
		for(int i=0;i<n;i++){
			if(arr[i]==num) {arr[i]=1;}
		}
		System.out.println(Arrays.toString(arr));
		int cnt=arr.length-1;
		for(int i=arr.length-1 ;i>=0;i--){
			if(arr[i]!=1){
				arr[cnt--]=arr[i];
			}
		}
		while(cnt >=0){
			arr[cnt--]=1;
		}
		System.out.println("after arrangement");
		System.out.println(Arrays.toString(arr));
	}


}
