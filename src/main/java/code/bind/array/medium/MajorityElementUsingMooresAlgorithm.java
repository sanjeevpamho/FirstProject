package code.bind.array.medium;

public class MajorityElementUsingMooresAlgorithm {
	public static void main(String[] args) {
		int[] arr = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
		int ans = majorityElement(arr);
		System.out.println("The majority element is: " + ans);
	}

	private static int majorityElement(int[] arr) {
		int n = arr.length;
		int cnt = 0;
		int ele = 0;
		for (int i = 0; i < n; i++) {
			if (cnt == 0) {
				ele = arr[i];
				cnt++;
			} else if (ele == arr[i]) {
				cnt++;
			} else
				cnt--;
		}

		int cnt1 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele)
				cnt1++;
		}

		if (cnt1 > (n / 2))
			return ele;

		return -1;
	}
}
