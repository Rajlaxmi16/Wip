package com.simpli.accessM;

public class WaitEx 
{
    private static Object LOCK = new Object();//Object is the built in class in Java
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);//it will go to sleep state for 1 second
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
        }
    }
}
