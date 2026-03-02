package com.coforge.Day5MavenPrj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
	
	public static void main(String[] args) {
		ArrayList<Integer> intAList = new ArrayList<>();
		intAList.add(56);
		intAList.add(90);
		intAList.add(34);
		intAList.add(34);
		intAList.add(56);
		intAList.add(67);
		System.out.println(intAList);
		
		for(Integer i: intAList)
			System.out.println(i);
		
		System.out.println("********************");
		Iterator<Integer> itr = intAList.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i==34) 
				itr.remove();
			System.out.println(i);
		}
		System.out.println(intAList);
	
	
	    /*ListIterator<Integer> listItr = intAList.listIterator();
	    while(listItr.hasNext()) {
		    System.out.println(listItr.next());
	    }
	    System.out.println("Reverse list:");
	    while(listItr.hasPrevious()) {
		    System.out.println(listItr.previous());
	    }*/
	    
	    ArrayList<Integer> aList = new ArrayList<Integer>();
	    aList.add(54);
	    aList.add(33);
	    aList.add(38);
	    
	    intAList.addAll(4,aList);
	    System.out.println(intAList);
	    
	    intAList.remove(2);
	    System.out.println(intAList);
	    
	    intAList.removeAll(aList);
	    System.out.println(intAList);
	    
	    intAList.replaceAll(e->e+10);
	    System.out.println(intAList);
	    
	    Object clonedArrayList = aList.clone();
	    System.out.println(clonedArrayList);
	    
	    System.out.println(intAList.hashCode());
	    System.out.println(clonedArrayList.hashCode());
	    
	    aList.add(45);
	    System.out.println(aList);
	    System.out.println(clonedArrayList);
	    System.out.println(aList.hashCode());
	    System.out.println(clonedArrayList.hashCode());
	    
	    System.out.println(aList.contains(67));
	    System.out.println(aList.containsAll(intAList));
	    
	    aList.forEach(e->System.out.println(e));
	    
	    Collections.sort(aList);
	    System.out.println(aList);
	    
	    Integer[] irr = aList.toArray(new Integer[0]);
	    System.out.println(irr[2]);
	    
	    Integer[] arr = {34, 56, 32, 43, 76, 87};
	    List<Integer> list = Arrays.asList(arr);
	    
	    System.out.println(list);
	    
	    
	}

}
