package edu.algorithm.stu;

import java.util.ArrayList;

public class Node {
	public int value;
	public int in;
	public int out;
	public ArrayList<Node> nexts;
	public ArrayList<Edge> edges;
	public Node(int value, int in, int out, ArrayList<Node> nexts, ArrayList<Edge> edges) {
		super();
		this.value = value;
		this.in = in;
		this.out = out;
		this.nexts = nexts;
		this.edges = edges;
	}
	
}
