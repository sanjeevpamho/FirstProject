package code.bind.matrix;

import java.util.Arrays;

public class Rotate180DegreeClockWise {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("matrix is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		rotate180Degree(arr);
		System.out.println("180 Degree Rotated matrix in clockwise format is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	private static void rotate180Degree(int[][] arr) {
		// Transpose
		// reverse
		// Transpose
		// Reverse
		transpose(arr);
		reverse(arr);
		transpose(arr);
		reverse(arr);

	}

	private static void transpose(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	private static void reverse(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][col - 1 - j];
				arr[i][col - 1 - j] = temp;
			}
		}
	}
}
