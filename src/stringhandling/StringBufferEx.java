package stringhandling;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf=new StringBuffer();
		sbf.append("Hello My name is Suraj");//  (oldsize x 2) + 2
		sbf.append("Hello My name is");//  (34 x 2) + 2
		
		System.out.println(sbf.capacity());
		
		
		StringBuilder sb=new StringBuilder();
		sb.append("Hello My name is Suraj");//  (oldsize x 2) + 2
		sb.append("Hello My name is");//  (34 x 2) + 2
		
		System.out.println(sbf.capacity());
	}

}
