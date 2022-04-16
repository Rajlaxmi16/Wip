package com.simpli.accessM;

class MyException extends Exception{
	
	String s1;
	MyException(String s2){
		s1=s2;
	}
	public String toString() {
		return ("Custom Ex occured"+s1);
	}
	
}


public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println("Starting try");
			throw new MyException("Error msg");
		}
		catch(MyException ex) {
			System.out.println("catch block");
			System.out.println(ex);
			
		}
	}

}
