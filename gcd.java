package com.part1;
import java.util.*;
public class gcd {

	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a=54,b=24;
		System.out.println("gcd of "+a+" and "+b+" is "+gcd(a,b));
	}

}
