package POJO;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ID: ");
		int id=sc.nextInt();
		
		System.out.println("Enter the Name: ");
		String name=sc.next();
		
		System.out.println("Enter the City: ");
		String city=sc.next();
		
		System.out.println("Enter the Marks: "); 
		int marks=sc.nextInt();

		Student obj=new Student();
		obj.setId(id);
		obj.setName(name);
		obj.setMarks(marks);
		obj.setCity(city);
		
		obj.show();
		
		
	}
}
