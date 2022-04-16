package com.simpli.accessM;

public class StringEx2 {

	public static void main(String[] args) {

		StringBuffer s= new StringBuffer("Heloo");
		System.out.println(s.append("World"));
		System.out.println(s.insert(0,"h")); //insert at beggining
		System.out.println(s.delete(0,5));
		System.out.println(s.reverse());
	}

}
