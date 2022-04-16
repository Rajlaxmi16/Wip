package com.simpli.accessM;

import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[]= {1,2,3,4,5};
		for(int i =0 ; i<5; i++) {
			System.out.println(a[i]);
		}
		
		 
		int b[]=new int[5];
		//b[0]=11;
		//b[1]=22;
		for(int i =0 ; i<5; i++) {
			b[i]=sc.nextInt();
		}
		for(int i =0 ; i<5; i++) {
			System.out.println(b[i]);
		}
		

	}

}
