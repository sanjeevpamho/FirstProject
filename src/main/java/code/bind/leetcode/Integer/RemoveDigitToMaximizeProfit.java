package code.bind.leetcode.Integer;

//https://www.youtube.com/watch?v=3hkyjOshZPw
public class RemoveDigitToMaximizeProfit {

	public static void main(String[] args) {
		String[] stringArrayWithPositiveNumber = new String[] { "79867429", "7543798", "72737475" };
		for (String str : stringArrayWithPositiveNumber) {
			System.out.println("Positive Number : " + str + " : " + removeDigit(str, '7'));
		}

		String[] stringArrayWithNegativeNumber = new String[] { "-79867429", "-7543798", "-72737475" , "-7978" };
		for (String str : stringArrayWithNegativeNumber) {
			System.out.println("Negative Number : " + str + " : " + removeDigit(str, '7'));
		}

	}

	public static String removeDigit(String number, char digit) {
		int i;
		if (number.charAt(0) != '-') {
			i = 1;
			for (; i < number.length(); i++) {
				if (number.charAt(i - 1) == digit) {
					if (number.charAt(i) > number.charAt(i - 1)) {
						return (number.substring(0, i - 1) + number.substring(i));
					}
				}
			}

			int lastIndex = number.lastIndexOf(digit);
			return (number.substring(0, lastIndex) + number.substring(lastIndex + 1));
		} else {
			i = 2;
			for (; i < number.length(); i++) {
				if (number.charAt(i - 1) == digit) {
					if (number.charAt(i) < number.charAt(i - 1)) {
						return (number.substring(0, i - 1) + number.substring(i));
					}
				}
			}

			int lastIndex = number.lastIndexOf(digit);
			return (number.substring(0, lastIndex) + number.substring(lastIndex + 1));
		}
	}
}
