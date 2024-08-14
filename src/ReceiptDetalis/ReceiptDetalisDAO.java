package ReceiptDetalis;

import connectDB.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import java.sql.SQLException;

public class ReceiptDetalisDAO {
	public ArrayList<ReceiptDetalis01> viewReceipt() {
		System.out.println("View Receipt_detalis");
		ArrayList<ReceiptDetalis01> Invoicee = null;
		
		try {
			String viewSql = "SELECT * FROM Receipt_detalis";
			System.out.println("selectSql:" + viewSql);
			
			Invoicee = new ArrayList<ReceiptDetalis01>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int Id = rs.getInt("ID");
					int Rec_id = rs.getInt("Rec_id");
					int Good_id = rs.getInt("Good_id");
					int Qua = rs.getInt("QUA");
					double Amount = rs.getDouble("AMOUNT");
					
					ReceiptDetalis01 ex11Invoice = new ReceiptDetalis01(Id, Rec_id, Good_id, Qua,Amount);
					Invoicee.add(ex11Invoice);
					System.out.println("Invoice:" + ex11Invoice.toString());
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
		return Invoicee;
	}
	
}