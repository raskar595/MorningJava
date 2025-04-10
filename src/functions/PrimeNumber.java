package functions;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check given number is Prime or Not: ");
		int num=sc.nextInt();//7
		
		boolean flag=true;
		
		for(int i=2; i<num; i++) {//i=2,3,4,5,6,7    <7
			if(num%i==0) {//1==0
				flag=false;
			}
		}
		
		if(flag==true) {
			System.out.println("Given number is Prime.");
		}
		else {
			System.out.println("Given number is Not Prime.");
		}

	}

}
