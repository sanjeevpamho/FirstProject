package code.bind.matrix;

import java.util.Arrays;
import java.util.Collections;

public class Rotate90DegreeAntiClockWise {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("matrix is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		rotate90AntiClockwise(arr);
		System.out.println("90 Degree Rotated matrix in Anti clockwise format is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	// first transpose the array then reverse 1st row from last row,2nd row from 2nd last row...
	private static void rotate90AntiClockwise(int[][] arr) {
	      transpose(arr);
	      reverseRowWise(arr);
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

}
