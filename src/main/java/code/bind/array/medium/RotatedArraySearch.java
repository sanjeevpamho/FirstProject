package code.bind.array.medium;

public class RotatedArraySearch {
	public static void main(String args[]) {
		// Let us search 3 in below array
		int arr[] = { 5, 6, 7, 8, 9, 10, 11, 1, 2, 3, 4 };
		int n = arr.length;
		int key = 3;
		for(int i=0 ; i<arr.length;i++)
		System.out.println("Index of the element is : " + pivotedBinarySearch(arr, n, arr[i]));
	}

	private static int pivotedBinarySearch(int[] arr, int n, int key) {
		int pivot = findPivot(arr, 0, n - 1);
	//	System.out.println("pivot : " + pivot);
		if (pivot == -1)
			binarySearchforSortedArray(arr, key, 0, n - 1);

		if (arr[pivot] == key)
			return pivot;
		if (key <= arr[n - 1])
			return binarySearchforSortedArray(arr, key, pivot + 1, n - 1);
		return binarySearchforSortedArray(arr, key, 0, pivot - 1);

		// if (arr[0] <= key) return binarySearchforSortedArray(arr, key,0, pivot - 1);
		// return binarySearchforSortedArray(arr, key,pivot + 1, n - 1);

	}

	private static int findPivot(int[] arr, int low, int high) {
		if (low > high)
			return -1;
		if (low == high)
			return low;
		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid - 1] > arr[mid])
			return mid - 1;
		if (mid < high && arr[mid] > arr[high])
			return findPivot(arr, mid + 1, high);
		return findPivot(arr, low, mid - 1);

	}

	private static int binarySearchforSortedArray(int[] arr, int ele, int left, int right) {
		if (left > right)
			return -1;
		int m = (left + right) / 2;
		if (arr[m] == ele)
			return m;
		else if (ele > arr[m])
			return binarySearchforSortedArray(arr, ele, m + 1, right);
		else
			return binarySearchforSortedArray(arr, ele, left, m - 1);

	}
}
