package  SupplierGood;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import connectDB.ConnectionFactory;

import java.sql.SQLException;

public class SupplierGoodDAO {
			
	public void addSupplierGood(SupplierGood SupplierGoods) {
		System.out.println("Add SupplierGoods");
		try {
			String insertSql = "INSERT INTO Sup_Good ( `id_sup`, `id_good`, `price`) VALUES" + "(" + SupplierGoods.getId_sup() + "," + SupplierGoods.getId_good() + "," +SupplierGoods.getPrice() +")" ;
			System.out.println("insertSql:" + insertSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.execute(insertSql);
				stmnt.close();
				con.close();
				System.out.println("SupplierGood added successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace(); 
		}
	}
	
	public void editSupplierGood(SupplierGood SupplierGoods) {
		System.out.println("Edit SupplierGood");
		try {
			String updateSql ="UPDATE Sup_Good SET "+" Sup_id='" + SupplierGoods.getId_sup() + "',`Good_id`='"  + SupplierGoods.getId_good() + "',Price= " + SupplierGoods.getPrice() + ", WHERE ID=" + SupplierGoods.getid();
					System.out.println("updateSql:" + updateSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(updateSql);
				stmnt.close();
				con.close();
				System.out.println("SupplierGood updated successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void deleteSupplierGood(int  SupplierGoods) {
		System.out.println("Delete SupplierGood");
		try {
			String deleteSql = "DELETE FROM Suplier_Good WHERE ID=" + SupplierGoods;
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
	
	public SupplierGood searchSupplierGood(SupplierGood SupplierGoods) {
		System.out.println("Search SupplierGood");
		SupplierGood Sup = new SupplierGood() ; 
		try {
			String searchSql = "SELECT * FROM Sup_Good WHERE ID=" + SupplierGoods.getid();
			System.out.println("selectSql:" + searchSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(searchSql);
				if (rs.next()) {
					Sup.setid(rs.getInt("ID"));
					Sup.setId_sup(rs.getInt("Id_sup"));
					Sup.setId_good(rs.getInt("Id_good"));
					Sup.setPrice(rs.getDouble("Price"));
					
					

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
	
	public ArrayList<SupplierGood> viewSupplierGoods() {
		System.out.println("View SupplierGood");
		ArrayList<SupplierGood> SupplierGoods = null;
		
		try {
			String viewSql = "SELECT * FROM Sup_Good";
			System.out.println("selectSql:" + viewSql);
			
			SupplierGoods = new ArrayList<SupplierGood>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int ID = rs.getInt("ID");
					int Id_sup = rs.getInt("Id_sup");
					int Id_good = rs.getInt("Id_good");
					double Price = rs.getDouble("Price");
					SupplierGood Sup = new SupplierGood(ID,Id_sup,Id_good, Price);
					SupplierGoods.add(Sup);
					System.out.println("ex11SupplierGood:" + Sup.toString());
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
		return SupplierGoods;
	}
	
}