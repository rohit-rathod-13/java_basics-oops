package com.part1;
import java.util.*;

public class fibo {

	static int n1=0,n2=1,n3=0;
	public static void printFibonacci(int num) {
		if(num>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(num-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print(n1+" "+n2);
		printFibonacci(num-2);
	}

}
