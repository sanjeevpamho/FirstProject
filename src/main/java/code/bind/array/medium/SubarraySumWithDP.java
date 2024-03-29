package code.bind.array.medium;

import java.util.HashMap;

public class SubarraySumWithDP  
{ 
	public static void main(String[] args)  
	{ 
		SubarraySumWithDP arraysum = new SubarraySumWithDP(); 
		//int arr[] = {15, 2, 4, 8,10, 9, 5, 10, 23,10}; int sum = 23; 
		//  int arr[] = {2,4,2,2,1,1,2}; 
	//	int arr[] = {12, 2, -2, -20, 10}; int sum=-12;
		int arr[] = {-1,1,1}; int sum=1;
		int n = arr.length; 
		
		//  int sum=6;
		//int sum = -10;
		
		int count= arraysum.subArraySum(arr, n, sum); 
		System.out.println("count:"+count);
	}
	private int subArraySum(int[] arr, int n, int sum) {
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		int curr_sum=0;
		int count=0;
		for(int i=0;i<n;i++){
			curr_sum=curr_sum+arr[i];
			//System.out.println("curr_sum:"+curr_sum);
			if (curr_sum == sum) 
			{ 
				System.out.println("Sum found between indexes :"+0+" : "+i);
				 count++; 
				curr_sum=0;
				continue;
			} 
			if(hm.containsKey(curr_sum-sum)){
			//	System.out.println("curr_sum-sum::"+curr_sum+"sum:"+sum);
				System.out.println("Sum found between ..indexes :"+(hm.get(curr_sum-sum)+1) +" : "+i);
				 count++;
				 curr_sum=0;
				 continue;
			}
		//	System.out.println("curr_sum:"+curr_sum+"::i:"+i);
			hm.put(curr_sum, i);
		}
		return count;
	} 
} 