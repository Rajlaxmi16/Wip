package com.simpli.accessM;

public class InnerClassEx2 {
	
	private String msg="Inner";
	
	void display() {
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
		Inner i= new Inner();
		i.msg();
		
	}
	
	
	

	public static void main(String[] args) {
		
		InnerClassEx2 obj=new InnerClassEx2();
		obj.display();

	}

}
