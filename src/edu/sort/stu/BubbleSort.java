package edu.sort.stu;

/**
 * bubble sort
 * @author payne
 *
 */
public class BubbleSort {

	/**
	 * bubble sort algorithm
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		if(null == arr || arr.length < 2) {
			return;
		}
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j])
					Unity.swap (arr, i, j);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = Unity.testArray(20, 200);
		int[] array1 = array;
		
		BubbleSort b = new BubbleSort();
		b.bubbleSort(array);
		Unity.rightSort(array1);
		Unity.equalsItem(array, array1);
		Unity.printIt(array);
	}
}
