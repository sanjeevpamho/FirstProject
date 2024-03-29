package code.bind.matrix;

import java.util.Arrays;

public class Rotate180DegreeAntiClockWise {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("matrix is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		rotate180AntiClockwise(arr);
		System.out.println("180 Degree Rotated matrix in Anti clockwise format is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	// reverse 1st row from last row,2nd row from 2nd last row...
	// then reverse column wise
	private static void rotate180AntiClockwise(int[][] arr) {
		reverseRowWise(arr);
		reverse(arr);
	}

	static void reverseRowWise(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row / 2; i++) {
			for (int j = 0; j < col; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[row - 1 - i][j];
				arr[row - 1 - i][j] = temp;
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
