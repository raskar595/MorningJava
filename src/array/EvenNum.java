package array;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the Array: ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		
//		for(int i=0; i<arr.length; i++) {//i=0    <6
//			if(arr[i]%2==0) {//1==0
//				System.out.print(arr[i]+" ");
//			}
//		}
		
		int res=0;
		
		for(int i=0; i<arr.length; i++) {//i=0,1
			res=res+arr[i];//res=9
		}
		
		System.out.println("Sum of all elements from Array: "+res);

	}

}
