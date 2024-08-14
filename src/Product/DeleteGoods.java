package  Product;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main_menu.Main;
import Main_menu.main_Menu;

public class DeleteGoods extends JPanel  implements ActionListener{
	
	JTextField tfID;
	

	Main W11Main; 


	public DeleteGoods(Main ex11MainParam) {
		
		W11Main = ex11MainParam;
		
		setPreferredSize(new Dimension( W11Main.JMenu.FRAME_HEIGHT, W11Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" Product Delete Page ");
		lbHeader.setBounds((W11Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
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
		lbID.setBounds(xl, yl, 50, height);
		add(lbID);	
		lbID.setForeground(Color.WHITE);
		
		tfID = new JTextField(15);
		width = tfID.getPreferredSize().width;
		height = tfID.getPreferredSize().height;
		tfID.setBounds(xt, yt, width, height);
		add(tfID);
		
		

		
		yl += 25;
		yt += 25;
		JButton btAdd = new JButton(main_Menu.DELETE_GOOD);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-10, yt, width, height);
		add(btAdd);
		btAdd.setBackground(Color.DARK_GRAY);
		btAdd.setForeground(Color.WHITE);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2+10, yt, width, height);
		add(btCancel);
		btCancel.setForeground(Color.WHITE);
		btCancel.setBackground(Color.DARK_GRAY);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals(main_Menu.DELETE_GOOD)) {
			String strID = tfID.getText();
			try {
				int good = Integer.parseInt(strID);
				GoodDAO GoodDAO = new GoodDAO();
				GoodDAO.deleteGood(good);
			} catch(NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
	}
}

