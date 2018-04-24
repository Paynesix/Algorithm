package edu.algorithm.stu;

public class ArrayQueue {
	public Integer[] arr;
	public Integer start;
	public Integer end;
	public Integer size;
	
	public ArrayQueue(int initSize) {
		if(initSize < 0) {
			throw new IllegalArgumentException("The index less than 0");
		}
		arr = new Integer[initSize];
		start = 0;
		end = 0;
		size = 0;
	}
	public Integer peek() {
		if(0 == size) {
			throw new ArrayIndexOutOfBoundsException("The queue is empty");
		}
		return arr[start];
	}
	public void push(int obj) {
		if(size == arr.length ) {
			throw new ArrayIndexOutOfBoundsException("The queue is full");
		}
		size ++;
		arr[end] = obj;
		end = nextIndex(arr.length, end);
	}
	
	public Integer poll() {
		if(size == arr.length ) {
			throw new ArrayIndexOutOfBoundsException("The queue is full");
		}
		size --;
		int temp = start;
		start = nextIndex(arr.length, start);
		return arr[temp];
	}
	
	public int nextIndex(int size, int index) {
		return size - 1 == index ? 0 : index + 1;
	}
}
