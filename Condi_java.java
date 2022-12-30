package com.part1;
import java.util.*;
public class Condi_java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int age=sc.nextInt();
//		if(age>18) {
//			System.out.println("adult");
//		}
//		else {
//			System.out.println("not adult");
//		}
//		if(num % 2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
		
		System.out.println("enter number between 1 to 3 ");
		int button=sc.nextInt();
		switch(button) {
		case 1:System.out.println("hello");
		break;
		case 2:System.out.println("namaste");
		break;
		case 3:System.out.println("bonjoro");
		break;
		default:System.out.println("invalid button ");
		}
		
	}

}
