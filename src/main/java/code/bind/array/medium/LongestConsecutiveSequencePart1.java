package code.bind.array.medium;

import java.util.Arrays;

//https://www.youtube.com/watch?v=oO5uLE7EUlM
public class LongestConsecutiveSequencePart1 {
	public static void main(String[] args) {
		// int[] a = {100, 200, 1, 2, 3, 4};
		int[] a = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
		int ans = longestSuccessiveElements(a);
		System.out.println("The longest consecutive sequence is " + ans);
	}

	public static int longestSuccessiveElements(int[] a) {
		int n = a.length;
		if (n == 0)
			return 0;

		// sort the array:
		Arrays.sort(a);
		int lastSmaller = Integer.MIN_VALUE;
		int cnt = 0;
		int longest = 1;

		// find longest sequence:
		for (int i = 0; i < n; i++) {
			if (a[i] - 1 == lastSmaller) {
				// a[i] is the next element of the
				// current sequence.
				cnt += 1;
				lastSmaller = a[i];
			} else if (a[i] != lastSmaller) {
				cnt = 1;
				lastSmaller = a[i];
			}
			longest = Math.max(longest, cnt);
		}
		return longest;
	}
}
