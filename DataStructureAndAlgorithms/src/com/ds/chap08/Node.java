package com.ds.chap08;

public class Node {

	private int data;
	private Node leftNode = null;
	private Node rightNode = null;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	public void displayNode(){
		System.out.println(this.data);
	}
	
}
