package com.simpli.accessM;
//Throws

class Code{
	void op() throws ArithmeticException{
		int a=44,b=0,res;
		if(b==0)
			throw(new ArithmeticException("Cant Divide by zero"));
		else {
			res=a/b;
			System.out.println(res);
		}
		System.out.println("End");
	}
}

public class ExceptionEx2 {

	public static void main(String[] args) {
		Code c=new Code();
		try {
			c.op();
		}
		catch(ArithmeticException e) {
			System.out.println("main:"+e.getMessage());
		}

	}

}
