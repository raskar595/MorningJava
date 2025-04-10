package OOPS;

public class OverloadingEx {
	
	public void show(char num) {
		System.out.println("Show1");
	}
	
	public void show(int val) {//
		System.out.println("Show2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingEx obj=new OverloadingEx();
		obj.show('a');

	}

}
