package stringhandling;

public class TimeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start,end;
		
//		start=System.currentTimeMillis();
		start=System.nanoTime();
		String str="Welcome To ";
		
		for(int i=1; i<=1000; i++) {
			str+=" Logipool";
		}
		end=System.nanoTime();
		
		System.out.println("String Takes "+(end-start)+" mili sec.");
		
		
	}

}
