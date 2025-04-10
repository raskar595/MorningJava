package OOPS;

public class TestOperations implements Operations{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);//10
		System.out.println(pi);//
		int pi=23;
		System.out.println(pi);
		
	}
	
	public static void main(String[] args) {
		
		TestOperations obj=new TestOperations();
		obj.add(2, 8);
		Operations.hello();
	}

}
