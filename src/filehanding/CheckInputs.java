package filehanding;

import java.util.Scanner;

public class CheckInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter your Name: ");
		sc.nextLine();//
		String name=sc.nextLine();

		System.out.println("Enter your City: ");
		String city=sc.nextLine();
		
		System.out.println(id+" "+name+" "+city);
	}

}
