package com.simpli.accessM;

import java.util.Scanner;

class Data{
	void disp() {
		System.out.println("Data from disp");
	}
}
public class ExceptionEx4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Array");
			System.out.println("Enter Size");
			int n=s.nextInt();
			int arr[]=new int[n];//dynamic allocation
			System.out.println("Enter position");
			int pos=s.nextInt();
			System.out.println("Enter element");
			int ele=s.nextInt();
			arr[pos]=ele;
			System.out.println("Array activity ended");
			System.out.println("Object activity");
			
			Data d= new Data();
			d.disp();
			System.out.println("Object activity ended");
			System.out.println("Arith");
			System.out.println("Enter val");
			int v1=s.nextInt();
			System.out.println("Enter val");
			int v2=s.nextInt();
			int res=v1/v2; //critical statement
			System.out.println(res);
			System.out.println("Arith end");			
			
		}
		//1.Single catch(not specific)
//		catch(Exception e) {
//			System.out.println("Exception handled");
//		}
		
		
		//2.multiple catch
//		catch(ArithmeticException e1){
//			System.out.println("Arithmetic Exception handled");
//		}
//		catch(ArrayIndexOutOfBoundsException e2){
//			System.out.println("Arithmetic Exception handled");
//		}
//		catch(NullPointerException e3){
//			System.out.println("Null pointer Exception handled");
//		}
//		catch(Exception e) {
//			System.out.println("Exception handled");
//		}
		
		//3.multi catch
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Runtime exception detected");
		}
		

	}

}
