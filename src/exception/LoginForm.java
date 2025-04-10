package exception;

import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String isEmail="admin@admin.com";
		String isPass="admin@123";
		
		System.out.println("Enter the Email: ");
		String email=sc.next();		
		
		System.out.println("Enter the Password: ");
		String pass=sc.next();
		
		if(isEmail.equals(email) && isPass.equals(pass)) {
			System.out.println("User Login successfully.");
		}
		else {
			throw new InvalidCredentialsException("wrong Credentials...!");
			
		}
		

	}

}
