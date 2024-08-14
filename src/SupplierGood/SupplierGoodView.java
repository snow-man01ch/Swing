package SupplierGood;
import java.awt.Color;
import java.awt.Dimension;
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

public class SupplierGoodView extends JPanel  {
	
	JTextField tfID;
	JTextField tfId_sup;
	JTextField tfId_good;
	JTextField tfPrice;
	

	
	Main Le12Main;


	public SupplierGoodView(Main ex9MainParam) {
		
		Le12Main = ex9MainParam;
		
		setPreferredSize(new Dimension( Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" SupplierGood View Page ");
		lbHeader.setBounds((Le12Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
		lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		lbHeader.setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		
		int width;
		int height;
		int xl = 10;
		int yl = 30;
		int xt = 65;
		int yt = 50;
		
		SupplierGoodDAO SupplierGoodDB = new SupplierGoodDAO();
		ArrayList<SupplierGood> cars = SupplierGoodDB.viewSupplierGoods();
		
		yl += 15;
		
		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.addColumn("ID");
		model.addColumn("Id_sup");		
		model.addColumn("Id_good");
		model.addColumn("Price");
		
		
		Iterator it = cars.iterator();
		int i=0;
		while (it.hasNext()) {
			SupplierGood user = (SupplierGood) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(user.getid(), i, 0);
			model.setValueAt(user.getId_sup(), i, 1);
			model.setValueAt(user.getId_good(), i, 2);
			model.setValueAt(user.getPrice(), i, 3);
			
			i++;
		}
		table.setPreferredScrollableViewportSize(new Dimension (100,300));

		table.getTableHeader().setForeground(Color.magenta);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds((Le12Main.JMenu.FRAME_WIDTH-750)/2,yl,750,350);
		add(sp);

	
	}

}
