package com.part1;
import java.util.*;

public class sumOfOdd {
	
	public static int sumOdd(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num till you wanna sum : ");
		int num=sc.nextInt();
		System.out.println("sum of odd :: "+sumOdd(num));
		
	}

}
