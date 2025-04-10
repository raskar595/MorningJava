package exception;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {//throw
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age to check given voter is Eligible for Voting or Not: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Voter is eligible for Voting.");
		}
		else {
			try {
				throw new InvalidVoterException("age < 18");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("The End.....");
	}

}
