package com.part1;
import java.util.*;
public class greatestOfTwo {

	public static int greatestOfTwo(int a,int b) {
		
		if(a>b) {
			return a;
		}else if(a==b){
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("greatest number :: "+greatestOfTwo(a,b));
	}

}
