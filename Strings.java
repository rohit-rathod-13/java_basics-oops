package com.part1;
import java.util.*;

public class Strings {

	public static void Strings1() {
		String firstName = "rohit";
		String lastName = "rathod";
		String fullName = firstName +" "+lastName;
		System.out.println(firstName);
		System.out.println(fullName);
		System.out.println(fullName.length());
		
		for(int i=0;i<firstName.length();i++) {
			System.out.println(firstName.charAt(i));
		}
	}
	
	public static void compare2Strings() {
		String name1 = "tony";
		String name2 = "tony";
		
//		if(name1.equals(name2)) {
//			System.out.println("they are same strings ");
//		}else {
//			System.out.println("they are different strings ");
//		}
		
		if(name1==name2) {
			System.out.println("they are same strings ");
		}else {
			System.out.println("they are different strings ");
		}
		
		if(new String("Tony") == new String("Tony")) {
			System.out.println("they are same strings ");
		}else {
			System.out.println("they are different strings ");
		}
		
	}
	
	public static void subStrings() {
		String name = "TonyStark";
		
		System.out.println(name.substring(0,4));
		
	}
	
	public static void Parsing() {
		String str= "123";
		int number = Integer.parseInt(str);
		System.out.println(number);
		
		String str1 = Integer.toString(number);
		System.out.println(str1.length());
		
	}
	
	public static void cumulativeLength() {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		String array[]=new String[size];
		int totLength = 0;
		
		for(int i=0;i<size;i++) {
			
			array[i] = sc.next();
			totLength +=array[i].length();
		}
		System.out.println(totLength);
	}
	
	public static void replacingLetter() {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'e') {
				result += 'i';
			}else {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}
	
	public static void userName() {
		Scanner sc=new Scanner(System.in);
		String email = sc.next();
		String userName = "";
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i) == '@') {
				break;
			}else {
				userName +=email.charAt(i);
			}
		}
		System.out.println(userName);
	}
	
	public static void main(String[] args) {
		
//		Strings1();
//		compare2Strings();
//		subStrings();
//		Parsing();
//		cumulativeLength();
//		replacingLetter();
		userName();
		
	}

}
