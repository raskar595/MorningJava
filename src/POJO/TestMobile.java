package POJO;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Battery obj=new Battery(101, "Vivo", 800);
		
		Mobile mob=new Mobile(11, "Vivo Y11", 9800, obj);
		
		System.out.println(mob.getBattery().getPrice());

	}

}
