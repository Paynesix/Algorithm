package edu.sort.stu;

/**
 * insert sort
 * @author payne
 *
 */
public class InsertSort {
	
	/**
	 * insert sort algorithm 
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		if(null == arr || arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++) {
			for(int j = i; j>0 && arr[j]<arr[j-1]; j--) {//此处ｊ>0需在第一个判断
				Unity.swap(arr, j, j-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = Unity.testArray(30, 100);
		Unity.printIt(a);
		InsertSort.insertSort(a);
		Unity.printIt(a);
		Unity.rightSort(a);
		Unity.printIt(a);
	}
}
