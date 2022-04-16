package com.simpli.accessM;


import java.util.*;
public class ArrayEx2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		
				
		for(int i =0 ; i<a.length; i++) {
			for(int j =0 ; j<a[i].length; j++) {
				System.out.println("Enter:");
				a[i][j]=sc.nextInt();
				
			}
		}	
		
		for(int i =0 ; i<a.length; i++) {
			for(int j =0 ; j<a[i].length; j++) {
				System.out.println("Elements:");
				System.out.println(a[i][j]);
			}
		}	
	}

}
