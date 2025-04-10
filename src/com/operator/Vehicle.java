package com.operator;

class Parent{
	public void show() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public void show1() {
		System.out.println("Child");
	}
}

public class Vehicle{
	

	public static void main(String[] args) {
		
		Parent obj=new Child();
		obj.show();
		
		Child chl=(Child) obj;
		chl.show1();
		
		int val=10;
		double num=val;
		int val1=(int)num;
		
		
	}

}
