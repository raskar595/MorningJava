package OOPS;

class Animal{
	public void animal() {
		System.out.println("Pet Animal");
	}
}

class Cat extends Animal{
	public void cat() {
		System.out.println("Meoww");
	}
}

class Dog extends Animal{
	public void dog() {
		System.out.println("Bark");
	}
}
public class HierarchicalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog obj=new Dog();
		obj.animal();
		obj.dog();
	}

}
