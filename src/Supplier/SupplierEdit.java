package Supplier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main_menu.Main;
import Main_menu.main_Menu;

public class SupplierEdit extends JPanel implements ActionListener {

	JTextField tfID;
	JTextField tfName;
	JTextField tfEmail;
	JTextField tfPhone;
	JTextField tfAddress;

	Main Le12Main;

	int index = -1;
	final static String SEARCH_SUP = "Search";

	public SupplierEdit(Main ex9MainParam) {
		Le12Main = ex9MainParam;
		setPreferredSize(new Dimension(ex9MainParam.JMenu.FRAME_WIDTH, ex9MainParam.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Supplier Edit Page");
		lbHeader.setBounds((ex9MainParam.JMenu.FRAME_WIDTH - lbHeader.getPreferredSize().width) / 2, 10, 150,
				lbHeader.getPreferredSize().height);
		add(lbHeader);
		lbHeader.setForeground(Color.WHITE);
		setBackground(Color.BLACK);

		int width;
		int height;
		int xl = 10;
		int yl = 50;
		int xt = 65;
		int yt = 50;

		JLabel lbID = new JLabel("ID");
		width = lbID.getPreferredSize().width;
		height = lbID.getPreferredSize().height;
		lbID.setBounds(xl, yl, 50, height);
		add(lbID);
		lbID.setForeground(Color.WHITE);

		tfID = new JTextField(13);
		width = tfID.getPreferredSize().width;
		height = tfID.getPreferredSize().height;
		tfID.setBounds(xt, yt, width, height);
		add(tfID);

		JButton btSearch = new JButton(SEARCH_SUP);
		width = btSearch.getPreferredSize().width;
		height = btSearch.getPreferredSize().height;
		btSearch.setBounds(main_Menu.FRAME_WIDTH / 2, 45, width, height);
		add(btSearch);
		btSearch.setForeground(Color.WHITE);
		btSearch.setBackground(Color.DARK_GRAY);
		btSearch.addActionListener(this);

		yl += 25;
		yt += 25;

		// JName

		JLabel lbName = new JLabel("Name");
		width = lbName.getPreferredSize().width;
		height = lbName.getPreferredSize().height;
		lbName.setBounds(xl, yl, 50, height);
		add(lbName);
		lbName.setForeground(Color.WHITE);

		tfName = new JTextField(30);
		width = tfName.getPreferredSize().width;
		height = tfName.getPreferredSize().height;
		tfName.setBounds(xt, yt, width, height);
		add(tfName);

		yl += 25;
		yt += 25;

		// JEmail

		JLabel lbEmail = new JLabel("Email");
		width = lbEmail.getPreferredSize().width;
		height = lbEmail.getPreferredSize().height;
		lbEmail.setBounds(xl, yl, width, height);
		add(lbEmail);
		lbEmail.setForeground(Color.WHITE);

		tfEmail = new JTextField(30);
		width = tfEmail.getPreferredSize().width;
		height = tfEmail.getPreferredSize().height;
		tfEmail.setBounds(xt, yt, width, height);
		add(tfEmail);

		yl += 25;
		yt += 25;

		// Phone

		JLabel lbPhone = new JLabel("Phone");
		width = lbPhone.getPreferredSize().width;
		height = lbPhone.getPreferredSize().height;
		lbPhone.setBounds(xl, yl, width, height);
		add(lbPhone);
		lbPhone.setForeground(Color.WHITE);

		tfPhone = new JTextField(30);
		width = tfPhone.getPreferredSize().width;
		height = tfPhone.getPreferredSize().height;
		tfPhone.setBounds(xt, yt, width, height);
		add(tfPhone);

		yl += 25;
		yt += 25;

		// Address

		JLabel lbAddress = new JLabel("Address");
		width = lbAddress.getPreferredSize().width;
		height = lbAddress.getPreferredSize().height;
		lbAddress.setBounds(xl, yl, width, height);
		add(lbAddress);
		lbAddress.setForeground(Color.WHITE);

		tfAddress = new JTextField(30);
		width = tfAddress.getPreferredSize().width;
		height = tfAddress.getPreferredSize().height;
		tfAddress.setBounds(xt, yt, width, height);
		add(tfAddress);

		yl += 25;
		yt += 25;

		JButton btAdd = new JButton(main_Menu.EDIT_SUP);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH / 2 - width - 10, 250, width, height);
		add(btAdd);
		btAdd.setForeground(Color.WHITE);
		btAdd.setBackground(Color.DARK_GRAY);
		btAdd.addActionListener(this);

		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH / 2 + 10, 250, width, height);
		add(btCancel);
		btCancel.setForeground(Color.WHITE);
		btCancel.setBackground(Color.DARK_GRAY);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("command:" + command);

		if (command.equals(SEARCH_SUP)) {
			String strID = tfID.getText();
			int ID = Integer.parseInt(strID);
			Supplier Suppliers = new Supplier(ID);

			SupplierDAO SupplierDAO = new SupplierDAO();
			Supplier Sup = SupplierDAO.searchSupplier(Suppliers);
			tfName.setText(Sup.getName());
			tfEmail.setText(Sup.getEmail());
			tfPhone.setText(Sup.getPhone());
			tfAddress.setText(Sup.getAddress());

		}

		if (command.equals(main_Menu.EDIT_SUP)) {
			int ID = Integer.parseInt(tfID.getText());
			String strName = tfName.getText();
			String strEmail = tfEmail.getText();
			String strPhone = tfPhone.getText();
			String strAddress = tfAddress.getText();
			Supplier sup = new Supplier(ID, strName, strEmail, strPhone, strAddress);
			SupplierDAO SupplierDAO = new SupplierDAO();
			SupplierDAO.editSupplier(sup);
			tfID.setText(null);
			tfName.setText(null);
			tfEmail.setText(null);
			tfPhone.setText(null);
			tfAddress.setText(null);

		}
	}

}
