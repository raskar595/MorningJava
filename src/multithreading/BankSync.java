package multithreading;

public class BankSync extends Thread{
	
	static BankTransaction obj;

	public void run() {
		obj.withdralMoney(35);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 obj=new BankTransaction();
		
		BankSync th=new BankSync();
		th.start();

		BankSync th1=new BankSync();
		th1.start();

		BankSync th2=new BankSync();
		th2.start();
	}

}
