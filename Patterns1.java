package com.part1;

public class Patterns1 {

	public static void solidRectangle() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void hollowRectangle() {
		int n=4,m=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
//				cell -> (i,j)
				if(i == 1 || j==1 || i==n || j==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void halfPyramid() {
		int rows=4;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void invertedHalfPyramid() {
		int rows=4;
//		for(int i=rows;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void halfPyramidNumber() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.println(j);
//			}
			System.out.println();
		}
	}
	
	public static void invertedHalfPyramidNumbers() {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	
	public static void floydsTriangle() {
		int n=5,number=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
	
	public static void ZeroOne() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum % 2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
//		Patterns1 p=new Patterns1();
//		solidRectangle();
		hollowRectangle();
//		halfPyramid();
//		invertedHalfPyramid();
//		halfPyramidNumber();
//		invertedHalfPyramidNumbers();
//		floydsTriangle();
//		ZeroOne();
		
	}

}
