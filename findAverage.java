package com.part1;
import java.util.*;

public class findAverage {
	public static int averageOfThree(int a,int b,int c) {
		int sum=a+b+c;
		int avg=sum/3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int avg=averageOfThree(a,b,c);
		System.out.println("average :: "+avg);
	}

}
