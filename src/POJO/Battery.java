package POJO;

public class Battery {
	
	private int id;
	private String name;
	private int price;
	
	public Battery() {
		// TODO Auto-generated constructor stub
	}

	public Battery(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Battery [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
