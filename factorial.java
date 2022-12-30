package com.part1;
import java.util.*;

public class factorial {
	
	public static int calculateFactorial(int a) {
		int factorial=1;
		if(a<0) {
			System.out.println("Invalid number ");
			return a;
		}
		for(int i=1;i<=a;i++) {//i=a;i>=1;i--
			factorial*=i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("Factorial : "+calculateFactorial(a));
	}

}
