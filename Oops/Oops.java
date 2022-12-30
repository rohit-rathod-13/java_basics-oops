package com.part1.Oops;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing something..");
	}
	public void printColor() {
		System.out.println(this.color);
	}
}

class Student{
	String name;
	int age;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
//	Student(){
//		System.out.println("constructor called..");
//	}
//	Student(String name,int age){
//		this.name=name;
//		this.age=age;
//	}
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age;
	}
	Student(){
		
	}
}

public class Oops {

	public static void main(String[] args) {
//		Pen pen1=new Pen();
//		pen1.color="blue";
//		pen1.type="gel";
//		pen1.write();
//		Pen pen2=new Pen();
//		pen2.color="black";
//		pen2.type="ballpoint";
//		
//		pen1.printColor();
//		pen2.printColor();
		
//		________________________
//		Student s1=new Student("aman",24);
//		s1.name="avani";
//		s1.age=21;
		Student s1=new Student();
		s1.name="aman";
		s1.age=24;
		
		Student s2=new Student(s1);
		s2.printInfo();

	}

}
