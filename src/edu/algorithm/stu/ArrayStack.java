package edu.algorithm.stu;

public class ArrayStack {
	public Integer[] arr;
	public Integer index;
	
	public ArrayStack(int initSize) {
		if(initSize < 0) {
			throw new IllegalArgumentException("The init size less than 0");
		}
		arr = new Integer[initSize];
		index = 0;
	}
	
	public void push(int obj) {
		if(index == arr.length ) {
			throw new ArrayIndexOutOfBoundsException("The stack is full");
		}
		arr[index++] = obj;
	}
	
	public int pop() {
		if(index == 0) {
			throw new ArrayIndexOutOfBoundsException("The stack is empty");
		}
		return arr[--index];
	}
	
	public Integer peek() {
		if(index == 0) {
			return null;
		}
		return arr[index-1];
		
	}
	
}
