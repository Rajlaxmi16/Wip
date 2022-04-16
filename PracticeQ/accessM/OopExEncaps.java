package com.simpli.accessM;

class Student1{
	private String name;
	private String branch;
	private int roll;
	private float marks;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}
	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}
	/**
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Student1(String name, String branch, int roll, float marks) {
		super();
		this.name = name;
		this.branch = branch;
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", branch=" + branch + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	
}

public class OopExEncaps {

	public static void main(String[] args) {
		Student1 s=new Student1("raj","cse",44,90);
		System.out.println(s.toString());
		s.setBranch("etc");
		//s.name="abc"; error cus of private member, accessed outside class
		System.out.println(s.getBranch());

	}

}
