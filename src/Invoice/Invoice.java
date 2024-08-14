package Invoice;

public class Invoice {

	private	int Id_inv;
	private	int Id_sup;
	private	String Date;
	private	int Total;
	
	private	int Id_good;
	private	int Status;
	private	int Amount;
	private	int Quanity;

	public Invoice() {
		
	}

	
	public Invoice(int id_inv, int status,int amount,int quanity 
			, int id_good,int id_sup, int total,String date  ) {

		this.Id_good = id_good;
		this.Status = status;
		this.Amount = amount;
		this.Quanity=quanity;
		this.Id_inv = id_inv;
		this.Id_sup = id_sup;
		this.Total = total;
		this.Date = date;
		
	}


	public int getId_inv() {
		return Id_inv;
	}
	public void setId_inv(int id_inv) {
		this.Id_inv = id_inv;
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


	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}


	public int getQuanity() {
		return Quanity;
	}
	public void setQuanity(int quanity) {
		this.Quanity = quanity;
	}


	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		this.Status = status;
	}


	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		this.Amount = amount;
	}

	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		this.Total = total;
	}

}

