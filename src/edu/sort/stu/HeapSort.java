package edu.sort.stu;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapSort(int[] arr) {
		if(null == arr || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr,i);
		}
		int heapSize = arr.length ;
		Unity.swap(arr, 0, --heapSize);
		while(heapSize > 0)	{
			heapify(arr, 0, heapSize);
			Unity.swap(arr, 0, --heapSize);
		}
	}
	/**
	 * find the max value
	 * @param arr
	 * @param index
	 * @param size
	 */
	private static void heapify(int[] arr, int index, int size) {
		int left = index * 2 + 1;
		while(left < size) {
			int largest = left+1 < size && arr[left+1] > arr[left] ? left + 1 : left;
			largest = arr[largest] > arr[index] ? largest : index;
			if(largest == index) {
				break;
			}
			Unity.swap(arr, largest, index);
			index = largest;
			left = index * 2 + 1;
		}
	}
	/**
	 * heap insert
	 * @param arr 
	 * @param i
	 */
	private static void heapInsert(int[] arr, int i) {
		while(arr[i] > arr[(i-1)/2]) {
			Unity.swap(arr, i, (i-1)/2);
			i = (i-1)/2;
		}
	}

	public static void main(String[] args) {
		int[] a = Unity.testArray(20, 200);
		int[] b = Unity.copyArray(a);
		
		Unity.printIt(a);
		HeapSort.heapSort(a);
		Unity.printIt(a);
		
		Arrays.sort(b);
		Unity.printIt(b);
		
		Unity.equalsItem(a, b);
		
	}
}
