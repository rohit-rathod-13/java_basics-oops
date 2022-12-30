package com.part1;

public class BasicSorting {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void bubbleSort() {
		int arr[]= {7,8,1,3,2};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) { 
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		printArray(arr);
	}
	
	public static void selectionSort() {
		int arr[]= {7,8,1,3,2};
		
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i; 
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[smallest]) {
					smallest=j;
				}
			}
//			swap
			int tmp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=tmp;
		}
		printArray(arr);
	}
	
	public static void insertionSort() {
		int arr[]= {7,8,1,3,2};
		
		for(int i=0;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > current) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=current;
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		
//		bubbleSort();
//		selectionSort();
		insertionSort();
	}

}
