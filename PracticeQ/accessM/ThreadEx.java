package com.simpli.accessM;

class Thrd extends Thread{
	public void run() {
		System.out.println("Inside Thred");
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		Thrd t=new Thrd();
		t.start(); //thread assigned tu thread scheduller
					//check and executes run meth
	}

}
