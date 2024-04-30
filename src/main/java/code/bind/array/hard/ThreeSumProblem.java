package code.bind.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=DhFh8Kw7ymk
//https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2
//https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems
public class ThreeSumProblem {
	public static void main(String[] args) {
		int[] arr = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2 };
		int n = arr.length;
		int tripletSum = 0;
		List<List<Integer>> ans = triplet(n, arr, tripletSum);
		for (List<Integer> it : ans) {
			System.out.print("[");
			for (Integer i : it) {
				System.out.print(i + " ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}

	private static List<List<Integer>> triplet(int n, int[] arr, int tripletSum) {
		List<List<Integer>> tripletList = new ArrayList<List<Integer>>();
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < tripletSum) {
					j++;
				} else if (sum > tripletSum) {
					k--;
				} else {
					tripletList.add(Arrays.asList(arr[i], arr[j], arr[k]));
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1]) {
						j++;
					}
					while (j < k && arr[k] == arr[k + 1]) {
						k--;
					}
				}
			}
		}

		return tripletList;
	}
}
