package com.ds.chap02;

import java.util.BitSet;

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
	/// did not work  the way I wanted
	public void deleteAllOf(int elem) {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<index; i++){
			if(elem == elems[i]){
				int offset=1;
				for(int k=i; k<index; k++){
					//special case when the elements are next to each, other elements to be removed
					if(elems[k+1]!=elem){
						elems[k] = elems[k+1];
					}else if (elems[k+1]==elem){
						offset++;
					elems[k]=elems[k+offset];
					}
				}
				
			}	
		}
		
	}
	
	
	

	public void deleteDupsOf(int elem) {
		// TODO Auto-generated method stub
		
		BitSet bitSet = new BitSet(elems.length);
		
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



	public void deleteAllDups() {
		// TODO Auto-generated method stub
		
	}

}
