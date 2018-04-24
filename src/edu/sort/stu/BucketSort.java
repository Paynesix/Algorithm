package edu.sort.stu;

import java.util.Arrays;

public class BucketSort {
	/**
	 * bucket sort
	 * @param arr
	 */
	private static void bucketSort(int[] arr) {
		if(null == arr || arr.length < 2) {
			return;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] buckets = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			buckets[arr[i]]++;
		}
		int i = 0;
		for (int j = 0; j < buckets.length; j++) {
			while(buckets[j]-- > 0) {
				arr[i++] = j;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = Unity.testArray(300, 10);
		int[] b = Unity.copyArray(a);
		Unity.printIt(a);
		bucketSort(a);
		Unity.printIt(a);
		Arrays.sort(b);
		Unity.printIt(b);
		
		Unity.equalsItem(a, b);
	}

}
