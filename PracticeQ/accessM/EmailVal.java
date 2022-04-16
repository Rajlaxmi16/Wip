package com.simpli.accessM;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailVal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> arrmails = new ArrayList<String>();  
        arrmails.add("abdfjnkrmf@gmail.com");  
        arrmails.add("abdfjnkrmf@gmail.com");  
        arrmails.add("rajlaxmipatil077@gmail.com");  
        arrmails.add("abcd#@co.in");  
        arrmails.add("javaTpoint@domain.com");  
        arrmails.add("javaTpoint@domaincom");
        
        String re="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p= Pattern.compile(re);
        
		System.out.println("Enter Mail Id:");
		String mail=sc.next();
		
		for(String m:arrmails) {
			
			Matcher mt= p.matcher(m);
			if(mail.equals(m)) {
				System.out.println(mt.matches());
			}
			else {
				System.out.println("false");
			}
			
		}
		
	}

}
