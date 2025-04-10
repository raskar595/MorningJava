package functions;

import java.util.Scanner;

public class Maths {
	//						3    5
	public void addition(int a,int b) {
		int sum=a+b;//sum=3+5
		System.out.println("The addition of A & B: "+sum);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Maths obj=new Maths();
		
		System.out.println("Enter the value of A: ");
		int a1=sc.nextInt();
		
		System.out.println("Enter the value of B: ");
		int b1=sc.nextInt();
		
		obj.addition(a1, b1);
	}

}
