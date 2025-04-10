package OOPS;

public class TestAbstractEx extends AbstractEx{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Let's come to the point.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAbstractEx obj=new TestAbstractEx();
		obj.bye();
		obj.show();
	}

}
