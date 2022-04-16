package com.simpli.accessM;

abstract class absInnerClass{
	public abstract void display();  //abs method
}

public class InnerClassEx3 {

	public static void main(String[] args) {
		
		
		//anonymousinner types can create obj of abs class
		absInnerClass i=new absInnerClass() {
			
			
			//implementing abs method
			public void display() {
				System.out.println("obj of abs class");
			}
			
		};
		
		i.display();

	}

}