package com.akshay.training;

public class ArrayRotation {

	public static void main(String[] args) {
	
		int []arr= {1,2,3,4,5,6,7,8,9};
		arrayRotate(arr,5);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		

	}
	
	static void arrayRotate(int []arr,int val) {
		if (val>arr.length)
			val=val%arr.length;
		int []res=new int[arr.length];
		
		for(int i=0;i<val;i++) {
			res[i]=arr[arr.length-val+i];
		}
		int j=0;
		for(int i=val;i<arr.length;i++) {
			res[i]=arr[j];
			j++;
		}
		System.arraycopy(res, 0, arr, 0, arr.length);
	}

}
