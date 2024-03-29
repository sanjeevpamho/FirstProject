package code.bind.array.sortings;
import java.util.Arrays;
public class HeapSort {

	public void sort(int arr[]) {
		int n=arr.length;
		for(int i=n/2 -1;i>=0;i--)
			heapify(arr,n,i);

		for(int i=n-1;i>=0;i--){
           int x=arr[0];
           arr[0]=arr[i];
           arr[i]=x;
           heapify(arr, i, 0);
		}
	}
	private void heapify(int[] arr, int heapsize, int i) {
		int largest=i;
		int leftChild=2*i + 1;
		int rightChild=2 *i +2;
		
		if(leftChild < heapsize && arr[leftChild]> arr[largest])
			largest=leftChild;
		
		if(rightChild < heapsize && arr[rightChild] > arr[largest])
			largest=rightChild;
		
		if(largest !=i){
			int x=arr[i];
			arr[i]=arr[largest];
			arr[largest]=x;
			heapify(arr, heapsize, largest);
		}
	}

	public static void main(String args[]) {
		//int arrA[] = {9, 10, 5, 3, 1, 2, 6};
		int arrA[] = {9, 10, 11, 8, 7, 6, 1};
		System.out.println("Original array is: " + Arrays.toString(arrA));
		HeapSort heapSort = new HeapSort();
		heapSort.sort(arrA);

		System.out.println("Sorted array is (Heap Sort): " + Arrays.toString(arrA));
	}
}