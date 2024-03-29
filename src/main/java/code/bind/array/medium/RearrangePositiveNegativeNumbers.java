package code.bind.array.medium;

import java.util.Arrays;

public class RearrangePositiveNegativeNumbers {
	public static void main(String[] args) {

		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int pivot = 0;
		int down = 0;
		int up = arr.length - 1;
		while (down <= up) {
			while (down <= up && arr[down] < pivot) {
				down++;
			}
			while (arr[up] > pivot) {
				up--;
			}
			if (down <= up) {
				int tmp = arr[down];
				arr[down] = arr[up];
				arr[up] = tmp;
				down++;
				up--;
			}
		}
		System.out.println(Arrays.toString(arr));
		int pos = down, neg = 0;
		int temp = 0;
		while (pos < arr.length && neg < pos && arr[neg] < 0) {
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			pos++;
			neg += 2;
		}

		System.out.println("after::::::" + Arrays.toString(arr));
	}

}
