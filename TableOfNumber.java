package com.part1;
import java.util.*;

public class TableOfNumber {

	public static void main(String[] args) {
		int n,table=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			table=n*i;
			System.out.print(table+ " ");
		}
		
	}

}
