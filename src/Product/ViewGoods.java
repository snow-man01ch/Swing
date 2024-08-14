package Product;

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

public class ViewGoods extends JPanel {

	JTextField tfID;
	JTextField tfId_cat;
	JTextField tfName;
	JTextField tfStock;
	JTextField tfPrice;
	JTextField tfDesc;

	Main Le12Main;

	public ViewGoods(Main ex9MainParam) {

		Le12Main = ex9MainParam;

		setPreferredSize(new Dimension(Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Product View Page");
		lbHeader.setBounds((Le12Main.JMenu.FRAME_WIDTH - lbHeader.getPreferredSize().width) / 2, 10,
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

		GoodDAO GoodDB = new GoodDAO();
		ArrayList<Good> Goods = GoodDB.viewGoods();

		yl += 15;

		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel) table.getModel();

		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Description");
		model.addColumn("Stock");

		Iterator it = Goods.iterator();
		int i = 0;
		while (it.hasNext()) {
			Good Good = (Good) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(Good.id, i, 0);
			model.setValueAt(Good.Name, i, 1);
			model.setValueAt(Good.Price, i, 2);
			model.setValueAt(Good.Description, i, 3);
			model.setValueAt(Good.Stock, i, 4);
			i++;
		}
		table.setPreferredScrollableViewportSize(new Dimension(100, 300));

		table.getTableHeader().setForeground(Color.magenta);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds((Le12Main.JMenu.FRAME_WIDTH-750)/2,yl,750,350);
		add(sp);
	}

}
