																																																																		package Customer;

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

public class CustomerView extends JPanel {
	
	JTextField tfID;
	JTextField tfName;
	JTextField tfAddress;
	JTextField tfPhone;
	JTextField tfEmail;
	JTextField tfUsername;
	JTextField tfPassword;

	
	Main Le12Main;


	public CustomerView(Main ex9MainParam) {
		
		Le12Main = ex9MainParam;
		
		setPreferredSize(new Dimension( Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Customer View Page");
		lbHeader.setBounds((Le12Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
		lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		setBackground(Color.black);
		lbHeader.setForeground(Color.WHITE);
		
		int width;
		int height;
		int xl = 10;
		int yl = 30;
		int xt = 65;
		int yt = 50;
		
		CustomerDAO CustomerDB = new CustomerDAO();
		ArrayList<Customer> cars = CustomerDB.viewCustomers();
		
		yl += 15;
		
		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
	
		
		
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Phone");
		model.addColumn("Email");
		model.addColumn("Username");
		model.addColumn("Password");

		Iterator it = cars.iterator();
		int i=0;
		while (it.hasNext()) {
			Customer user = (Customer) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(user.getid(), i, 0);
			model.setValueAt(user.getName(), i, 1);
			model.setValueAt(user.getAddress(), i, 2);
			model.setValueAt(user.getPhone(), i, 3);
			model.setValueAt(user.getEmail(), i, 4);
			model.setValueAt(user.getUsername(), i, 5);
			model.setValueAt(user.getPassword(), i, 6);
			
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

