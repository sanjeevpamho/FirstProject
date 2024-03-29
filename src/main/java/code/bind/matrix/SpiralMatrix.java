package code.bind.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.youtube.com/watch?v=3Zv-s9UUrFM
public class SpiralMatrix {
public static void main(String[] args) {
	int[][] arr= {
			{1, 2, 3, 4, 5, 6},
			{20,21,22,23,24,7},
			{19,32,33,34,25,8},
			{18,31,36,35,26,9},
			{17,30,29,28,27,10},
			{16,15,14,13,12,11}
	};
	List<Integer> al=traverseSpiralMatrix(arr);
	System.out.println(al);
}

private static List<Integer> traverseSpiralMatrix(int[][] arr) {
	int row = arr.length;
	int col = arr[0].length;
	int top = 0, bottom = row - 1;
	int left = 0, right = col - 1;
	ArrayList<Integer> list = new ArrayList<Integer>();

	while (top <= bottom && left <= right) {
		for (int i = left; i <= right; i++) {
			list.add(arr[top][i]);
		}
		top++;
		for (int i = top; i <= bottom; i++) {
			list.add(arr[i][right]);
		}
		right--;
		if (top <= bottom) {
			for (int i = right; i >= left; i--) {
				list.add(arr[bottom][i]);
			}
			bottom--;
		}
		if (left <= right) {
			for (int i = bottom; i >= top; i--) {
				list.add(arr[i][left]);
			}
			left++;
		}
	}
	return list;
  }
}
