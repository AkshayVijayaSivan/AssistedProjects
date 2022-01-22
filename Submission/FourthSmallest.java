package com.akshay.training;

public class FourthSmallest {

	public static void main(String[] args) {

		int [] arr = { 65,21,45,1,2,3,44};
		FourthSmallest fs= new FourthSmallest();
		int res=fs.nthSmallest(arr,5);
		if (res != '\0')
			System.out.println(res);
		else
			System.out.println("Invalid input");
	}


int nthSmallest(int[] arr,int val) {
	if (val>0 && val<=arr.length) {
		int small=arr[0],temp=0;
		for(int i=0;i<val;i++) {small=arr[i];
			for(int j=i;j<arr.length;j++) {
				if(small>arr[j]) {
					temp=small;
					small=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		return small;
	}
	else
		return '\0';
}}