package edu.sort.stu;

import java.util.Arrays;

/**
 * quick sort
 * @author payne
 * @version 2018-04-22
 */
public class QuickSort {
	
	/**
	 * quick sort
	 * @param arr
	 * @param l
	 * @param r
	 */
	public static void quickSort(int[] arr, int l, int r) {
		if(l < r) {
			Unity.swap(arr, l + (int)(Math.random()*(r-l+1)), r);
			int[] p = partition(arr, l, r);
			quickSort(arr, l, p[0]-1);
			quickSort(arr, p[1]+1, r);
			
		}
	}
	/**
	 * partition of array 
	 * @param arr
	 * @param L
	 * @param R
	 * @return
	 */
	private static int[] partition(int[] arr, int L, int R) {
		int less = L - 1;
		int more = R;
		while(L < more) {
			if(arr[L] < arr[R]) {
				Unity.swap(arr, ++less, L++);
			}else if(arr[L] > arr[R]) {
				Unity.swap(arr, --more, L);
			}else {
				L++;
			}
		}
		Unity.swap(arr, more, R);
		return new int[] {less+1, more};
	}
	
	public static void main(String[] args) {
		int[] arr = Unity.testArray(30, 300);
		int[] b = Unity.copyArray(arr);
		Unity.printIt(arr);
		QuickSort.quickSort(arr, 0, arr.length-1);
		Unity.printIt(arr);
		Arrays.sort(b);
		Unity.printIt(b);
		Unity.equalsItem(b, arr);
	}
}
