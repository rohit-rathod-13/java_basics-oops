package com.part1;

public class Powerof2 {
	
	public static boolean powerOfTwoGeneral(int n) {
		while(n%2 == 0) {
			n=n/2;
		}
		if(n==1) {
			return true;
		}else {
			return false;
		}
	}
//	print("*" * (i+1))
	public static boolean powerOfTwoBitwise(int n) {
		return(n & n-1)==0;
	}

	public static void numbeeOfOnes() {
		int n=5;
		int count;
		for(count=0;n>0;++count) {
			n=n&n-1;	//0111 & 0110 ->> 0110
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
//		System.out.println("128 is the power of two : "+powerOfTwoGeneral(128));
//		System.out.println("64 is the power of two : "+powerOfTwoBitwise(64));
//		System.out.println("22 is the power of two : "+powerOfTwoBitwise(22));
//		System.out.println("324 is the power of two : "+powerOfTwoGeneral(324));
		
		numbeeOfOnes();
		
	}

}
