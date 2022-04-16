package com.simpli.accessM;

interface calci1{
	void add();
}
interface calci2{
	void sub();
}

class childcalci implements calci1,calci2{

	@Override
	public void sub() {
		System.out.println("SUB");
		
	}

	@Override
	public void add() {
		System.out.println("ADD");
		
	}
	
}

public class OopExDiamond {

	public static void main(String[] args) {
		childcalci c=new childcalci();
		c.add();
		c.sub();
		

	}

}
