package  Product;

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

public class EditGoods extends JPanel implements ActionListener {



	JTextField tfID;
	JTextField tfName;
	JTextField tfPrice;
	JTextField tfDescription;
	JTextField tfStock;
 
 
	
	Main Le12Main;
	int index = -1;
	final static String SEARCH_STR = "Search";
	public EditGoods(Main ex9MainParam) {
		Le12Main = ex9MainParam;
		setPreferredSize(new Dimension( ex9MainParam.JMenu.FRAME_WIDTH, ex9MainParam.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Product Edit Page");
		lbHeader.setBounds((ex9MainParam.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				150, lbHeader.getPreferredSize().height);
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
		
		
		JButton btSearch = new JButton(SEARCH_STR);
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
		

		JLabel lbDesc = new JLabel("Desc");
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
		
		
		
		JButton btAdd = new JButton(main_Menu.EDIT_GOOD);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-10, 250, width, height);
		add(btAdd);
		btAdd.setForeground(Color.WHITE);
		btAdd.setBackground(Color.DARK_GRAY);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2+10, 250, width, height);
		add(btCancel);
		btCancel.setForeground(Color.WHITE);
		btCancel.setBackground(Color.DARK_GRAY);
		
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("command:" + command);
		
		if (command.equals(SEARCH_STR)) {
			String strID = tfID.getText();
			int ID = Integer.parseInt(strID);
			Good Goods = new Good();
			Goods.setid(Integer.parseInt(strID));
			GoodDAO GoodDAO = new GoodDAO();
			GoodDAO.searchGood(Goods);
			tfName.setText(Goods.getName());
			tfPrice.setText(String.valueOf(Goods.getPrice()));
			tfDescription.setText(Goods.getDesc());
			tfStock.setText(String.valueOf(Goods.getStock()));
			
		}
		
		if (command.equals(main_Menu.EDIT_GOOD )) {
			int ID = Integer.parseInt(tfID.getText());
			String strName = tfName.getText();
			String strStock = tfStock.getText();
			String strPrice = tfPrice.getText();
			String strDesc = tfDescription.getText();
			double Price = Double.parseDouble(strPrice);
			int Stock= Integer.parseInt(strStock);
			Good good = new Good(ID,strName,Price,strDesc,Stock);
			GoodDAO GoodDAO = new GoodDAO();
			GoodDAO.editGood(good);
			tfID.setText(null);
			tfName.setText(null);
			tfStock.setText(null);
			tfPrice.setText(null);
			tfDescription.setText(null);

		}
	}
	
}
