package edu.sort.stu;

import java.util.Arrays;
/**
 * merge sort
 * @author payne
 *
 */
public class MergeSort {
	
	/**
	 * merge sort algorithm
	 * @param arr
	 */
	public static void mergeSort(int[] arr) {
		if(null == arr || arr.length < 2) {
			return;
		}
		mergeProcess(arr, 0, arr.length-1 );
	}
	/**
	 * merge process 
	 * @param arr
	 * @param left
	 * @param right
	 */
	private static void mergeProcess(int[] arr, int left, int right) {
		if(left == right) {
			return;
		}
		int mid = left +( (right - left) >> 1 );
		mergeProcess(arr, left, mid);
		mergeProcess(arr, mid+1, right);
		merge(arr, left, mid, right);
	}
	/**
	 * merge copy sort
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 */
	private static void merge(int[] arr, int left, int mid, int right) {
		int[] help = new int[right - left + 1];
		int i = 0;
		int p1 = left;
		int p2 = mid+1;
		while(p1<=mid && p2<=right) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while(p1<=mid) {
			help[i++] = arr[p1++];
		}
		while(p2<=right) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[left + j] = help[j];
		}
	}
	
	public static void main(String[] args) {
		int[] a = Unity.testArray(40, 200);
		int[] b = Unity.copyArray(a);
		Unity.printIt(a);
		Unity.printIt(b);
		MergeSort.mergeSort(a);
		Unity.printIt(a);
		Arrays.sort(b);
		Unity.printIt(b);
		Unity.equalsItem(a, b);
	}

}
