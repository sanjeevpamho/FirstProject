package code.bind.array.medium;

import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=xvNwoz-ufXA&t=1235s
public class CountSubarraySumEqualsK {
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };int k = 3;
		// int[] arr = {3,-3,1,1,1};int k = 3;

		int[] arr = { 3, 1, 2, 4 };
		int k = 6;
		int cnt = findAllSubarraysWithGivenSum(arr, k);
		System.out.println("The number of subarrays is: " + cnt);

	}

	public static int findAllSubarraysWithGivenSum(int arr[], int k) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap();
		map.put(0, 1);
		int prefixSum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			prefixSum += arr[i];
			int remainingSum = prefixSum - k;

			if (map.containsKey(remainingSum)) {
				count = count + map.get(remainingSum);
			}
			
			if (map.containsKey(prefixSum)) {
				map.put(prefixSum, map.get(prefixSum) + 1);
			} else {
				map.put(prefixSum, 1);
			}

		}
		return count;
	}
}
