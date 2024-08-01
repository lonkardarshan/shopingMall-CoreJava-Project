package Shpoing;

public class Product {
	private String id;
	private String productName;
	private int Quntity;
	private double price;
	private double totalPrice;

	public Product(String id, String productName, int quntity, double price, double totalPrice) {
		super();
		this.id = id;
		this.productName = productName;
		Quntity = quntity;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuntity() {
		return Quntity;
	}

	public void setQuntity(int quntity) {
		Quntity = quntity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public static void displyfromart() {
		System.out.format(
				"----------------------------------------------------------------"
				+ "---------------------------------------------------------\n");
		
	}
	public void disply() {
		System.out.format("%9s     %9s     %5d     %9.2f      %14.2f\n",id, productName,Quntity, price, totalPrice);
	}
}
 

