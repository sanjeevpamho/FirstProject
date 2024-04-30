package code.bind.array.medium;

import java.util.HashMap;
import java.util.Map;

//better solution in SubArrayWithGivenSumUsingHashMap program
public class SubArrayWithGivenSum {
	
    int subArrayWithSum(int arr[], int n, int sum)
    {
        int currentSum = arr[0], start = 0, i;
 
        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while (currentSum > sum && start < i-1 ) {
                currentSum = currentSum - arr[start];
                start++;
            }
 
            // If currentSum becomes equal to sum,
            // then return true
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println(
                    "Sum found between indexes " + start
                    + " and " + p);
                return 1;
            }
            // Add this element to curr_sum
            if (i < n)
                currentSum = currentSum + arr[i];
        }
 
        System.out.println("No subarray found");
        return 0;
    }
 
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
			if (!preSumMap.containsKey(currentSum)) {
				preSumMap.put(currentSum, i);
			}
		}

		return maxLen;
	}
    public static void main(String[] args)
    {
    	SubArrayWithGivenSum arraysum = new SubArrayWithGivenSum();
/*
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
*/
    	
    	
    	int arr[] = {12, 2, -2, -20, 10}; 
		int n = arr.length; 
		int sum=-12;
       
    	
    	/*
    	int arr[] = {24, 2, 10, 8, 5}; 
		int n = arr.length; 
		int sum=23;
		*/
        
        arraysum.subArrayWithSum(arr, n, sum);
        
    }
}
 