package loops;

public class HalfPyrmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {//i=1,2    <=4
			for(int j=i; j<=4; j++) {//j=2,3,4   <=4
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {//k=1,2   <=2
				System.out.print("*");
			}
			for(int k=2; k<=i;k++) {//k=2   <=2
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//second half
		
		for(int i=3; i>=1; i--) {//i=1,2    <=4
			for(int j=4; j>=i; j--) {//j=2,3,4   <=4
				System.out.print(" ");
			}
			for(int k=i; k>=1;k--) {//k=1,2   <=2
				System.out.print("*");
			}
			for(int k=i; k>=2;k--) {//k=2   <=2
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
