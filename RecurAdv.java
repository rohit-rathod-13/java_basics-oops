package com.part1;

import java.util.ArrayList;

public class RecurAdv {

	public static void printPermutations(String str,String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char currChar=str.charAt(i);
//			"abc" --> "ab"
			String newStr=str.substring(0,i) + str.substring(i+1);
			printPermutations(newStr, permutation+currChar);
		}
		
	}
	
	public static int countMazePaths(int i,int j,int n,int m) {
		
		if(i == n || j == m) {
			return 0;
		}
		
		if(i==n-1 && j==m-1) {
			return 1;
		}
		
//		move downwards
		int downPaths=countMazePaths(i+1, j, n, m);
		
//		move right
		int rightPaths=countMazePaths(i,j+1,n,m);

		return downPaths + rightPaths;
		
	}
	
	public static int placeTiles(int n,int m) {
		
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		
//		vertically
		int vertPlacements=placeTiles(n-m,m);
		
//		horizontally
		int horPlacements=placeTiles(n-1, m);
		
		return vertPlacements + horPlacements;
		
	}
	
	public static int callGuests(int n) {
		
		if(n<=1) {
			return 1;
		}
		
//		single
		int ways1=callGuests(n-1);
		
//		pairs
		int ways2=(n-1) * callGuests(n-2);
		
		return ways1 + ways2;
		
	}
	
	public static void printSubset(ArrayList<Integer> subset) {
		
		for(int i=0;i<subset.size();i++) {
			System.out.print(" "+subset.get(i));
		}
		System.out.println();
	}
	
	public static void findSubset(int n,ArrayList<Integer> subset) {
		
		if(n==0) {
			printSubset(subset);
			return;
		}
		
//		add hoga
		subset.add(n);
		findSubset(n-1, subset);
		
//		add nhi hoga
		subset.remove(subset.size()-1);
		findSubset(n-1, subset);
	}
	
	
	public static void main(String[] args) {
		
		String str="abc";
//		printPermutations(str, "");
//		System.out.println(str.substring(0+1));
		
		int n=3,m=2;
//		int totPaths=countMazePaths(0, 0, n, m);
//		System.out.println(totPaths);
		
//		int placedTiles=placeTiles(n, m);
//		System.out.println(placedTiles);
		
//		int callGuest=callGuests(n);
//		System.out.println(callGuest);
		
		ArrayList<Integer> subset=new ArrayList<>();
		findSubset(n, subset);
		
	}

}
