package loops;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to print the Table: ");
		int n=sc.nextInt();//9
		
		for(int i=1; i<=10; i++) {//i=1,2     <=10
			System.out.println(n+" x "+i+" = "+(n*i));
		}// 7 x 1 = 7

	}

}
