import java.util.*;  
import java.io.*;
  
class Grade {
    public static void main(String[] args)
    {
        
        int marks;
  	    Scanner sc= new Scanner(System.in);
  	    
  	    marks=sc.nextInt();
  	    
		if(marks>=90){
		    System.out.println("A+ distinction");
		}
		else if(marks>=80 && marks<90){
		    System.out.println("A first class with distinction");
		}
		else if(marks>=65 && marks<80){
		    System.out.println("B+ first class");
		}
		else if(marks>=50 && marks<65){
		    System.out.println("B second class");
		}
		else if(marks<50 && marks>0){
		    System.out.println("C third class");
		}
        
        
        
        
    }
}
