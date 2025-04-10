package com.operator;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Java Marks: ");
		int java=sc.nextInt();

		System.out.println("Enter the Python Marks: ");
		int python=sc.nextInt();

		System.out.println("Enter the mysql Marks: ");
		int mysql=sc.nextInt();

		System.out.println("Enter the cpp Marks: ");
		int cpp=sc.nextInt();

		System.out.println("Enter the HTML Marks: ");
		int html=sc.nextInt();
		
		int sum=java+python+mysql+cpp+html;
		
		int per=sum/5;
		
		if(per>90 && per<=100) {
			System.out.println("Grade A");
		}
		else if(per>80 && per<=90) {
			System.out.println("Grade B");
		}
		else if(per>70 && per<=80) {
			System.out.println("Grade C");
		}
		else if(per>60 && per<=70) {
			System.out.println("Grade D");
		}
		else if(per<35) {
			System.out.println("Fail");
		}
		

	}

}
