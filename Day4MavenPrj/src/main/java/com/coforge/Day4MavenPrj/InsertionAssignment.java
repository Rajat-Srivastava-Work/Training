package com.coforge.Day4MavenPrj;

public class InsertionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,60,70};
		int index = 4;
		int value=50;
		
		int newArr[] = new int[arr.length + 1];
		
		for(int i=0;i<index;i++) {
			newArr[i]=arr[i];
		}
		
		newArr[index]=value;
		for(int i=index;i<arr.length;i++) {
			newArr[i+1]=arr[i];
		}
		
		System.out.println("New Array: ");
		for(int i = 0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}

	}

}
