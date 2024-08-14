package Customer;

public class Customer {
	
	private int id;
	private String Name;
	private String Address;
	private String Phone;
	private String Email;
	private String Username;
	private String Password;
	
	
	
	public Customer() {}
	
	public Customer(String name, String address, String phone, String email,String username, String password) {
		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Email = email;
		this.Username = username;
		this.Password = password;
			
	}
		
	public Customer(int id,String name, String address, String phone, String email,String username, String password) {
		this.id = id;
		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Email = email;
		this.Username = username;
		this.Password = password;
			
	}
	public Customer(int id) {
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
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		this.Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}


	
	
	
}
