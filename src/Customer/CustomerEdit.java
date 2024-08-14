package Customer;

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

public class CustomerEdit extends JPanel implements ActionListener {


	JTextField tfID;
	JTextField tfName;
	JTextField tfAddress;
	JTextField tfPhone;
	JTextField tfEmail;
	JTextField tfUsername;
	JTextField tfPassword;

	
	Main Le12Main;
	int index = -1;
	final static String SEARCH_CUS = "Search";
	public CustomerEdit(Main ex9MainParam) {
		Le12Main = ex9MainParam;
		setPreferredSize(new Dimension( ex9MainParam.JMenu.FRAME_WIDTH, ex9MainParam.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Customer Edit Page");
		lbHeader.setBounds((ex9MainParam.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width+200, lbHeader.getPreferredSize().height);
		add(lbHeader);
		lbHeader.setForeground(Color.WHITE);
		setBackground(Color.BLACK);

		int width;
		int height;
		int xl = 10;
		int yl = 50;
		int xt = 80;
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
		
		
		JButton btSearch = new JButton(SEARCH_CUS);
		width = btSearch.getPreferredSize().width;
		height = btSearch.getPreferredSize().height;
		btSearch.setBounds(main_Menu.FRAME_WIDTH/2, 45, width, height);
		add(btSearch);
		btSearch.setBackground(Color.DARK_GRAY);
		btSearch.setForeground(Color.WHITE);
		btSearch.addActionListener(this);
		
		yl += 25;
		yt += 25;
		
		JLabel lbName = new JLabel("Name");
		width = lbName.getPreferredSize().width;
		height = lbName.getPreferredSize().height;
		lbName.setBounds(xl, yl, width, height);
		add(lbName);
		lbName.setForeground(Color.WHITE);
				
		tfName = new JTextField(30);
		width = tfName.getPreferredSize().width;
		height = tfName.getPreferredSize().height;
		tfName.setBounds(xt, yt, width, height);
		add(tfName);
		
		yl += 25;
		yt += 25;
		
		JLabel IbAddress = new JLabel("Address");
		width = IbAddress.getPreferredSize().width;
		height = IbAddress.getPreferredSize().height;
		IbAddress.setBounds(xl, yl, width, height);
		add(IbAddress);
		IbAddress.setForeground(Color.WHITE);
				
		tfAddress = new JTextField(30);
		width = tfAddress.getPreferredSize().width;
		height = tfAddress.getPreferredSize().height;
		tfAddress.setBounds(xt, yt, width, height);
		add(tfAddress);
		
		yl += 25;
		yt += 25;
		
		JLabel IbPhone = new JLabel("Phone");
		width = IbPhone.getPreferredSize().width;
		height = IbPhone.getPreferredSize().height;
		IbPhone.setBounds(xl, yl, width, height);
		add(IbPhone);
		IbPhone.setForeground(Color.WHITE);
		
		tfPhone = new JTextField(30);
		width = tfPhone.getPreferredSize().width;
		height = tfPhone.getPreferredSize().height;
		tfPhone.setBounds(xt, yt, width, height);
		add(tfPhone);
		
		yl += 25;
		yt += 25;
		
		JLabel IbEmail = new JLabel("Email");
		width = IbEmail.getPreferredSize().width;
		height = IbEmail.getPreferredSize().height;
		IbEmail.setBounds(xl, yl, width, height);
		add(IbEmail);
		IbEmail.setForeground(Color.WHITE);
		
		tfEmail = new JTextField(30);
		width = tfEmail.getPreferredSize().width;
		height = tfEmail.getPreferredSize().height;
		tfEmail.setBounds(xt, yt, width, height);
		add(tfEmail);
		
		yl += 25;
		yt += 25;
		
		JLabel IbUsername = new JLabel("Username");
		width = IbUsername.getPreferredSize().width;
		height = IbUsername.getPreferredSize().height;
		IbUsername.setBounds(xl, yl, width, height);
		IbUsername.setForeground(Color.WHITE);
		add(IbUsername);
		
		tfUsername = new JTextField(30);
		width = tfUsername.getPreferredSize().width;
		height = tfUsername.getPreferredSize().height;
		tfUsername.setBounds(xt, yt, width, height);
		add(tfUsername);
		
		yl += 25;
		yt += 25;
		
		
		JLabel IbPassword = new JLabel("Password");
		width = IbPassword.getPreferredSize().width;
		height = IbPassword.getPreferredSize().height;
		IbPassword.setBounds(xl, yl, width, height);
		add(IbPassword);
		IbPassword.setForeground(Color.WHITE);
		
		tfPassword = new JTextField(30);
		width = tfPassword.getPreferredSize().width;
		height = tfPassword.getPreferredSize().height;
		tfPassword.setBounds(xt, yt, width, height);
		add(tfPassword);
		
		yl += 25;
		yt += 25;
		
		JButton btAdd = new JButton(main_Menu.EDIT_CUS);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-10, 250, width+15, height);
		add(btAdd);
		btAdd.setForeground(Color.WHITE);
		btAdd.setBackground(Color.DARK_GRAY);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2+15, 250, width, height);
		add(btCancel);
		btCancel.setForeground(Color.WHITE);
		btCancel.setBackground(Color.DARK_GRAY);
		btCancel.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("command:" + command);
		
		if (command.equals(SEARCH_CUS)) {
			String strID = tfID.getText();
			int ID = Integer.parseInt(strID);
			Customer Customers = new Customer(ID);
		
			CustomerDAO CustomerDAO = new CustomerDAO();
			Customer Cus=CustomerDAO.searchCustomers(Customers);
			tfName.setText(Cus.getName());
			tfAddress.setText(Cus.getAddress());
			tfPhone.setText(Cus.getPhone());
			tfEmail.setText(Cus.getEmail());
			tfUsername.setText(Cus.getUsername());
			tfPassword.setText(Cus.getPassword());
			

		}
		
		if (command.equals(main_Menu.EDIT_CUS )) {
			int ID = Integer.parseInt(tfID.getText());
			String strName = tfName.getText();
			String strAddress = tfAddress.getText();
			String strPhone = tfPhone.getText();
			String strEmail = tfEmail.getText();
			String strUsername = tfUsername.getText();
			String strPassword = tfPassword.getText();
			Customer cus = new Customer(ID,strName,strAddress,strPhone,strEmail,strUsername,strPassword);
			CustomerDAO CustomerDAO = new CustomerDAO();
			CustomerDAO.editCustomers(cus);
			tfID.setText(null);
			tfName.setText(null);
			tfAddress.setText(null);
			tfPhone.setText(null);
			tfEmail.setText(null);
			tfUsername.setText(null);
			tfPassword.setText(null);

		}
	}
	
}
