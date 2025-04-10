package functions;

import java.util.Scanner;

public class NumberGuess {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double num=Math.random()*10;
		int val=(int)num;
		
//		System.out.println(val);5
		
		System.out.println("Enter the value to try your Luck: ");
		int magic=sc.nextInt();//7
		int count=1;
		
		
		while(magic!=val) {//5!=5
			System.out.println("Wrong Guess try Again: ");
			magic=sc.nextInt();//5
			count++;//2
		}
		
		System.err.println("Congratulations you have won 100000 rupees At chance "+count);

	}

}
