package Customer;

import connectDB.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import java.sql.SQLException;

public class CustomerDAO {
			
	public void addCustomers(Customer customers) {
		System.out.println("Add customers");
		try {
			String insertSql = "INSERT INTO CUSTOMER(`name`, `address`, `phone`, `e_mail`, `username`, `password`) VALUES" + "('" + customers.getName() + "','" + customers.getAddress() + "','" +customers.getPhone() + "','"+customers.getEmail() + "','" + customers.getUsername() + "','" + customers.getPassword()+"')";
			System.out.println("insertSql:" + insertSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.execute(insertSql);
				stmnt.close();
				con.close();
				System.out.println("customers added successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void editCustomers(Customer customers) {
		System.out.println("Edit customers");
		try {
			String updateSql ="UPDATE CUSTOMER SET" + " NAME='"  + customers.getName() + "','" + customers.getAddress() + "','" +customers.getPhone() + "','"+customers.getEmail() + "','" + customers.getUsername() + "','" + customers.getPassword()+ "'"
                    + " WHERE ID=" + customers.getid();
						System.out.println("updateSql:" + updateSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(updateSql);
				stmnt.close();
				con.close();
				System.out.println("customers updated successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void deleteCustomers(int  customers) {
		System.out.println("Delete customers");
		try {
			String deleteSql = "DELETE FROM CUSTOMER WHERE ID=" + customers;
			System.out.println("deleteSql:" + deleteSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(deleteSql);
				stmnt.close();
				con.close();
				System.out.println("Deleted successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public Customer searchCustomers(Customer customers) {
		System.out.println("Search customers");
		Customer Cus = new Customer() ; 
		
		try {
			String searchSql = "SELECT * FROM CUSTOMER WHERE ID=" + customers.getid();
			System.out.println("selectSql:" + searchSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(searchSql);
				if (rs.next()) {
					Cus.setid(rs.getInt("ID"));
					Cus.setName(rs.getString("NAME"));
					Cus.setAddress(rs.getString("ADDRESS"));
					Cus.setPhone(rs.getString("PHONE"));
					Cus.setEmail(rs.getString("E_MAIL"));
					Cus.setUsername(rs.getString("USERNAME"));
					Cus.setPassword(rs.getString("PASSWORD"));
					
					
					}
				stmnt.close();
				con.close();
				System.out.println("Searched successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return Cus;
	}
	
	public ArrayList<Customer> viewCustomers() {
		System.out.println("View customers");
		ArrayList<Customer> customerss = null;
		
		try {
			String viewSql = "SELECT * FROM CUSTOMER";
			System.out.println("selectSql:" + viewSql);
			
			customerss = new ArrayList<Customer>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int ID = rs.getInt("ID");
					String Name = rs.getString("NAME");
					String Address = rs.getString("ADDRESS");
					String Phone = rs.getString("PHONE");
					String Email = rs.getString("E_MAIL");
					String Username = rs.getString("USERNAME");
					String Password = rs.getString("PASSWORD");
					
					
					Customer ex11customers = new Customer(ID, Name, Address, Phone, Email, Username, Password  );
					customerss.add(ex11customers);
					System.out.println("ex11customers:" + ex11customers.toString());
				}
				stmnt.close();
				con.close();
				System.out.println("Searched successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return customerss;
	}
	
}