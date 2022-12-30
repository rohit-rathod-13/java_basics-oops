package com.part1;
import java.util.*;

public class functionstrial {
	

	public static void printMyName(String name) {
		System.out.println(name);
	}
	
	public static int calculateSum(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	public static int calculateProduct(int a,int b) {
		int product=a*b;
		return product;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		int sum=calculateSum(a,b);
		int product=calculateProduct(a,b);
//		System.out.println("sum of numbers : "+sum);
//		printMyName(name);
		System.out.println("product of numbers : "+product);
	}

}
