package loops;

public class IncrTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {//i=1,2,3,4    <=4  
			for(int j=1; j<=i; j++) {//j=1,2,3,4   <=4
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
