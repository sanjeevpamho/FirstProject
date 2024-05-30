package code.bind.array.medium;

import java.util.ArrayList;


//https://www.youtube.com/watch?v=h4aBagy4Uok&t=585s
public class RearrangeArrayElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, -4, -5, -3, -4 };
		int[] ans = reArrangeBySign(arr, arr.length);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] reArrangeBySign(int[] arr, int n) {
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for (int ele : arr) {
			if (ele < 0) {
				neg.add(ele);
			} else {
				pos.add(ele);
			}
		}

		if (neg.size() < pos.size()) {
			for (int i = 0; i < neg.size(); i++) {
				arr[2 * i] = pos.get(i);
				arr[2 * i + 1] = neg.get(i);
			}
			int index = neg.size() * 2;
			for (int i = neg.size(); i < pos.size(); i++) {
				arr[index++] = pos.get(i);
			}
		} else {

			for (int i = 0; i < pos.size(); i++) {
				arr[2 * i] = pos.get(i);
				arr[2 * i + 1] = neg.get(i);
			}
			int index = pos.size() * 2;
			for (int i = pos.size(); i < neg.size(); i++) {
				arr[index++] = neg.get(i);
			}
		}
		return arr;
	}
}
