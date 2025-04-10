package com.operator;

public class IncrDecr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=6;
		
		System.out.println(a - b + b-- + a);//10 - 6 + 6 + 10=20 a:10 b:6
		System.out.println(b-- + a + 7);//5 + 10 +7 =22 b:4 a:10
		System.out.println(--b - a + a);//3 
		System.out.println(a);//10
		System.out.println(b);//3
	}

}
