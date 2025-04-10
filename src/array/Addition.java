package array;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		int brr[][]=new int[n][n];
		int crr[][]=new int[n][n];
		
		//Arr Input
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("arr["+i+"]["+j+"] = ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Brr Input
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("brr["+i+"]["+j+"] = ");
				brr[i][j]=sc.nextInt();
			}
		}
		
		//Addition of Arr & Brr
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
