package code.bind.array.medium;

import java.util.HashSet;
import java.util.Set;

//https://www.youtube.com/watch?v=oO5uLE7EUlM
//optimal approach : 12:56
public class LongestConsecutiveSequencePart2 {
    public static int longestSuccessiveElements(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set      
        for (int i = 0; i < n; i++) 
            set.add(arr[i]);
      
        // Find the longest sequence
        for (int num : set) {
            if (!set.contains(num - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = num;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }

}
