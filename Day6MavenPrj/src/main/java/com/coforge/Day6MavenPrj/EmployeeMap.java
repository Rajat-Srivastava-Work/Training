package com.coforge.Day6MavenPrj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class EmployeeMap {
	public static void main(String[] args) {
		HashMap<Integer, String> empMap = new HashMap<Integer, String>();
		empMap.put(1, "Rajat");
		empMap.put(2, "Mayank");
		empMap.put(3, "Gaurav");
		empMap.put(4, "Yash");
		
		System.out.println(empMap);
		for(Integer key:empMap.keySet()) {
			System.out.println(key);
		}
		for(String val:empMap.values()) {
			System.out.println(val);
		}
		
		System.out.println(empMap.containsKey(3));
		System.out.println(empMap.containsValue("Rajat"));
		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
		System.out.println(entrySet);
		
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(empMap.get(2));
		
		TreeMap<Integer, String> fruitTree = new TreeMap<Integer, String>();
		fruitTree.put(1, "Apple");
		fruitTree.put(3, "Pineapple");
		fruitTree.put(5,"Mango");
		fruitTree.put(2, "Papaya");
		fruitTree.put(4, "Watermelon");
		
		System.out.println(fruitTree);
		
		for(Integer key: fruitTree.keySet()) {
			System.out.println(key + " -> " + fruitTree.get(key));
		}
	}
}
