package com.part1;

public class StringBuilders {
	
	public static void builderTest() {
		StringBuilder sb=new StringBuilder("apna college ");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		
		sb.insert(0, 'S');
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		sb.append("is best");
		System.out.println(sb); 
		
		System.out.println(sb.length());
		
	}
	
	public static void reverseStrings() {
		StringBuilder sb=new StringBuilder("HelloWorld");
		for(int i=0;i<sb.length()/2;i++) {
			int front=i;
			int back=sb.length()-i-1;
			
			char frontChar=sb.charAt(front);
			char backChar=sb.charAt(back);
//			System.out.println(frontChar);
//			System.out.println(backChar);
//			System.out.println(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
//		builderTest();
		reverseStrings();
	}

}
