package com.simpli.accessM;

class Student{
	String name;
	int roll;
	String branch;
	double marks;
	
	Student(){
		
	}
	Student(String n){
		name=n;
	}
	Student(String n,int r){
		name=n;
		roll=r;
		
	}
	Student(String n,int r,String b){
		name=n;
		roll=r;
		branch=b;
	}
	Student(String n,int r,String b,double f){
		name=n;
		roll=r;
		branch=b;
		marks=f;
	}
}

public class ConstructEx {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s1.branch);
		System.out.println(s1.marks);
		System.out.println("\n");
		
		Student s2=new Student("raj");
		System.out.println(s2.name);
		System.out.println(s2.roll);
		System.out.println(s2.branch);
		System.out.println(s2.marks);
		System.out.println("\n");
		
		Student s3=new Student("raj",44);
		System.out.println(s3.name);
		System.out.println(s3.roll);
		System.out.println(s3.branch);
		System.out.println(s3.marks);
		System.out.println("\n");
		
		Student s4=new Student("raj",44,"cse");
		System.out.println(s4.name);
		System.out.println(s4.roll);
		System.out.println(s4.branch);
		System.out.println(s4.marks);
		System.out.println("\n");
		
		Student s5=new Student("raj",44,"cse",99.9);
		System.out.println(s5.name);
		System.out.println(s5.roll);
		System.out.println(s5.branch);
		System.out.println(s5.marks);
		
	}
	

}
