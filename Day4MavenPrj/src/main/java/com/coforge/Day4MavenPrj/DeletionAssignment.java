package com.coforge.Day4MavenPrj;

public class DeletionAssignment {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		int index = 4;
		
		int[] newArr = new int[arr.length - 1];
		
		for(int i=0;i<index;i++) {
			newArr[i]=arr[i];
		}
		for(int i=index+1;i<arr.length;i++) {
			newArr[i-1]=arr[i];
		}
		
		System.out.println("New Array: ");
		for(int i = 0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}

	}

}
