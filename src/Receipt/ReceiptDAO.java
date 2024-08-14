package Receipt;

import connectDB.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import java.sql.SQLException;

public class ReceiptDAO {
	public ArrayList<Receipt> viewReceipt() {
		System.out.println("View Receipt");
		ArrayList<Receipt> Receipt = null;
		
		try {
			String viewSql = "SELECT * FROM receipt";
			System.out.println("selectSql:" + viewSql);
			
			Receipt = new ArrayList<Receipt>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int Id = rs.getInt("ID");
					String Date = rs.getString("DATA");
					int Cus_Id = rs.getInt("CUS_ID");
					double Total = rs.getDouble("TOTAL");
					
					
					Receipt ex11Receipt = new Receipt(Id, Date, Cus_Id, Total);
					Receipt.add(ex11Receipt);
					System.out.println("Receipt:" + ex11Receipt.toString());
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
		return Receipt;
	}
	
}