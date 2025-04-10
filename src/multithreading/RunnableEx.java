package multithreading;

public class RunnableEx implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableEx rn=new RunnableEx();
		
		Thread th=new Thread(rn);
		th.start();
	}

}
