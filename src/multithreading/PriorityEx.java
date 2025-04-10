package multithreading;

public class PriorityEx extends Thread{
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			Thread.currentThread().setPriority(MAX_PRIORITY);
			System.out.println("Child "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		PriorityEx th=new PriorityEx();
		th.start();
		
		for(int i=1; i<=5; i++) {
			Thread.currentThread().setPriority(MIN_PRIORITY);
			System.out.println("main: "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
