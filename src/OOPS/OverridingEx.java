package OOPS;

class Check{
	public void show() {
		System.out.println("Check1");
	}
}

class Check1 extends Check{
	public void show() {
		System.out.println("Check2");
		super.show();
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Check1 obj=new Check1();
		obj.show();

	}

}
