package com.ds.chap02;

public class HighNoDupsArrays implements ArrayADT {
	
	private int[] elems;
	int index = 0;
	
	public HighNoDupsArrays(int size) {
		// TODO Auto-generated constructor stub
		elems = new int[size];
	}

	@Override
	public boolean find(int elem) {
		// TODO Auto-generated method stub
		for(int i=0; i<index; i++){
			if(elem == elems[i])
				return true;
		}
		return false;
	}

	@Override
	public void insert(int elem) {
		// TODO Auto-generated method stub
		for(int i=0; i<index; i++){
			if(elem== elems[i])
				return;
		}
		elems[index++]=elem;

	}

	@Override
	public void deleteAllOf(int elem) {
		// TODO Auto-generated method stub
		for(int i=0; i<index; i++){
			if(elem==elems[i]){
				for(int k=i; k<index; k++){
					elems[k]=elems[k+1];
					
				}
				break;
			}
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public void display(){
		for(int i=0; i<index; i++){
			System.out.println("elems["+i+"]"+"="+elems[i]);
		}
	}


	
}
