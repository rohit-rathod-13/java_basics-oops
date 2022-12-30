package com.part1;
import java.util.*; 

public class SumofNnum {

	public static void main(String[] args) {
		int a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println("sum of n numbers : "+sum);
	}

}
