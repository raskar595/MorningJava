package com.operator;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		
		
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		
		int sum=a+b;
		
		System.out.println("The addition of A & B: "+sum);
		
		sc.close();
	}
	

}
