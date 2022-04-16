package com.simpli.accessM;

import java.io.*;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		File f= new File("F:\\WiproTraining\\java\\FileIO.txt");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.list());
		System.out.println(f.canExecute());
		System.out.println(f.getParent());
		System.out.println(f.isHidden());
		File f1=new File("F:\\WiproTraining");
		System.out.println(f1.isDirectory());
		

	}

}
