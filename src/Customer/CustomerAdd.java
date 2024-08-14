package Customer;

import javax.swing.JLabel;
import javax.swing.JTextField;


import Main_menu.Main;
import Main_menu.main_Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerAdd extends JPanel implements ActionListener {
	
	JTextField tfNAME;
	JTextField tfEMAIL;
	JTextField tfPASSWORD;
	JTextField tfPHONE;
	JTextField tfADDRESS; 	
	JTextField tfUSERNAME; 
	
		
	
	
	
	Main W11Main;


	public CustomerAdd(Main ex9MainParam) {
		
		W11Main = ex9MainParam;
		
		setPreferredSize(new Dimension( W11Main.JMenu.FRAME_HEIGHT, W11Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Customer Add Page");
		lbHeader.setBounds((W11Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		lbHeader.setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		
		
		int width;
		int height;
		int xl = 10;
		int yl = 50;
		int xt = 100;
		int yt = 50;
		
		//Jname
		
		JLabel IbName = new JLabel("Name");
		width = IbName.getPreferredSize().width;
		height = IbName.getPreferredSize().height;
		IbName.setBounds(xl, yl, 50, height);
		add(IbName);
		IbName.setForeground(Color.WHITE);
		
		tfNAME = new JTextField(13);
		width = tfNAME.getPreferredSize().width;
		height = tfNAME.getPreferredSize().height;
		tfNAME.setBounds(xt, yt, width, height);
		add(tfNAME);
		
		yl += 25;
		yt += 25;
	
		//JEmail
		
		JLabel IbAddress = new JLabel("Address");
		width = IbAddress.getPreferredSize().width;
		height = IbAddress.getPreferredSize().height;
		IbAddress.setBounds(xl, yl, width, height);
		add(IbAddress);
		IbAddress.setForeground(Color.WHITE);
				
		tfADDRESS = new JTextField(30);
		width = tfADDRESS.getPreferredSize().width;
		height = tfADDRESS.getPreferredSize().height;
		tfADDRESS.setBounds(xt, yt, width, height);
		add(tfADDRESS);
		
		yl += 25;
		yt += 25;
		
		//JPassword
		
		
		JLabel IbPhone = new JLabel("Phone");
		width = IbPhone.getPreferredSize().width;
		height = IbPhone.getPreferredSize().height;
		IbPhone.setBounds(xl, yl, 100, height);
		add(IbPhone);
		IbPhone.setForeground(Color.WHITE);
				
		tfPHONE = new JTextField(30);
		width = tfPHONE.getPreferredSize().width;
		height = tfPHONE.getPreferredSize().height;
		tfPHONE.setBounds(xt, yt, width, height);
		add(tfPHONE);
		
		yl += 25;
		yt += 25;
		
		//JPHone
		

		JLabel Email = new JLabel("Email");
		width = Email.getPreferredSize().width;
		height = Email.getPreferredSize().height;
		Email.setBounds(xl, yl, 50, height);
		add(Email);
		Email.setForeground(Color.WHITE);
		
		tfEMAIL = new JTextField(30);
		width = tfEMAIL.getPreferredSize().width;
		height = tfEMAIL.getPreferredSize().height;
		tfEMAIL.setBounds(xt, yt, width, height);
		add(tfEMAIL);
		
		yl += 25;
		yt += 25;
		
		
		//JAddress
		
		
		
		JLabel IbUsername = new JLabel("Username");
		width = IbUsername.getPreferredSize().width;
		height = IbUsername.getPreferredSize().height;
		IbUsername.setBounds(xl, yl, 100, height);
		add(IbUsername);
		IbUsername.setForeground(Color.WHITE);
		
		tfUSERNAME = new JTextField(30);
		width = tfUSERNAME.getPreferredSize().width;
		height = tfUSERNAME.getPreferredSize().height;
		tfUSERNAME.setBounds(xt, yt, width, height);
		add(tfUSERNAME);
		
		yl += 25;
		yt += 25;
		
		
		JLabel IbPassword = new JLabel("Password");
		width = IbPassword.getPreferredSize().width;
		height = IbPassword.getPreferredSize().height;
		IbPassword.setBounds(xl, yl, 100, height);
		IbPassword.setForeground(Color.WHITE);
		add(IbPassword);
		
		tfPASSWORD = new JTextField(30);
		width = tfPASSWORD.getPreferredSize().width;
		height = tfPASSWORD.getPreferredSize().height;
		tfPASSWORD.setBounds(xt, yt, width, height);
		add(tfPASSWORD);
		
		yl += 25;
		yt += 25;
		
		
		
		JButton btAdd = new JButton(main_Menu.ADD_CUS);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-10, 200, width, height);
		add(btAdd);
		btAdd.setForeground(Color.WHITE);
		btAdd.setBackground(Color.DARK_GRAY);	
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2+10, 200, width, height);
		add(btCancel);
		btCancel.setForeground(Color.WHITE);
		btCancel.setBackground(Color.DARK_GRAY);
		
		
		
		
	}
	
public void actionPerformed(ActionEvent evt) {
		
		String command = evt.getActionCommand();
		if(command.equals(main_Menu.ADD_CUS)) {
			JLabel tfID = null;
			String strNAME = tfNAME.getText();
			String strADDRESS = tfADDRESS.getText();
			String strPHONE = tfPHONE.getText();
			String strEMAIL = tfEMAIL.getText();
			String strUSERNAME = tfUSERNAME.getText();
			String strPASSWORD = tfPASSWORD.getText();
			
			try {
				Customer user = new Customer(strNAME, strADDRESS ,strPHONE, strEMAIL,strUSERNAME,strPASSWORD);
				CustomerDAO UserDAO = new CustomerDAO();
				UserDAO.addCustomers(user);

			} catch(NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
}