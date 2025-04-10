package OOPS;

class GrandParent{
	public void test() {
		System.out.println("Grand Parent.");
	}
}

class Parent extends GrandParent{
	public void show() {
		System.out.println("This is Parent");
	}
}

class Child extends Parent{
	public void check() {
		System.out.println("This is Child.");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj=new Child();
		obj.check();
		obj.show();
		obj.test();

	}

}
