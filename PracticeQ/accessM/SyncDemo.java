package com.simpli.accessM;

import java.io.*;//to deal with the file operations 
import java.util.*; 
class Sender 
{ 
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(5000);//making this thread to sleep for 1 second 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 

class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    Sender  sender; 
    ThreadedSend(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) //applying lock
        { 
            sender.send(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
        Sender snd = new Sender(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Hi " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); //until this thread executes s2 will not start
            S2.join(); //it will start after s1
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 