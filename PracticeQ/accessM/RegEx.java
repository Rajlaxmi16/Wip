package com.simpli.accessM;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		String pattern ="[a-z]+";
		String check="HelloWorld";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(check);
		System.out.println(m);
		
		while(m.find()) {
			System.out.println(m.group(0));
		}
		
//		while (m.find()) {
//			System.out.println(check.substring(m.start(),m.end()));
//		}

	}

}
