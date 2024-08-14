package Supplier;

public class Supplier {

	private int id;
	private String Name;
	private String Address;
	private String Phone;
	private String Email;
	
	public Supplier() {
	}

	public Supplier(String name, String address, String phone, String email) {

		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Email = email;
		
		

	}

	public Supplier(int id, String name, String address, String phone, String email) {
		this.id = id;
		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Email = email;
	}

	public Supplier(int id) {
		this.id = id;

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
		this.Name = name;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	
	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}


	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}




}
