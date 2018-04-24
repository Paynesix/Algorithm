package edu.algorithm.stu;

import java.util.Stack;

public class StackToQueue {
	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	
	public void push(int obj) {
		stackPush.push(obj);
		dump();
	}
	public Integer poll() {
		if(stackPop.isEmpty() && stackPush.isEmpty()) {
			throw new IllegalArgumentException("The queue is empty");
		}
		dump();
		return stackPop.pop();
	}
	public Integer peek() {
		if(stackPop.isEmpty() && stackPush.isEmpty()) {
			throw new IllegalArgumentException("The queue is empty");
		}
		return stackPop.peek();
	}
	/**
	 * 倒数
	 */
	public void dump() {
		if(stackPop.isEmpty()) {
			while(!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
	}
}
