package exception;

public class InvalidVoterException extends RuntimeException{
	
	public InvalidVoterException(String desc) {
		super(desc);
	}

}
