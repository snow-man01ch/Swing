package ReceiptDetalis;

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

public class Receipt_detalisView extends JPanel {
	
	JTextField tfID;
	JTextField tfName;
	JTextField tfEmail;
	JTextField tfPassword;
	JTextField tfPhone;
	JTextField tfAddress;
	
	Main Le12Main;


	public Receipt_detalisView(Main ex9MainParam) {
		
		Le12Main = ex9MainParam;
		
		setPreferredSize(new Dimension( Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("View ReceiptDetalis");
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
		
		ReceiptDetalisDAO CustomerDB = new ReceiptDetalisDAO();
		ArrayList<ReceiptDetalis01> cars = CustomerDB.viewReceipt();
		
		yl += 15;
		
		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.addColumn("Id");
		model.addColumn("Rec_id");
		model.addColumn("Good_id");
		model.addColumn("Qua");
		model.addColumn("amount");
		
		Iterator it = cars.iterator();
		int i=0;
		while (it.hasNext()) {
			ReceiptDetalis01 user = (ReceiptDetalis01) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(user.getid(), i, 0);
			model.setValueAt(user.getRec_id(), i, 1);
			model.setValueAt(user.getGood_id(), i, 2);
			model.setValueAt(user.getQua(), i, 3);
			model.setValueAt(user.getAmount(), i, 4);
			
			
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

