package loops;

public class DecrTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val=10;
		
		for(int i=1; i<=4; i++) {//i=1,2,3,4     <=4
			for(int j=i; j<=4; j++) {//j=4  <=4
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
			
		}

	}
	

}
