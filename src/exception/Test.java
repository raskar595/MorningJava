package exception;

public class Test {
	
	
	public void division(int a,int b) {
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj=new Test();
		obj.division(3, 0);
		
		System.out.println("Bye");

	}

}
