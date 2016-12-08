package com.ds.chap02;
//Dups Allowed
public class HighArray implements ArrayADT {

	private int[] elems;
	private int index =0;
	
	
	public HighArray(int size){
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
	// no dups
	public void insert(int elem) {
		// TODO Auto-generated method stub
		elems[index++]=elem;

	}

	@Override
	//no dups
	public void delete(int elem) {
		// TODO Auto-generated method stub
		for(int i=0; i<index; i++){
			if(elem == elems[i]){
				int offset=1;
				for(int k=i; k<index; k++){
					//special case when the elements are next to each, other elements to be removed
					if(elems[k+1]==elem){
						offset=2;
						
					}
					elems[k]=elems[k+offset];
				}
				
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
