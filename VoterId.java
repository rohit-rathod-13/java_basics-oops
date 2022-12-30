package com.part1;
import java.util.*;
public class VoterId {

	public static void eligibleOrNot(int age) {
		if(age>=18) {
			System.out.println("You are eligible for Voting ");
		}else {
			System.out.println("You are not eligible Xj");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter age : ");
		int age=sc.nextInt();
		eligibleOrNot(age);
	}

}
