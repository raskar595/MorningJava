package functions;

public class VotingSystem {
	
	public void checkVoter(int age) {
		
		if(age>=18) {
			System.out.println("Voter is Eligible");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VotingSystem obj=new VotingSystem();
		obj.checkVoter(19);

		
	}

}
