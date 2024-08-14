package Invoice;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import Customer.Customer;
import connectDB.ConnectionFactory;
import java.sql.SQLException;

public class InvoiceDAO {

	

	public static Invoice searchInvoice(Invoice Invoices) {
		Invoice Inv = new Invoice(); 
		try {
			String searchSql = "SELECT * FROM INVOICE WHERE ID=" + Invoices.getId_inv();
			System.out.println("selectSql:" + searchSql);

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(searchSql);
				if (rs.next()) {
					Inv.setId_inv(rs.getInt("id_inv"));
					Inv.setId_sup(rs.getInt("id_sup"));
					Inv.setDate(rs.getString("date"));
					Inv.setTotal(rs.getInt("total"));
					Inv.setId_good(rs.getInt("id_good"));
					Inv.setStatus(rs.getInt("status"));
					Inv.setAmount(rs.getInt("amount"));
					Inv.setQuanity(rs.getInt("quanity"));

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
		return Inv;
	}
	public ArrayList<Invoice> viewInvoice() {
		System.out.println("View Invoice");
		ArrayList<Invoice> Invoices = null;
		
		try {
			String viewSql = "SELECT * FROM INVOICE , INVOICE_DETAILS";
			System.out.println("selectSql:" + viewSql);
			
			Invoices = new ArrayList<Invoice>();

			ConnectionFactory connDB = new ConnectionFactory();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(viewSql);
				while (rs.next()) {
					int Id_inv = rs.getInt("Id_inv");
					int Id_sup = rs.getInt("Id_sup");
					String Date = rs.getString("Date");
					int Total = rs.getInt("Total");
					int Id_good = rs.getInt("Id_good");
					int Status = rs.getInt("Status");
					int	Amount	= rs.getInt("Amount");
					int	Quanity	= rs.getInt("Quanity");
					Invoice ex11Invoices = new Invoice(Id_inv, Status, Amount,Quanity, Id_good, Id_sup,Total,Date);
					Invoices.add(ex11Invoices);
					System.out.println("ex11Invoices:" + ex11Invoices.toString());
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
		return Invoices;
	}
}