package com.simpli.accessM;

public class StringEx {

	public static void main(String[] args) {
		String s1= "Hello";
		String s2= new String();
		String s3= new String("Java");
		//cannot contain 2 parameterized constructor
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String sub=new String("HelloWorld");
		System.out.println(sub.substring(0,5));
		System.out.println(sub.isEmpty()); //checks empty
		
		String str1="hello";
		String str2="heldo";
		System.out.println(str1.compareTo(str2)); //unmatched char s1-s2
		System.out.println(str2.replace('d', 'l'));
		System.out.println(str1.equals(str2));
		
		
		String s="AbcdSdak";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(4));
		System.out.println(s.endsWith("dak"));
		System.out.println(s.contains("A"));
		System.out.println(s.startsWith("A"));
		System.out.println(s.length());
				

	}

}
