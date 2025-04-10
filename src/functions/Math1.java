package functions;

import java.util.Scanner;

public class Math1 {
	//				  2		3
	public int pow(int a,int b) {
		
		int res=1;//1
		
		for(int i=1; i<=b; i++) {//i=1,2,3,4    <=3
			res*=a;//res=8
		}
		
		return res;//8
	}
	
	public int count(int n) {//153
		
		int res=0;//0
		
		while(n!=0) {//0!=0
			n=n/10;//n=0
			res++;//3
		}
		
		return res;//3
	}
	//                     153
	public void armstrong(int n) {
		
		int temp=n;//153
		int rem=0;
		int res=0;
		
		while(temp!=0) {//0!=0
			rem=temp%10;//rem=1
			res=res+pow(rem,count(n));//res=153
			temp=temp/10;//temp=0
		}
		
		if(res==n) {//153==153
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is Not Armstrong.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math1 obj=new Math1();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check Armstrong or Not: ");
		int num=sc.nextInt();
		
		obj.armstrong(num);
		

	}

}
