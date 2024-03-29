package code.bind.array.sortings;

import java.util.Arrays;
import java.util.PriorityQueue;

class ArrayContainer implements Comparable<ArrayContainer>{

	int[] arr;
	int index;
	public ArrayContainer(int[] arr,int index){
		this.arr=arr;
		this.index=index;
	}
	public int compareTo(ArrayContainer insertedObject){
        return   this.arr[this.index] - insertedObject.arr[insertedObject.index];
	}
}

public class KSortedArray {
	public static int[] mergeArray(int[][] sortedArrays){
		PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
		int total=0;
		for(int i=0;i < sortedArrays.length;i++){
			queue.add(new ArrayContainer(sortedArrays[i], 0));
			total=total+sortedArrays[i].length;
		}
		int m=0;
		int result[]=new int[total];

		while(!queue.isEmpty()){
           ArrayContainer ac = queue.poll();	
           result[m++]=ac.arr[ac.index];
           
           if(ac.index < ac.arr.length-1){
        	   queue.add(new ArrayContainer(ac.arr, ac.index+1));
           }
           
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = { 0, 9, 10, 11,12 };

		int[] result=mergeArray(new int[][]{arr1,arr2,arr3});

		System.out.println(Arrays.toString(result));
	}
}
