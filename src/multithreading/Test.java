package multithreading;

public class Test extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName("Suraj");
		
		System.out.println(Thread.currentThread().getName());

		Test th=new Test();
		th.start();
		

		Test th1=new Test();
		th1.start();
	}

}
