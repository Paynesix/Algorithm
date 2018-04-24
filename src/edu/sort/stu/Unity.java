package edu.sort.stu;

import java.util.Arrays;

public class Unity {
	
	/**
	 * random make array
	 * @param size
	 * @param value
	 * @return
	 */
	public static int[] testArray(int size, int value) {
		int[] arr = new int[(int) ((size+1)*Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)((value+1)*Math.random());
		}
		return arr;
	}
	
	/**
	 * right sort algorithm
	 * @param arr
	 */
	public static void rightSort(int[] arr) {
		Arrays.sort(arr);
	}
	
	/**
	 * print item
	 * @param arr
	 */
	public static void printIt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/**
	 * comparator item
	 * @param a
	 * @param b
	 */
	public static void equalsItem(int[] a, int[] b) {
		boolean flag = true;
		for (int i = 0; i < b.length; i++) {
			if(a[i] != b[i]) {
				flag = false;
				System.out.println("数值不正确" + i +" 位置的值："+ b[i]);
				break;
			}
		}
		if(flag) {
			System.out.println("恭喜，排序正确！！！");
		}
	}
	
	/**
	 * swap a b
	 * @param arr
	 * @param a
	 * @param b
	 */
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static int[] copyArray(int[] arr) {
		int[] b = new int[arr.length ];
		for (int i = 0; i < b.length; i++) {
			b[i] = arr[i];
		}
		return b;
	}
}
