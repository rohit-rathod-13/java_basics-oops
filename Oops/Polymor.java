package com.part1.Oops;

class Student1{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}
}

public class Polymor {
	
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.name="rohit";
		s1.age=21;
		s1.printInfo(s1.name,s1.age);
	}

}
