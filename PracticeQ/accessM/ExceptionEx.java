package com.simpli.accessM;

public class ExceptionEx extends Exception {

	public static void main(String[] args) {
		int [] arr=new int[3];
		try {
			arr[7]=3;
		}
		catch(ArrayIndexOutOfBoundsException e){
			//This executes by defalt because of we have specified the exc type
			System.out.println("index out of bound");
		}
		catch(Exception e) {//generic
			//If not specified this block will execute
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("The array is of size 3");
		}
		

	}

}
