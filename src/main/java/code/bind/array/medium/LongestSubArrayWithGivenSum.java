package code.bind.array.medium;

import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=frf7qxiN2qU&t=1595s
//from 11 mins onwards
public class LongestSubArrayWithGivenSum {
	public static int getLongestSubarray(int[] arr, int sum) {
		Map<Integer, Integer> preSumMap = new HashMap<>();
		int currentSum = 0;
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			// calculate the prefix currentSum till index i:
			currentSum += arr[i];

			// if the currentSum = sum, update the maxLen:
			if (currentSum == sum) {
				maxLen = Math.max(maxLen, i + 1);
				System.out.println("index is between " + 0 + " : " + i);
			}

			// calculate the currentSum of remaining part i.e. x-sum:
			int rem = currentSum - sum;

			// Calculate the length and update maxLen:
			if (preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem);
				maxLen = Math.max(maxLen, len);
				int startIndex = preSumMap.get(rem) + 1;
				System.out.println("index is between " + startIndex + " : " + i);
			}

			// Finally, update the map checking the conditions:
			//{2,0,0,3} int k=3 ,if we will update the sum then we will not get longest array
			if (!preSumMap.containsKey(currentSum)) {
				preSumMap.put(currentSum, i);
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		// int[] arr = { -1, 1, 1 }; int sum = 1;

	//	 int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23, 10, 11, 2 }; int sum = 23;

	//	 int arr[] = {12, 2, -2, -20, 10}; int sum = -12;

	//	int arr[] = { 1, 2, 3, 1, 1, 1, 1, 3, 3 }; int sum = 3;
		
	//	int arr[] = {24, 2, 10, 8, 5}; int sum=23;
		int arr[] = {2,0,0,3}; int sum =3;
		int len = getLongestSubarray(arr, sum);
		System.out.println("The length of the longest subarray is: " + len);
	}
}
