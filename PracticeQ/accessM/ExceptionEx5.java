package com.simpli.accessM;

import java.util.*;
class Set1{
	void display() throws ArithmeticException {
		Scanner s=new Scanner(System.in);
		System.out.println("Arith");
		System.out.println("Enter val");
		int v1=s.nextInt();
		System.out.println("Enter val");
		int v2=s.nextInt();
		int res=v1/v2; //critical statement
		System.out.println(res);
		System.out.println("Arith end");
	}
	
}
class Set2{
	void display2() throws ArithmeticException {
		Set1 s1 =new Set1();
		s1.display();
		
	}
}
class Set3{
	void disply3() throws ArithmeticException {
		Set2 s2 =new Set2();
		s2.display2();
	}	
	
}

public class ExceptionEx5 {

	public static void main(String[] args) {
		Set3 s3=new Set3();
		try {
			s3.disply3();
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled in main");
		}
		

	}

}
