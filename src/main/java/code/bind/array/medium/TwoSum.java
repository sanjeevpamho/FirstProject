package code.bind.array.medium;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int n, int[] arr, int target) {
		int[] ans = new int[2];
		ans[0] = ans[1] = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			int remainingSum = target - num;
			if (map.containsKey(remainingSum)) {
				ans[0] = map.get(remainingSum);
				ans[1] = i;
				return ans;
			}

			map.put(arr[i], i);
		}
		return ans;
	}

	public static void main(String args[]) {
		
		int[] arr = { 2, 6, 5, 8, 11 };
		int n = arr.length;
		int target = 14;
	
		/*
		int arr[] = {12, 2, -2, -20, 10}; 
		int n = arr.length; 
		int target =-12;
		*/
		int[] ans = twoSum(n, arr, target);
		System.out.println("This is the answer for variant 2: [" + ans[0] + ", " + ans[1] + "]");

	}

}
