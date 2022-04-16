import java.util.*;  
import java.io.*;
  
class Calculator {
    public static void main(String[] args)
    {
        
        int num1 , num2 ;
        char c;
  	    Scanner sc= new Scanner(System.in);
  	    
  	    num1=sc.nextInt();
  	    c=sc.next().charAt(0);
  	    num2=sc.nextInt();
  	    
		  
		while(true){
		    switch(c){
		        case '+':
		            System.out.println(num1+num2);
		            break;
		            
		      case '-':
		            System.out.println(num1-num2);
		            break; 
		            
		      case '*':
		            System.out.println(num1*num2);
		            break; 
		            
		      case '/':
		            System.out.println(num1/num2);
		            break; 
		      case '%':
		            System.out.println(num1%num2);
		            break;  
		      
		      default:
		            System.out.println("invalid operation");
		    }
		    break;
		}  
        
        
        
        
    }
}
