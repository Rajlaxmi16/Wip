package com.simpli.accessM;

class Thrd2 implements Runnable{
	public void run() {
		System.out.println("Inside Thread runnable");
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		Thrd2 t=new Thrd2();
		//t.start(); start meth not available
		
		Thread t1=new Thread(t); // instead create obj of Thread
		t1.start();
		
	}

}
