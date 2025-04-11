package stringhandling;

public class TimeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start,end;
		
		start=System.nanoTime();
		String str="Welcome To ";
		
		for(int i=1; i<=1000; i++) {
			str+=" Logipool";
		}
		end=System.nanoTime();
		
		System.out.println("String Takes "+(end-start)+" Nano sec.");
		
		//Buffer
		
		start=System.nanoTime();
		StringBuffer str1=new StringBuffer("Welcome To ");
		
		for(int i=1; i<=1000; i++) {
			str1.append(" Logipool");
		}
		end=System.nanoTime();
		
		System.out.println("StringBuffer Takes "+(end-start)+" Nano sec.");
		
		//Builder
		
				start=System.nanoTime();
				StringBuilder str2=new StringBuilder("Welcome To ");
				
				for(int i=1; i<=1000; i++) {
					str2.append(" Logipool");
				}
				end=System.nanoTime();
				
				System.out.println("StringBuilder Takes "+(end-start)+" Nano sec.");		
		
		
	}

}
