package Receipt;

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

public class ReceiptView extends JPanel {
	

	JTextField tfID;
	JTextField tfName;
	JTextField tfPrice;
	JTextField tfDescription;
	JTextField tfStock;

	
	Main Le12Main;


	public ReceiptView(Main ex9MainParam) {
		
		Le12Main = ex9MainParam;
		
		setPreferredSize(new Dimension( Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" Receipt View Page");
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
		
		ReceiptDAO ReceiptDB = new ReceiptDAO();
		ArrayList<Receipt> Rec = ReceiptDB.viewReceipt();
		
		yl += 15;
		
		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.addColumn("ID");
		model.addColumn("Date");
		model.addColumn("Cus_Id");
		model.addColumn("Total");
		
		
		Iterator it = Rec.iterator();
		int i=0;
		while (it.hasNext()) {
			Receipt user = (Receipt) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(user.getid(), i, 0);
			model.setValueAt(user.getData(), i, 1);
			model.setValueAt(user.getCus_Id(), i, 2);
			model.setValueAt(user.getTotal(), i, 3);		
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

