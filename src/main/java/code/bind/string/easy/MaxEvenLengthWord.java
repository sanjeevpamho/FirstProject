package code.bind.string.easy;

public class MaxEvenLengthWord {
	public static void main(String[] args) {
		String str = "My Best Friend Sanjeevk";
		String maxEvenLengthWord = maxEvenlengthWord(str);
		System.out.println("max even length word is : " + maxEvenLengthWord);

	}

	private static String maxEvenlengthWord(String str) {
		int currentLength = 0;
		int maxLength = 0;
		int n = str.length();
		int st = -1;
		int i = 0;

		while (i < n) {
			if (str.charAt(i) == ' ') {
				if (currentLength > maxLength) {
					maxLength = currentLength;
					st = i - currentLength;
				}
				currentLength = 0;
			} else {
				currentLength++;
			}
			i++;
		}
		if (currentLength > maxLength) {
			maxLength = currentLength;
			st = i - currentLength;

		}
		if (st == -1) {
			return "-1";
		}
		return str.substring(st, st + currentLength);
	}
}
