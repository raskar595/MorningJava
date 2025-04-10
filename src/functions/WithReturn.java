package functions;

public class WithReturn {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	public String greeting() {
		return "Nice to meeting you";
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WithReturn obj=new WithReturn();
//		int res=obj.add(4, 6);
//		System.out.println(res);
		
		System.out.println(obj.add(5, 5));
		
	}

}
