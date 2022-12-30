package com.part1;

public class RecurBeginers {
	
	public static void printNumbers(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		printNumbers(n-1);
	}
	
	public static void printNSum(int i,int n,int sum) {
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		
		sum+=i;
		printNSum(i+1,n,sum);
		System.out.println(i);
		
	}
	
	public static int calcFactorial(int n) {
		
		if(n == 1 || n == 0) {
			return 1;
		}
		int fact_nm1=calcFactorial(n-1);
		int fact_n=n*fact_nm1;
		return fact_n;
	}
	
	public static void printFib(int a,int b,int n) {
		if(n == 0) {
			return;
		}
		int c=a+b;
		System.out.println(c);
		printFib(b,c,n-1);
		
	}
	
	public static int calcPower(int x,int n) {
		
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
//		System.out.println("hey");
		int xPownm1=calcPower(x,n-1);
//		System.out.println(xPownm1+" luv ");
		int xPown=x*xPownm1;
		return xPown;
	}
	
	public static int calcPowerLogn(int x,int n) {
		
		if(n==0) {
			return 1;
		}
		if(n%2 == 0) {
			return calcPowerLogn(x,n/2) * calcPowerLogn(x,n/2);
		}else {
			return x * calcPowerLogn(x,n/2) * calcPowerLogn(x,n/2);
		}
	}
	
	public static void trialMulti(int n) {
		if(n==0) {
			return;
		}
		if(n==10) {
			return;
		}
//		System.out.println("- "+n+" -");
		trialMulti(n-1);
		System.out.println("$ "+n +" $");
		System.out.println("hh");
		trialMulti(n-1);
		System.out.println("=! "+(n*10)+" !=");
		
		
	}

	public static void main(String[] args) {
		int n=7;
		
//		printNumbers(n);
//		printNSum(1,n,0);
//		System.out.println(calcFactorial(n));
		
//		int a=0,b=1;
//		System.out.println(a);
//		System.out.println(b);
//		printFib(a,b,n-2);
		
		int x=2;
//		System.out.println(calcPower(x,5));
		
//		System.out.println(calcPowerLogn(x,5));
		
		trialMulti(5);
		
	}

}
