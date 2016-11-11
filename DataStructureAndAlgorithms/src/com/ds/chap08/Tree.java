package com.ds.chap08;

public class Tree {

	public Node root=null;
	
	public void insert(int data)
	{
		Node dataNode= new Node();
		dataNode.setData(data);
		Node current = root;
		System.out.println("insert");
		//important piece
		if (root == null){
			root = dataNode;
			return;
		}
		while(true){
			if(data>=current.getData())	{	
				if (current.getRightNode() == null){
					current.setRightNode(dataNode);
					return;
					}
				current =current.getRightNode();
			}
			else if (data < current.getData()){
				if(current.getLeftNode() == null){
					current.setLeftNode(dataNode);
					return;
				}
				current = current.getLeftNode();
			}
				
		}
		
	}
	
	public void inOrder(Node current){
		//System.out.println("inorder");
		if(current ==null){
			return;
		}
		inOrder(current.getLeftNode());
		current.displayNode();
		inOrder(current.getRightNode());
	}
	
	public void preOrder(Node current){
		
		if(current !=null){

		//System.out.println("preOrder");
		current.displayNode();
		inOrder(current.getLeftNode());
		inOrder(current.getRightNode());
		}
	}
	
	public Node find(int key){
		
		Node current = root;
		
		while (current!=null){
			if(current.getData() == key)
				return current;
			else if (key< current.getData()){
				current = current.getLeftNode();
			}else if (key>current.getData()){
				current = current.getRightNode();
			}
		}
		return current;
	}
	
}
