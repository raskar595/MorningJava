package multithreading;

public class Earnings extends Thread{
	
	int totalEarnings=0;
	public void run() {
		
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				totalEarnings+=100;
			}
			notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Earnings th=new Earnings();
		th.start();
		
		synchronized (th) {
			th.wait();
			System.out.println(th.totalEarnings);//1000
		}

	}

}
