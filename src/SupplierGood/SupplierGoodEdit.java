package SupplierGood;

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
public class SupplierGoodEdit extends JPanel implements ActionListener {
	
	JTextField tfID;
	JTextField tfId_sup;
	JTextField tfGood_id;
	JTextField tfPrice;
	
	
	Main Le12Main;
	int index = -1;
	final static String SEARCH_SUPGOOD = "Search";
	public SupplierGoodEdit(Main ex9MainParam) {
		Le12Main = ex9MainParam;
		setPreferredSize(new Dimension( ex9MainParam.JMenu.FRAME_WIDTH, ex9MainParam.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" SupplierGood Edit Page ");
		lbHeader.setBounds((ex9MainParam.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
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
		lbID.setBounds(xl, yl, width, height);
		add(lbID);	
		lbID.setForeground(Color.WHITE);

		
		tfID = new JTextField(13);
		width = tfID.getPreferredSize().width;
		height = tfID.getPreferredSize().height;
		tfID.setBounds(xt, yt, width, height);
		add(tfID);
		
		
		JButton btSearch = new JButton(SEARCH_SUPGOOD);
		width = btSearch.getPreferredSize().width;
		height = btSearch.getPreferredSize().height;
		btSearch.setBounds(main_Menu.FRAME_WIDTH/2, 45, width, height);
		add(btSearch);
		btSearch.setForeground(Color.WHITE);
		btSearch.setBackground(Color.DARK_GRAY);

		btSearch.addActionListener(this);
		
		yl += 25;
		yt += 25;
		
		JLabel lbId_sup = new JLabel("Id_sup");
		width = lbId_sup.getPreferredSize().width;
		height = lbId_sup.getPreferredSize().height;
		lbId_sup.setBounds(xl, yl, width, height);
		add(lbId_sup);
		lbId_sup.setForeground(Color.WHITE);
				
		tfId_sup = new JTextField(30);
		width = tfId_sup.getPreferredSize().width;
		height = tfId_sup.getPreferredSize().height;
		tfId_sup.setBounds(xt, yt, width, height);
		add(tfId_sup);
		
		yl += 25;
		yt += 25;
		
		JLabel IbGood_id = new JLabel("Good_id");
		width = IbGood_id.getPreferredSize().width;
		height = IbGood_id.getPreferredSize().height;
		IbGood_id.setBounds(xl, yl, width, height);
		add(IbGood_id);
		IbGood_id.setForeground(Color.WHITE);
				
		tfGood_id = new JTextField(30);
		width = tfGood_id.getPreferredSize().width;
		height = tfGood_id.getPreferredSize().height;
		tfGood_id.setBounds(xt, yt, width, height);
		add(tfGood_id);
		
		yl += 25;
		yt += 25;
		
		JLabel IbPrice = new JLabel("Price");
		width = IbPrice.getPreferredSize().width;
		height = IbPrice.getPreferredSize().height;
		IbPrice.setBounds(xl, yl, width, height);
		add(IbPrice);
		IbPrice.setForeground(Color.WHITE);
		
		tfPrice = new JTextField(30);
		width = tfPrice.getPreferredSize().width;
		height = tfPrice.getPreferredSize().height;
		tfPrice.setBounds(xt, yt, width, height);
		add(tfPrice);
		
		yl += 25;
		yt += 25;
		
		
		
	;
		
		JButton btAdd = new JButton(main_Menu.EDIT_SUPGOOD);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("command:" + command);
		
		if (command.equals(SEARCH_SUPGOOD)) {
			String strID = tfID.getText();
			int ID = Integer.parseInt(strID);
			SupplierGood SupplierGoods = new SupplierGood(ID);
		
			SupplierGoodDAO SupplierGoodDAO = new SupplierGoodDAO();
			SupplierGood Supg=SupplierGoodDAO.searchSupplierGood(SupplierGoods);
			tfId_sup.setText(String.valueOf(Supg.getId_sup()));
			tfGood_id.setText(String.valueOf(Supg.getId_good()));
			tfPrice.setText(String.valueOf(Supg.getPrice()));
			
			

		}
		
		if (command.equals(main_Menu.EDIT_SUPGOOD )) {
			int ID = Integer.parseInt(tfID.getText());
			String strId_sup = tfId_sup.getText();
			String strGood_id = tfGood_id.getText();
			String strPrice = tfPrice.getText();
			double Price = Double.parseDouble(strPrice);
			int Id_sup = Integer.parseInt(strId_sup);
			int Good_id = Integer.parseInt(strGood_id);
			SupplierGood supgood = new SupplierGood(ID,Id_sup,Good_id,Price);
			SupplierGoodDAO SupplierGoodDAO = new SupplierGoodDAO();
			SupplierGoodDAO.editSupplierGood(supgood);
			tfID.setText(null);
			tfId_sup.setText(null);
			tfGood_id.setText(null);
			tfPrice.setText(null);
			
		}
	}

}
