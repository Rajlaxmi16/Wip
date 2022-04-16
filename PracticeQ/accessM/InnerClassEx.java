package com.simpli.accessM;

public class InnerClassEx {
	
		private String msg="Hello";
		class Inner{
			void hello() {
			System.out.println(msg);
			}
		}
		
		public static void main(String [] args) {
			
			InnerClassEx obj=new InnerClassEx();
			InnerClassEx.Inner in = obj.new Inner();
			in.hello();
			
		}

	
}
