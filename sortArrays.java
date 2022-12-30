package com.part1;
import java.util.Arrays;

public class sortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-5,10,2,5,3};
//		Arrays.sort(arr);
		int tmp=0;
		for(int i=0;i<=(arr.length-1);i++) {
//			System.out.println(arr[i]);
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int num:arr) {
			System.out.println(num +" ");
		}
		
	}

}
