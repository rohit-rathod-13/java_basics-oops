package com.part1;
import java.util.*;

public class Array {
	
	public static void oneDStaticArray() {
		int marks[]=new int[6];
		marks[0]=95;
		marks[1]=82;
		marks[2]=92;
		marks[3]=77;
		marks[4]=86;
		marks[5]=98;
		for(int i : marks) {
			System.out.println(i);
		}
	}
	public static void dynamicArray() {
		int marks[]= {82,75,98,95,91};
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int num[]=new int[size];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(num[i]);
		}
//		for(int i=0;i<marks.length-1;i++) {
//			System.out.println(marks[i]);
//		}
	}
	
	public static void twoDArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter Columns : ");
		int columns=sc.nextInt();
		
		int num[][]=new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("to find index enter number : ");
		int x=sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(num[i][j]==x) {
					System.out.println("number found at :: num["+i+"],["+j+"]");
				}
			}
		}
		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<columns;j++) {
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
	}

	public static void main(String[] args) {
		
//		oneDStaticArray();
//		dynamicArray();
		twoDArray();
	}

}
