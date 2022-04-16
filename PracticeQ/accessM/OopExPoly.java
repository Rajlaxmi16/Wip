package com.simpli.accessM;

class Polygone2{
	void area() {
		System.out.println("Multiply sides");
	}
	void perimeter() {
		System.out.println("Add sides");
	}
}

class Triangle2 extends Polygone2{
	@Override
	void area() {
		System.out.println("Multiply height and base");
	}
	
}

class Square2 extends Polygone2{
	@Override
	void area() {
		System.out.println("square of one side");
	}
	
}



public class OopExPoly {

	public static void main(String[] args) {
		
		Triangle2 t= new Triangle2();
		Square2 s=new Square2();
		
		Polygone2 ref;
		
		ref=t;
		ref.area();
		ref.perimeter();
		
		ref=s;
		ref.area();
		ref.perimeter();
		
		
	}

}
