package com.part1;

import java.util.HashSet;

public class RecurInter {

	public static void towerOfHanoi(int n,String src,String help,String dest) {
		if(n==1) {
			System.out.println("transfer disk :: "+n+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1, src, dest, help);
		System.out.println("transfer disk :: "
				+ ""+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1, help, src, dest);
	}
	
	public static void reverseString(String str,int idx) {
		if(idx==0) {
			System.out.println(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx)+" ");
		reverseString(str,idx-1);
	}
	
	public static int first=-1;
	public static int last=-1;
	
	public static void findOccurance(String str,int idx,char ele) {
		
		if(idx==str.length()) {
			System.out.println("first :: "+first);
			System.out.println("last :: "+last);
			return;
		}
		char currChar=str.charAt(idx);
		if(currChar == ele) {
			if(first == -1) {
				first=idx;
			}
			else {
				last=idx;
			}
		}
		
		findOccurance(str, idx+1 , ele);
		
	}
	
	public static boolean isSorted(int arr[],int idx) {
		
		if(idx == arr.length-1) {
			return true;
		}
		
		if(arr[idx] >= arr[idx+1]) { 
//			array is unsorted 
			return false;
		}else {
			return isSorted(arr,idx+1);
		}
		
	}
	
	public static void moveAllX(String str,int idx,int count,String newString) {
		
		if(idx == str.length()) {
			for(int i=0;i<count;i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		
		char currChar=str.charAt(idx);
		if(currChar == 'x') {
			count++;
			moveAllX(str,idx+1,count,newString);
		}else {
			newString += currChar;
			moveAllX(str, idx+1, count, newString);
		}
		
	}
	
	public static boolean[] map=new boolean[26];
	
	public static void removeDuplicates(String str,int idx,String newString) {
//		for(int i=0;i<map.length-1;i++) 
//			System.out.println(map[i]);
		
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currChar=str.charAt(idx);
		if(map[currChar - 'a'] == true) {
			removeDuplicates(str, idx+1,newString);
		}else {
			newString += currChar;
			map[currChar - 'a']=true;
			removeDuplicates(str, idx+1, newString);
		}
		
	}
	
	public static void printSubseq(String str,int idx,String newString) {
		
		if(idx==str.length()) {
			System.out.println(newString);
			return;
		}
		//choose
		printSubseq(str,idx+1,newString+str.charAt(idx));
		
		//don't choose
		printSubseq(str, idx+1, newString);
	}
	
	public static void printUnqSubseq(String str,int idx,String newString,HashSet<String> set) {
		
		if(idx==str.length()) {
			if(set.contains(newString)){
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
			
		}
		
//		to be
		printUnqSubseq(str, idx+1, newString+str.charAt(idx),set);
		
//		not to be
		printUnqSubseq(str, idx+1, newString,set);
	}
	
	public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void printKeypadCombi(String str,int idx,String combination) {
		
		if(idx==str.length()) {
			System.out.println(combination);
			return;
		}
		
		char currChar=str.charAt(idx);
		String mapping=keypad[currChar-'0'];
		
		for(int i=0;i<mapping.length();i++) {
			printKeypadCombi(str, idx+1, combination+mapping.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		
		String str="abcd"; 
		String strOccur="abaacdaefaah";
		int arr[]= {1,3,5,7,7};
		String strMove="axbcxxd";
		String strDuplicate="abbcdab";
		String strSubseq="abc";
		String strSubseq1="aaa";
		HashSet<String> set=new HashSet<>();
		
//		towerOfHanoi(3,"A","B","C");
//		reverseString(str,str.length()-1);
//		findOccurance(strOccur, 0 , 'a');
//		System.out.println(isSorted(arr,0));
//		moveAllX(strMove, 0 , 0 , "");
//		removeDuplicates(strDuplicate, 0 , "");
//		printSubseq(strSubseq, 0, "");
//		printUnqSubseq(strSubseq1, 0, "",set);
		
		String strCombi="23";
		printKeypadCombi(strCombi, 0, "");
		
	}

}
