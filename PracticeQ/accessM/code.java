package com.simpli.accessM;

public class code {
	
	public static void main(String [] args) {
		code c= new code();
		System.out.println(c.a);//public
		System.out.println(c.b);//public
		
		System.out.println(c.g);//default
		System.out.println(c.h);//default
		
		System.out.println(c.c);//private
		System.out.println(c.d);//private
		
		System.out.println(c.e);//protected
		System.out.println(c.f);//protected
	}

}
