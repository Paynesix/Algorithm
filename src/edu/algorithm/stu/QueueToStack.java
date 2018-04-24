package edu.algorithm.stu;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {

	public Queue<Integer> queue;
	public Queue<Integer> help;
	
	public QueueToStack() {
		this.queue = new LinkedList<Integer>();
		this.help = new LinkedList<Integer>();
	}
	
	public void push(int obj) {
		queue.add(obj);
	}
	
	public Integer pop() {
		if(queue.isEmpty()) {
			throw new RuntimeException("The stack is empty");
		}
		while(queue.size() > 1) {
			help.add(queue.poll());
		}
		int res = queue.poll();
		swap();
		return res;
	}
	
	public Integer peek() {
		if(queue.isEmpty()) {
			throw new RuntimeException("The stack is empty");
		}
		while(queue.size() > 1) {
			help.add(queue.poll());
		}
		int res = queue.poll();
		help.add(res);
		swap();
		return res;
	}
	
	/**
	 * 转化队列角色
	 */
	private void swap() {
		Queue<Integer> temp = help;
		help = queue;
		queue = temp;
	}
	
	
}
