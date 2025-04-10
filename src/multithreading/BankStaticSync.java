package multithreading;

public class BankStaticSync extends Thread{

	private int rupees;
	private BankTransaction bt;
	//								35       obj
	public BankStaticSync(int rupees, BankTransaction bt) {
		this.rupees = rupees;
		this.bt = bt;
	}
	
	public void run() {
		bt.withdralMoney(rupees);
	}
	
	public static void main(String[] args) {
		
		BankTransaction obj=new BankTransaction();
		
		BankStaticSync th=new BankStaticSync(35,obj);
		th.start();
		
		BankTransaction obj1=new BankTransaction();
		
		BankStaticSync th1=new BankStaticSync(35,obj1);
		th1.start();

		BankTransaction obj2=new BankTransaction();
		
		BankStaticSync th2=new BankStaticSync(35,obj2);
		th2.start();
	}

}
