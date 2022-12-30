package com.part1;
import java.util.*;
public class CircumCircle {

	public static double circumference(double rad) {
		double pi=3.14;
		double circum=2*rad*pi;
		return circum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius : ");
		double rad=sc.nextDouble();
		System.out.println("circumference :: "+circumference(rad));
	}

}
