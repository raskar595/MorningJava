package multithreading;

public class BankTransaction {
	
	static int totalBalence=100;
	
	public static synchronized void withdralMoney(int rupees) {
		if(totalBalence>=rupees) {
			System.out.println(rupees+" rupees withdral Successfully.");
			totalBalence-=rupees;
			System.out.println(totalBalence+" rupees Available.");
		}
		else {
			System.out.println("Insufficient balence...!");
			System.out.println(totalBalence+" rupees Available.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
