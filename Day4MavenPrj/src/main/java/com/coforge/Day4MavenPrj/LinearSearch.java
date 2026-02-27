package com.coforge.Day4MavenPrj;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,12,67,45,98,44};
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element found");
				break;
			}
			if(i==arr.length-1)
				System.out.println("not found");
		}
		sc.close();

	}

}
