package Product;

public class Good {

	public int id;
	public String Name;
	public double Price;
	public String Description;
	public int Stock;

	public Good() {

	}

	public Good(int id, String name, double price, String description, int stock) {
		this.id = id;
		this.Name = name;
		this.Price = price;
		this.Description = description;
		this.Stock = stock;
	}

	public Good( String name, double price, String description, int Stock) {
		
		
		this.Name = name;
		this.Price = price;
		this.Description = description;
		this.Stock = Stock;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getDesc() {
		return Description;
	}

	public void setDesc(String description) {
		Description = description;
	}
	
	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

}
