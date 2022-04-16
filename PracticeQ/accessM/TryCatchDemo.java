package com.simpli.accessM;

public class TryCatchDemo {

	public static void main(String[] args) {
		String s;
		
		try {
//			System.out.println(s);
			s="ab";
		}
		catch(NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
