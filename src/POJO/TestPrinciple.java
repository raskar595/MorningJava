package POJO;

public class TestPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher obj=new Teacher(101, "Suraj Raskar", "Assi. Proff.", 1800);
		
		Principle princ=new Principle(11, "Amol Bhagat", "ASSIM", obj);
		
		System.out.println(princ.getTeacher().getName());

	}

}
