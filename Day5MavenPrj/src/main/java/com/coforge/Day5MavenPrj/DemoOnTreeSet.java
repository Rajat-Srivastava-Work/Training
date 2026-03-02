package com.coforge.Day5MavenPrj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> studentTree = new TreeSet<Student>();
		Student s1 = new Student(123,"Rajat",90);
		Student s2 = new Student(234,"Mayank",95);
		Student s3 = new Student(345,"Gaurav",80);
		Student s4 = new Student(456,"Deepansh",89);
		Student s5 = new Student(567,"Yash",88);
		
		studentTree.add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		
		studentTree.forEach(s->System.out.println(s));
		System.out.println("---------------------------");
		Iterator<Student> itr = studentTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("----------------------------");
		itr=studentTree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("----------------------------");
		System.out.println("Descending set");
		Set<Student> set = studentTree.descendingSet();
		
		set.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println(studentTree.subSet(s4, s5));
		
		Student fromStud = new Student(123,"",0);
		Student toStud = new Student(124,"",0.0);
		Set<Student> subset=studentTree.subSet(fromStud, toStud);
		System.out.println("-----------------------------");
		System.out.println("Subset of student tree");
		subset.forEach(s -> System.out.println(s));
		
		Student s = new Student(110,"",90);
		System.out.println(studentTree.ceiling(s));
		System.out.println(studentTree.floor(s));
		System.out.println(studentTree.higher(s));
	}

}
