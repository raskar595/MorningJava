package com.operator;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the to Check voter is Eligible for Voting or Not: ");
		int age=sc.nextInt();//15
		
		if(age>=18) {
			System.out.println("Voter is Eligible for Voting.");
		}
		else {
			System.out.println("Not Eligible for voting.");
			
		}

	}

}
