package com.coforge.Day5MavenPrj;

import java.util.Enumeration;
import java.util.Vector;

public class DemoOnVectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<>();
		vector.ensureCapacity(22);
		System.out.println(vector.capacity());
		
		vector.add(56);
		vector.add(44);
		vector.add(78);
		vector.add(32);
		vector.add(56);
		vector.add(78);
		vector.add(67);
		vector.add(88);
		vector.add(55);
		vector.add(89);
		vector.add(66);
		vector.add(56);
		vector.add(44);
		vector.add(78);
		vector.add(32);
		vector.add(56);
		vector.add(78);
		vector.add(67);
		vector.add(88);
		vector.add(55);
		vector.add(89);
		vector.add(66);
		
		System.out.println(vector.capacity());
		Enumeration<Integer> enums=vector.elements();
		System.out.println();
		
		while(enums.hasMoreElements()) {
			System.out.println(enums.nextElement());
		}
		System.out.println();
		vector.trimToSize();
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		vector.add(90);
		System.out.println(vector.capacity());
		
		Vector<Integer> vector2 = new Vector<>();
		vector2.add(11);
		vector2.add(22);
		vector2.add(33);
		vector2.add(44);
		vector2.add(55);
		
		vector.addAll(vector2);
		System.out.println(vector);
		
		System.out.println(vector.containsAll(vector2));
		System.out.println(vector.elementAt(4));
		

	}

}
