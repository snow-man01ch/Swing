package Supplier;

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

public class SupplierView extends JPanel {
	
	JTextField tfId;
	JTextField tfName;
	JTextField tfEmail;
	JTextField tfPhone;
	JTextField tfAddress;

	Main Le12Main;

	public SupplierView(Main ex9MainParam) {

		Le12Main = ex9MainParam;

		setPreferredSize(new Dimension(Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Supplier View Page");
		lbHeader.setBounds((Le12Main.JMenu.FRAME_WIDTH - lbHeader.getPreferredSize().width) / 2, 10,
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

		SupplierDAO SupDB = new SupplierDAO();
		ArrayList<Supplier> Suppliers = SupDB.viewSuppliers();

		yl += 15;

		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel) table.getModel();

		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Phone");
		model.addColumn("Email");
		

		Iterator it = Suppliers.iterator();
		int i = 0;
		while (it.hasNext()) {
			Supplier Sup = (Supplier) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(Sup.getid(), i, 0);
			model.setValueAt(Sup.getName(), i, 1);
			model.setValueAt(Sup.getAddress(), i, 2);
			model.setValueAt(Sup.getPhone(), i, 3);
			model.setValueAt(Sup.getEmail(), i, 4);
			i++;
		}
		table.setPreferredScrollableViewportSize(new Dimension(100, 300));

		table.getTableHeader().setForeground(Color.magenta);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds((Le12Main.JMenu.FRAME_WIDTH-750)/2,yl,750,350);
		add(sp);
	}

}
