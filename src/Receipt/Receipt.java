package Receipt;

public class Receipt {
	
	private  int ID;
	private  String Data;
	private  int Cus_Id;
	private  double Total;
	
	public Receipt() {}
	
	public Receipt( String data,int cus_id, double total ) {
		
		this.Data = data;
		this.Cus_Id = cus_id;
		this.Total = total;
		
	}
	public Receipt(int id, String data, int cus_id, double total ) {
		this.ID = id;
		this.Data = data;
		this.Cus_Id = cus_id;
		this.Total = total;
	}
	public Receipt(int id) {
		this.ID = id;
		
	}

	public int getid() {
		return ID;
	}

	public void setid(int id) {
		this.ID = id;
	}

	public String getData() {
		return Data;
	}
	public void setData(String date) {
		this.Data = date;	
	}
	
	public int getCus_Id() {
		return Cus_Id;
	}

	public void setCus_Id(int cus_id) {
		this.Cus_Id = cus_id;
	}
	
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		this.Total = total;
	}
	
}
