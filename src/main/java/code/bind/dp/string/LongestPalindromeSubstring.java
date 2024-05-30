package code.bind.dp.string;

//https://www.youtube.com/watch?v=fxwvVnBMN6I
public class LongestPalindromeSubstring {
	public static void main(String[] args) {
        System.out.println(longestPalindrome("aabaa"));
        System.out.println(longestPalindrome("babad"));
	}

	public static String longestPalindrome(String str) {
		if (str.length() <= 1) {
			return str;
		}
		int maxLen = 0;

		String ans = "";
		int n = str.length();
		int[][] dp = new int[str.length()][str.length()];

		for (int diff = 0; diff < n; diff++) {
			for (int i = 0, j = i + diff; j < n; i++, j++) {
				if (i == j) {
					dp[i][j] = 1;
				} else if (diff == 1) {
					/*
					 * if(str.charAt(i)==str.charAt(j)) { dp[i][j]=2; }
					 */
					dp[i][j] = (str.charAt(i) == str.charAt(j)) ? 2 : 0;
				} else {
					if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] != 0) {
						dp[i][j] = dp[i + 1][j - 1] + 2;
					}
				}
				if (dp[i][j] != 0) {
					// "aba"
					// 0 2
					// 2-0+1=3
					if (j - i + 1 > maxLen) {
						maxLen = j - i + 1;
						ans = str.substring(i, j - i + 1);
					}
				}
			}
		}
		return ans;
	}
}
