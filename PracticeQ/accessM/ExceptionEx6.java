package com.simpli.accessM;
import java.util.Scanner;
class Setnew{
	void display() throws Exception {
		System.out.println("display started");
	try {	
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
	catch(Exception e) {
		System.out.println("Exception handled");
		throw e;
	}
	finally {
		System.out.println("Dispaly terminated");
	}
	
}
public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println("Main");
		Setnew s1=new Setnew();
		try {
			s1.display();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main");
		}
		System.out.println("main terminated");
	}	
}	

}
