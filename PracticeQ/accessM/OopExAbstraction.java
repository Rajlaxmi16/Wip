package com.simpli.accessM;

abstract class Polygone1{
	abstract void area() ; //abs method without implementation
	void perimeter() {
		System.out.println("Add sides");
	}
}

class Triangle1 extends Polygone1{
	@Override
	void area() { //implementation
		System.out.println("Multiply height and base");
	}
	
	
}

class Square1 extends Polygone1{
	@Override
	void area() { //implementation
		System.out.println("square of one side");
	}
	
}



public class OopExAbstraction {

	public static void main(String[] args) {
		
		Triangle1 t=new Triangle1();
		Square1 s=new Square1();
		
		t.area();
		t.perimeter();
		
		s.area();
		s.perimeter();
		

	}

}
