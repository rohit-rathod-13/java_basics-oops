package com.part1;
import java.util.*;
public class power {

	public static int powerOfNum(int x,int n) {
		int pow=1;
		for(int i=1;i<=n;i++) {
			pow=pow*x;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.print("power of : "+powerOfNum(x,n));
	}

}
