package ReceiptDetalis;

public class ReceiptDetalis01 {
	private int Id;
	private int Rec_id ;
	private int Good_id;
	private int Qua;
	private double Amount;
	
	public ReceiptDetalis01() {
		
	}
	public ReceiptDetalis01(int id, int rec_id, int good_id, int qua, double amount) {
			this.Id = id;
			this.Rec_id = rec_id;
			this.Good_id = good_id;
			this.Qua = qua;
			this.Amount = amount;
	}
	
	public int getid() {
		return Id;
		
	}
	public void setid(int id) {
		this.Id = id;
		
	}
	public int getRec_id() {
		return Rec_id;
		
	}
	public void setRec_id(int rec_id) {
		this.Rec_id = rec_id;
		
	}
	public int getGood_id() {
		return Good_id;
	}
	public void setGood_id(int good_id) {
		this.Good_id = good_id;
	}
	public int getQua() {
		return Qua;
	}
	public void setQua(int qua) {
		this.Qua = qua;
	}

	public double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		this.Amount = amount;
	}

	
}
