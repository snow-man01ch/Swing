package  Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectionFactory;

import java.sql.SQLException;

public class GoodDAO {
			
	public void addGood(Good goods) {
		System.out.println("Add goods");
		try {
			String insertSql = "INSERT INTO GOODS (`name`, `price`, `description`, `stock`) VALUES" + "('" + goods.Name + "'," +goods.Price + ",'"+ goods.Description +"','" + goods.Stock + "')";
			System.out.println("insertSql:" + insertSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.execute(insertSql);
				stmnt.close();
				con.close();
				System.out.println("Good added successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace(); 
		}
	}
	
	public void editGood(Good Good) {
		System.out.println("Edit Good");
		try {
			String updateSql ="UPDATE goods SET NAME='" + Good.Name + "',PRICE='" + Good.Price +"', DESC= " + Good.Description +  "',`STOCK`='"  + Good.Stock +" WHERE ID=" + Good.id;
					System.out.println("updateSql:" + updateSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(updateSql);
				stmnt.close();
				con.close();
				System.out.println("Good updated successfully.");
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void deleteGood(int  goods) {
		System.out.println("Delete Good");
		try {
			String deleteSql = "DELETE FROM GOODS WHERE ID=" + goods;
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
	
	public void searchGood(Good good) {
		System.out.println("Search Good");
		try {
			String searchSql = "SELECT * FROM GOODS WHERE ID=" + good.id;
			System.out.println("selectSql:" + searchSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(searchSql);
				if (rs.next()) {
					good.setid(rs.getInt("ID"));
					good.setName(rs.getString("NAME"));
					good.setPrice(rs.getDouble("PRICE"));
					good.setDesc(rs.getString("DESCRIPTION"));
					good.setStock(rs.getInt("STOCK"));
					

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
		
	}
	
	public ArrayList<Good> viewGoods() {
		System.out.println("View Good");
		ArrayList<Good> Goods = null;
		
		try {
			String viewSql = "SELECT * FROM GOODS";
			System.out.println("selectSql:" + viewSql);
			
			Goods = new ArrayList<Good>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int ID = rs.getInt("ID");
					String Name = rs.getString("NAME");
					double Price = rs.getDouble("PRICE");
					String Desc = rs.getString("DESCRIPTION");
					int Stock = rs.getInt("STOCK");
					Good ex11Good = new Good(ID ,Name ,Price ,Desc ,Stock);
					Goods.add(ex11Good);
					System.out.println("ex11Good:" + ex11Good.toString());
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
		return Goods;
	}
	
}