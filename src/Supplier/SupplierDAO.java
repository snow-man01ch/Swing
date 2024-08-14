package Supplier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectionFactory;

import java.sql.SQLException;

public class SupplierDAO {

	public void addSupplier(Supplier suppliers) {
		System.out.println("Add Suppliers");
		try {
			String insertSql = "INSERT INTO SUPPLIER(NAME, ADDRESS, PHONE, E_MAIL) VALUES" + "('" + suppliers.getName()
					+ "','" + suppliers.getAddress() +  "','" + suppliers.getPhone() + "','"
					+ suppliers.getEmail() + "')";
			System.out.println("insertSql:" + insertSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.execute(insertSql);
				stmnt.close();
				con.close();
				System.out.println("Supplier added successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void editSupplier(Supplier suppliers) {
		System.out.println("Edit Supplier");
		try {
			String updateSql = "UPDATE SUPPLIER SET " + " Name ='" + suppliers.getName() + " ',Address ='"
					+ suppliers.getAddress() + " ',Phone ='" 
					+ suppliers.getPhone() + " ',E_mail ='"
					+ suppliers.getEmail() + " ' WHERE ID=" + suppliers.getid();
			System.out.println("updateSql:" + updateSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(updateSql);
				stmnt.close();
				con.close();
				System.out.println("Supplier updated successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void deleteSupplier(int suppliers) {
		System.out.println("Delete Supplier");
		try {
			String deleteSql = "DELETE FROM SUPPLIER WHERE ID=" + suppliers;
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

	public Supplier searchSupplier(Supplier suppliers) {
		System.out.println("Search Supplier");
		Supplier Sup = new Supplier();
		try {
			String searchSql = "SELECT * FROM SUPPLIER WHERE ID=" + suppliers.getid();
			System.out.println("selectSql:" + searchSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(searchSql);
				if (rs.next()) {
					Sup.setid(rs.getInt("ID"));
					Sup.setName(rs.getString("Name"));
					Sup.setAddress(rs.getString("Address"));
					Sup.setPhone(rs.getString("Phone"));
					Sup.setEmail(rs.getString("E_mail"));
					
					

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
		return Sup;

	}

	public ArrayList<Supplier> viewSuppliers() {
		System.out.println("View Supplier");
		ArrayList<Supplier> Suppliers = null;

		try {
			String viewSql = "SELECT * FROM SUPPLIER";
			System.out.println("selectSql:" + viewSql);

			Suppliers = new ArrayList<Supplier>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int ID = rs.getInt("ID");
					String Name = rs.getString("Name");
					String Address = rs.getString("Address");
					String Phone = rs.getString("Phone");
					String Email = rs.getString("E_mail");
				
					

					Supplier Sup = new Supplier(ID, Name, Address,  Phone, Email);
					Suppliers.add(Sup);
					System.out.println("ex11Supplier:" + Sup.toString());
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
		return Suppliers;
	}

}