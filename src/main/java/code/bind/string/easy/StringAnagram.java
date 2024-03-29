package code.bind.string.easy;

import java.util.HashMap;
import java.util.Set;

public class StringAnagram {
	public static void main(String[] args) {
		String str1 = "ram";
		String str2 = "garm";

		// Function call
		if (isAnagram(str1, str2))
			System.out.print("The two strings are " + "anagram of each other");
		else
			System.out.print("The two strings are " + "not anagram of each other");
	}

	private static boolean isAnagram(String str1, String str2) {
		// base condition
		if (str1.length() != str2.length())
			return false;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length(); i++) {
			Character stringChar = str1.charAt(i);

			if (hm.containsKey(stringChar))
				hm.put(stringChar, hm.get(stringChar) + 1);
			else
				hm.put(stringChar, 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			Character stringChar = str2.charAt(i);
			if (hm.containsKey(stringChar))
				hm.put(stringChar, hm.get(stringChar) - 1);
			else
				return false;
		}
		Set<Character> keySet = hm.keySet();
		for (Character key : keySet) {
			if (hm.get(key) != 0) {
				return false;
			}
		}

		return true;
	}
}
