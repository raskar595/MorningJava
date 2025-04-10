package com.operator;

import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check given number is Even or Odd:");
		int a=sc.nextInt();//13
		
		if(a%2==0) {//13%2
			System.out.println("The number is Even.");
		}
		else {
			System.out.println("The given number is Odd.");
		}
		
		

	}

}
