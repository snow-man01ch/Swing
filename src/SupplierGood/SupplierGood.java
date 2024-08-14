package SupplierGood;

public class SupplierGood {
	
	
	private  int ID;
	private  int Id_sup;
	private  int Id_good;
	private  double Price;
	
	public SupplierGood() {}
	
	public SupplierGood( int id_sup, int id_good, double price ) {
		
		
		this.Id_sup = id_sup;
		this.Id_good = id_good;
		this.Price = price;
	}
	public SupplierGood(int id,int id_sup, int id_good, double price ) {
		this.ID = id;
		this.Id_sup = id_sup;
		this.Id_good = id_good;
		this.Price = price;
	}
	public SupplierGood(int id) {
		this.ID = id;
		
	}

	public int getid() {
		return ID;
	}

	public void setid(int id) {
		this.ID = id;
	}

	public int getId_sup() {
		return Id_sup;
	}

	public void setId_sup(int id_sup) {
		this.Id_sup = id_sup;
	}

	public int getId_good() {
		return Id_good;
	}

	public void setId_good(int id_good) {
		this.Id_good = id_good;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	
}
