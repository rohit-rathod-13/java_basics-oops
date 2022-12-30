package com.part1;
import java.util.*;

public class Operators {
	
	public static void getBit() {
		int n=5;//0101
		int pos=3;
		int bitMask=1<<pos;//0001 ->> 0100
//		System.out.println(bitMask);
		if((bitMask&n) == 0) {
			System.out.println("bit was zero");
		}else {
			System.out.println("bit was one");
		}
	}
	
	public static void setBit() {
		int n=5;//0101 
		int pos=1;
		int bitMask=1<<pos;
//		System.out.println(bitMask);
		
		int newNumber=bitMask | n;//0010|0101
		System.out.println(newNumber);
	}
	
	public static void clearBit() {
		int n=5;//0101
		int pos=2;
		int bitMask=1<<pos;//0100  
//		System.out.println(bitMask);
		
		int newBitMask=~(bitMask);
		int newNumber=newBitMask & n;
		System.out.println(newNumber);
	}
	
	public static void updateBit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the operation into 0 and 1");
		int oper=sc.nextInt();
		
		int n=5;//0101
		int pos=1;
		int bitMask=1<<pos;
		
		if(oper==1) {
			int newNumber=bitMask | n;
			System.out.println(newNumber);
		}else {
			int newBitMask=~(bitMask);
			int newNumber=newBitMask & n;
			System.out.println(newNumber);
		}
	}

	public static void main(String[] args) {
		
//		getBit();
//		setBit();
//		clearBit();
		updateBit();

	}

}
