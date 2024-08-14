package  Product;

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

public class AddGoods extends JPanel implements ActionListener {
	
	JTextField tfID;
	JTextField tfName;
	JTextField tfPrice;
	JTextField tfDescription;
	JTextField tfStock;

	
	Main W11Main; 


	public AddGoods(Main ex9MainParam) {
		
		W11Main = ex9MainParam;
		
		setPreferredSize(new Dimension( W11Main.JMenu.FRAME_HEIGHT, W11Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" Product Add Page ");
		lbHeader.setBounds((W11Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		lbHeader.setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		
		int width;
		int height;
		int xl = 10; 
		int yl = 50;
		int xt = 90;
		int yt = 50;
		
	
		
		JLabel lbTitle = new JLabel("Name");
		width = lbTitle.getPreferredSize().width;
		height = lbTitle.getPreferredSize().height;
		lbTitle.setBounds(xl, yl,50, height);
		add(lbTitle);
		lbTitle.setForeground(Color.WHITE);
		
		tfName = new JTextField(30);
		width = tfName.getPreferredSize().width;
		height = tfName.getPreferredSize().height;
		tfName.setBounds(xt, yt, width, height);
		add(tfName);
		
		yl += 25;
		yt += 25;
		

		JLabel lbPrice = new JLabel("Price");
		width = lbPrice.getPreferredSize().width;
		height = lbPrice.getPreferredSize().height;
		lbPrice.setBounds(xl, yl, width, height);
		add(lbPrice);
		lbPrice.setForeground(Color.WHITE);
				

		tfPrice = new JTextField(30);
		width = tfPrice.getPreferredSize().width;
		height = tfPrice.getPreferredSize().height;
		tfPrice.setBounds(xt, yt, width, height);
		add(tfPrice);
		
		yl += 25;
		yt += 25;
		
		JLabel lbDesc = new JLabel("Description");
		width = lbDesc.getPreferredSize().width;
		height = lbDesc.getPreferredSize().height;
		lbDesc.setBounds(xl, yl, width, height);
		add(lbDesc);
		lbDesc.setForeground(Color.WHITE);
				
		tfDescription = new JTextField(30);
		width = tfDescription.getPreferredSize().width;
		height = tfDescription.getPreferredSize().height;
		tfDescription.setBounds(xt, yt, width, height);
		add(tfDescription);
		
		yl += 25;
		yt += 25;
		
		JLabel lbStock = new JLabel("Stock");
		width = lbStock.getPreferredSize().width;
		height = lbStock.getPreferredSize().height;
		lbStock.setBounds(xl, yl, width, height);
		add(lbStock);
		lbStock.setForeground(Color.WHITE);
		
		tfStock = new JTextField(30);
		width = tfStock.getPreferredSize().width;
		height = tfStock.getPreferredSize().height;
		tfStock.setBounds(xt, yt, width, height);
		add(tfStock);
		
		yl += 25;
		yt += 25;
		
		
		
		JButton btAdd = new JButton(main_Menu.ADD_GOOD);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-10, 230, width, height);
		add(btAdd);
		btAdd.setForeground(Color.WHITE);
		btAdd.setBackground(Color.DARK_GRAY);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2+10, 230, width, height);
		add(btCancel);
		btCancel.setForeground(Color.WHITE);
		btCancel.setBackground(Color.DARK_GRAY);
		
		
		
		
	}
	
public void actionPerformed(ActionEvent evt) {
		
		String command = evt.getActionCommand();
		if(command.equals(main_Menu.ADD_GOOD)) {
//			String strID = tfID.getText();
			String strName = tfName.getText();
			String strPrice = tfPrice.getText();
			String strDesc = tfDescription.getText();
			String strStock = tfStock.getText();
			try {
//				int ID = Integer.parseInt(strID);
				double Price = Double.parseDouble(strPrice);
				int Stock = Integer.parseInt(strStock);
				Good Good = new Good(strName,Price,strDesc,Stock);
				GoodDAO GoodDAO = new GoodDAO();
				GoodDAO.addGood(Good);

			} catch(NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
}

