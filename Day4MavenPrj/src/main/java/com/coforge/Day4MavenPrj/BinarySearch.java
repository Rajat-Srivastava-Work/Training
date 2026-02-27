package com.coforge.Day4MavenPrj;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,70,80};
		
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		int low=0,high=arr.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Element found");
				break;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else if(arr[mid]>key) {
				high=mid-1;
			}
		}
		if(low>high) {
			System.out.println("not found");
		}
		sc.close();
	}

}
