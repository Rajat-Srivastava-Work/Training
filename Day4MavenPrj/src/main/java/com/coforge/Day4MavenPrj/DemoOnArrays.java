package com.coforge.Day4MavenPrj;

import java.util.Scanner;

public class DemoOnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers of an array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.print("Sum = ");
		System.out.println(sum);
		sc.close();

	}

}
