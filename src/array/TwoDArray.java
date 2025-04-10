package array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];//3x3
		
		for(int i=0; i<n; i++) {//i=0,1    <3
			for(int j=0; j<n; j++) {//j=0  <3
				System.out.print("arr["+i+"]["+j+"] = ");
				arr[i][j]=sc.nextInt();
			}
		}
		//print matrix
	
		
//		for(int i=0; i<n; i++) {//i=0,1    <3
//			for(int j=0; j<n; j++) {//j=0  <3
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		int res=0;
		
		for(int i=0; i<n; i++) {//i=0,1    <3
			for(int j=0; j<n; j++) {//j=0  <3
				res+=arr[i][j];
			}
			System.out.println();
		}

	}

}
