package com.ds.chap08;

public class TreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		
		tree.insert(3);
		tree.insert(57);
		tree.insert(26);
		tree.insert(604);
		tree.insert(346);
		tree.insert(584);
		tree.insert(30);
		tree.insert(1000);
		tree.insert(30);
		tree.insert(22);
		
		if(tree.find(1000)!= null){
			System.out.println("The key found");
		}else{
			System.out.println("The key not found");
		}
		
		//tree.inOrder(tree.root);
		tree.preOrder(tree.root);
	}

}
