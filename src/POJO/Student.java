package POJO;

public class Student {

	private int id;
	private String name;
	private String city;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//				101         Suraj       Punen      77
	public Student(int id,String name,String city,int marks) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.marks=marks;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public void show() {
		System.out.println("Id: "+id+",Name: "+name+",City: "+city+",Marks "+marks);
	}
}
