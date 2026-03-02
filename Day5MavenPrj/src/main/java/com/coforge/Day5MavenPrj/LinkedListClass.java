package com.coforge.Day5MavenPrj;

import java.util.Iterator;
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
		
		LinkedList<Integer> llist1 = new LinkedList<Integer>();
		llist1.add(15);
		llist1.add(25);
		llist1.add(35);
		llist.add(45);
		llist1.add(55);
		llist.add(65);
		
		System.out.println(llist.equals(llist1));
		
		Iterator<Integer> itr = llist.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*
		 * Create employee linked list with 10 records
		 * sort using Collections.sort on salary based
		 * sort using comparators branch, department, name, salary
		 * name,id,branch,department,salary
		 * */
		

	}

}
