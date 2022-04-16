package com.simpli.accessM;

class Polygone{
	void area() {
		System.out.println("Multiply sides");
	}
	void perimeter() {
		System.out.println("Add sides");
	}
}

class Triangle extends Polygone{
	@Override
	void area() {
		System.out.println("Multiply height and base");
	}
	
	
}

class Square extends Polygone{
	@Override
	void area() {
		System.out.println("square of one side");
	}
	
}

public class OopExInheritance {

	public static void main(String[] args) {
		
		Polygone p=new Polygone();
		Triangle t=new Triangle();
		Square s=new Square();
		
		t.area();
		t.perimeter();
		
		s.area();
		s.perimeter();
		

	}

}
