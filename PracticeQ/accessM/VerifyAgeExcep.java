package com.simpli.accessM;

import java.util.Scanner;

class OverAge extends Exception{
	
	public String toString() {
		return "Age is More";
	}
	
}
class UnderAge extends Exception{
	
	public String toString() {
		return "Age is Less";
	}
	
}

public class VerifyAgeExcep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		if(age<18) {
			UnderAge ua=new UnderAge();
			System.out.println(ua.toString());
			
		}
		else if(age>65) {
			OverAge oa=new OverAge();
			System.out.println(oa.toString());
			
		}
		else {
			
			System.out.println("Applicable");
			
		}
		

	}

}
