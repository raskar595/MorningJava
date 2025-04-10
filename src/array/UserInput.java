package array;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();//3
		
		int arr[]=new int[n];//3
		
		System.out.println("Enter the Array: ");
		
		for(int i=0; i<arr.length; i++) {//i=0,1,2,3    <3
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();//arr[2]=
		}
		
		System.out.println("The given array: ");
		
		for(int i=0; i<arr.length; i++) {//i=0,1,2,3    <3
			System.out.print(arr[i]+" ");
		}
		

	}

}
