package Invoice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import Main_menu.Main;

public class InvoiceView extends JPanel {
	
	JTextField tfID;
	JTextField tfID_Inv;
	JTextField tfID_Sup;
	JTextField tfID_Good;
	JTextField tfData;
	JTextField tfTotal;
	JTextField tfStatus;
	JTextField tfAmount;
	JTextField tfQuanity;
	
	Main Le12Main;


	public InvoiceView(Main ex9MainParam) {
		
		Le12Main = ex9MainParam;
		
		setPreferredSize(new Dimension( Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Invoice View Page");
		lbHeader.setBounds((Le12Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
		lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		lbHeader.setForeground(Color.WHITE);
		setBackground(Color.black);
		
		int width;
		int height;
		int xl = 10;
		int yl = 30;
		int xt = 65;
		int yt = 50;
		
		InvoiceDAO InvoiceDB = new InvoiceDAO();
		ArrayList<Invoice>  INV = InvoiceDB.viewInvoice();
		
		yl += 15;
		
		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
//		model.addColumn("ID");
		model.addColumn("ID_Inv");
		model.addColumn("ID_Sup");
		model.addColumn("ID_Good");
		model.addColumn("Date");
		model.addColumn("Total");
		model.addColumn("Status");
		model.addColumn("Amount");
		model.addColumn("Quanity");
		
		
		Iterator it = INV.iterator();
		int i=0;
		while (it.hasNext()) {
			Invoice user = (Invoice) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(user.getId_inv(), i, 0);
			model.setValueAt(user.getId_sup(), i, 1);
			model.setValueAt(user.getId_good(), i, 2);
			model.setValueAt(user.getDate(), i, 3);
			model.setValueAt(user.getTotal(), i, 4);
			model.setValueAt(user.getStatus(), i, 5);
			model.setValueAt(user.getAmount(), i, 6);
			model.setValueAt(user.getQuanity(), i, 7);
		
			
			i++;
		}
		table.setPreferredScrollableViewportSize(new Dimension (100,300));

		table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
		table.getTableHeader().setForeground(Color.magenta);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds((Le12Main.JMenu.FRAME_WIDTH-750)/2,yl,750,350);
		add(sp);
	
	}
	

}

