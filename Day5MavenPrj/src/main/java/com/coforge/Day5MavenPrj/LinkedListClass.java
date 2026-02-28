package com.coforge.Day5MavenPrj;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(50);
		System.out.println(llist);
		
		llist.addFirst(5);
		llist.addLast(55);
		System.out.println(llist);
		

	}

}
