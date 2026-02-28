package com.coforge.Day4MavenPrj;

public class InsertionAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,70};
		int index = arr.length;
		int value=80;
		
		int newArr[] = new int[arr.length + 1];
		
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		
		newArr[index]=value;
		
		System.out.println("New Array: ");
		for(int i = 0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}


	}

}
