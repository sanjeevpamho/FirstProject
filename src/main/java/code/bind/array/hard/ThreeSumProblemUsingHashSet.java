package code.bind.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Find Out all Triplets whose sum is Zero 
//https://www.youtube.com/watch?v=DhFh8Kw7ymk
public class ThreeSumProblemUsingHashSet {
	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
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
		Set<List<Integer>> tripletSet = new HashSet<List<Integer>>();
		for (int i = 0; i < n; i++) {
			Set<Integer> hashset = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int third = tripletSum - (arr[i] + arr[j]);
				if (hashset.contains(third)) {
					List<Integer> list = Arrays.asList(arr[i], arr[j], third);
					list.sort(null);
					tripletSet.add(list);
				}
				hashset.add(arr[j]);
			}
		}
		return new ArrayList<List<Integer>>(tripletSet);
	}
}
