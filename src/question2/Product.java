package question2;

public class Product {
	protected int pID;
	protected double price;
	protected int quantity;
	 
	public Product(int pID,double price, int quantity) {
		this.pID=pID;
		this.price=price;
		this.quantity=quantity;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}