package stringhandling;

public class StringEx extends Thread{
	
	private StringBuilder str;
	
	public StringEx(StringBuilder str) {
		this.str = str;
	}

	public void run() {
		for(int i=1; i<=1000; i++) {
			str.append("c");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		StringBuilder str=new StringBuilder();
		
	

		StringEx th=new StringEx(str);
		th.start();
		
		StringEx th1=new StringEx(str);
		th1.start();
		
		th.join();
		th1.join();
		
		System.out.println(str.length());
		
		
	}

}
