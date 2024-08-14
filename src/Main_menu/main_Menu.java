package Main_menu;

import javax.swing.JFrame;
import javax.swing.JPanel;


import Customer.CustomerAdd;
import Customer.CustomerDelete;
import Customer.CustomerEdit;
import Customer.CustomerView;
import Invoice.Invoice;
import Invoice.InvoiceView;
import Product.AddGoods;
import Product.DeleteGoods;
import Product.EditGoods;
import Product.ViewGoods;
import Receipt.ReceiptView;
import ReceiptDetalis.Receipt_detalisView;
import Supplier.SupplierAdd;
import Supplier.SupplierDelete;
import Supplier.SupplierEdit;
import Supplier.SupplierView;
import SupplierGood.SupplierGood;
import SupplierGood.SupplierGoodAdd;
import SupplierGood.SupplierGoodDelete;
import SupplierGood.SupplierGoodEdit;
import SupplierGood.SupplierGoodView;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Menu extends JFrame implements ActionListener {

	public final static int FRAME_WIDTH = 800;
	 public final static int FRAME_HEIGHT = 500;
	 


	Main W11Main;

//Customer
	CustomerAdd customeradd;
	CustomerEdit customeredit;
	CustomerDelete customerdelete;
	CustomerView customerview;

//AddminGood(Product)
	AddGoods addgood;
	EditGoods editgood;
	DeleteGoods deletegood;
	ViewGoods viewgood;

//Supplier
	SupplierAdd addsupplier;
	SupplierEdit editsupplier;
	SupplierDelete deletesupplier;
	SupplierView viewsupplier;

// SupplierGood

	SupplierGoodAdd addsupplierGood;
	SupplierGoodEdit editsupplierGood;
	SupplierGoodDelete deletesupplierGood;
	SupplierGoodView viewsupplierGood;


	Receipt_detalisView receipt_detalisView;
	
//	ReceiveView
	ReceiptView receiveview;
	

	JPanel mainPanel;

//Customer
	public final static String Customer = "Customer";
	public final static String ADD_CUS = "Add Customer";
	public final static String EDIT_CUS = "Edit Customer";
	public final static String DELETE_CUS = "Delete Customer";
	public final static String VIEW_CUS = "View  Customer";
	public final static String EXIT_CUS = "Exit";

//AddminGood(Product)

	public final static String GOOD = "Good";
	public final static String ADD_GOOD = "Add Good";
	public final static String EDIT_GOOD = "Update Good";
	public final static String DELETE_GOOD = "Delete Good";
	public final static String VIEW_GOOD = "View Good";
	public final static String EXIT_GOOD = "Exit";

//Supplier

	public final static String Suplier = "Suplier";
	public final static String ADD_SUP = "Add Supplier";
	public final static String EDIT_SUP = "Edit Supplier";
	public final static String DELETE_SUP = "Delete Supplier";
	public final static String VIEW_SUP = "View Supplier";
	public final static String EXIT_SUP = "Exit";

// SupplierGood

	public final static String SupplierGood = "SupplierGood";
	public final static String ADD_SUPGOOD = "Add SupplierGood";
	public final static String EDIT_SUPGOOD = "Edit SupplierGood";
	public final static String DELETE_SUPGOOD = "Delete SupplierGood";
	public final static String VIEW_SUPGOOD = "View SupplierGood";
	public final static String EXIT_SUPGOOD = "Exit";



// Receipt_detalisView
	public final static String ReceiptDetalis = "ReceiptDetalis";
	public final static String VIEW_RCD = "View ReceiptDetalis";

// Receive
	public final static String RECEIVE = "Receive";
	public final static String VIEW_RE = "View Receive";
	public final static String EXIT_RE = "Exit";
	
	
	public final static String EXIT_STR = "Exit";
	public final static String CANCEL_STR = "Cancel";
	public final static String SHOW_DATA = "Show";

	public main_Menu(Main ex9Main) {
		
		
		super("Menu");


		this.W11Main = ex9Main;

		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenDim.width - FRAME_WIDTH) / 2, (screenDim.height - FRAME_HEIGHT) / 2);
		JMenuBar jMenuBar = new JMenuBar();
		jMenuBar.setBackground(Color.BLACK);
		
		jMenuBar.setFont(new Font("SansSerif", Font.BOLD, 24));
		// Customer

		JMenu MainCustomer = new JMenu(Customer);
		JMenuItem menuaddcustomer = new JMenuItem(ADD_CUS);
		JMenuItem menueditcustomer = new JMenuItem(EDIT_CUS);
		JMenuItem menudeletecustomer = new JMenuItem(DELETE_CUS);
		JMenuItem menuviewcustomer = new JMenuItem(VIEW_CUS);	
		MainCustomer.setForeground(Color.WHITE);
	
		

		menuaddcustomer.addActionListener(this);
		menueditcustomer.addActionListener(this);
		menudeletecustomer.addActionListener(this);
		menuviewcustomer.addActionListener(this);

		MainCustomer.add(menuaddcustomer);
		MainCustomer.add(menueditcustomer);
		MainCustomer.add(menudeletecustomer);
		MainCustomer.add(menuviewcustomer);
		jMenuBar.add(MainCustomer);
		setJMenuBar(jMenuBar);

		customeradd = new CustomerAdd(ex9Main);
		customeredit = new CustomerEdit(ex9Main);
		customerview = new CustomerView(ex9Main);
		customerdelete = new CustomerDelete(ex9Main);

		mainPanel = new JPanel(new CardLayout());
		mainPanel.add(customeradd, ADD_CUS);
		mainPanel.add(customeredit, EDIT_CUS);
		mainPanel.add(customerdelete, DELETE_CUS);
		mainPanel.add(customerview, VIEW_CUS);
	

		// Product

		JMenu mainGood = new JMenu(GOOD);
		JMenuItem menuAddGood = new JMenuItem(ADD_GOOD);
		JMenuItem menuEditGood = new JMenuItem(EDIT_GOOD);
		JMenuItem menuDeleteGood = new JMenuItem(DELETE_GOOD);
		JMenuItem menuViewGood = new JMenuItem(VIEW_GOOD);
		JMenuItem menuExitGood = new JMenuItem(EXIT_GOOD);
		mainGood.setForeground(Color.WHITE);

		menuAddGood.addActionListener(this);
		menuEditGood.addActionListener(this);
		menuDeleteGood.addActionListener(this);
		menuViewGood.addActionListener(this);
		menuExitGood.addActionListener(this);

		mainGood.add(menuAddGood);
		mainGood.add(menuEditGood);
		mainGood.add(menuDeleteGood);
		mainGood.add(menuViewGood);
		mainGood.add(menuExitGood);
		jMenuBar.add(mainGood);
		setJMenuBar(jMenuBar);

		addgood = new AddGoods(ex9Main);
		editgood = new EditGoods(ex9Main);
		deletegood = new DeleteGoods(ex9Main);
		viewgood = new ViewGoods(ex9Main);

		mainPanel.add(addgood, ADD_GOOD);
		mainPanel.add(editgood, EDIT_GOOD);
		mainPanel.add(deletegood, DELETE_GOOD);
		mainPanel.add(viewgood, VIEW_GOOD);

//Supplier
		JMenu MainSuplier = new JMenu(Suplier);
		JMenuItem menuaddSupplier = new JMenuItem(ADD_SUP);
		JMenuItem menueditSupplier = new JMenuItem(EDIT_SUP);
		JMenuItem menudeleteSupplier = new JMenuItem(DELETE_SUP);
		JMenuItem menuviewSupplier = new JMenuItem(VIEW_SUP);
		JMenuItem menuExitSupplier = new JMenuItem(EXIT_SUP);
		MainSuplier.setForeground(Color.WHITE);

		menuaddSupplier.addActionListener(this);
		menueditSupplier.addActionListener(this);
		menudeleteSupplier.addActionListener(this);
		menuviewSupplier.addActionListener(this);
		menuExitSupplier.addActionListener(this);

		MainSuplier.add(menuaddSupplier);
		MainSuplier.add(menueditSupplier);
		MainSuplier.add(menudeleteSupplier);
		MainSuplier.add(menuviewSupplier);
		MainSuplier.add(menuExitSupplier);
		jMenuBar.add(MainSuplier);
		setJMenuBar(jMenuBar);

		addsupplier = new SupplierAdd(ex9Main);
		editsupplier = new SupplierEdit(ex9Main);
		deletesupplier = new SupplierDelete(ex9Main);
		viewsupplier = new SupplierView(ex9Main);

		mainPanel.add(addsupplier, ADD_SUP);
		mainPanel.add(editsupplier, EDIT_SUP);
		mainPanel.add(deletesupplier, DELETE_SUP);
		mainPanel.add(viewsupplier, VIEW_SUP);

		// SupplierGood

		JMenu MainSuplierGood = new JMenu(SupplierGood);
		JMenuItem menuaddSupplierGood = new JMenuItem(ADD_SUPGOOD);
		JMenuItem menueditSupplierGood = new JMenuItem(EDIT_SUPGOOD);
		JMenuItem menudeleteSupplierGood = new JMenuItem(DELETE_SUPGOOD);
		JMenuItem menuviewSupplierGood = new JMenuItem(VIEW_SUPGOOD);
		JMenuItem menuExitSupplierGood = new JMenuItem(EXIT_SUPGOOD);
		MainSuplierGood.setForeground(Color.WHITE);

		menuaddSupplierGood.addActionListener(this);
		menueditSupplierGood.addActionListener(this);
		menudeleteSupplierGood.addActionListener(this);
		menuviewSupplierGood.addActionListener(this);
		menuExitSupplierGood.addActionListener(this);

		MainSuplierGood.add(menuaddSupplierGood);
		MainSuplierGood.add(menueditSupplierGood);
		MainSuplierGood.add(menudeleteSupplierGood);
		MainSuplierGood.add(menuviewSupplierGood);
		MainSuplierGood.add(menuExitSupplierGood);
		jMenuBar.add(MainSuplierGood);
		setJMenuBar(jMenuBar);

		addsupplierGood = new SupplierGoodAdd(ex9Main);
		editsupplierGood = new SupplierGoodEdit(ex9Main);
		deletesupplierGood = new SupplierGoodDelete(ex9Main);
		viewsupplierGood = new SupplierGoodView(ex9Main);

		mainPanel.add(addsupplierGood, ADD_SUPGOOD);
		mainPanel.add(editsupplierGood, EDIT_SUPGOOD);
		mainPanel.add(deletesupplierGood, DELETE_SUPGOOD);
		mainPanel.add(viewsupplierGood, VIEW_SUPGOOD);

		// Category

		




		
//		JMenu InvoiceMenu
		
//		JMenu MainInvoice = new JMenu(INVOICE);
//		JMenuItem menuviewInvoice = new JMenuItem(VIEW_IV);
//		MainInvoice.setForeground(Color.WHITE);
//		menuviewInvoice.addActionListener(this);
//		MainInvoice.add(menuviewInvoice);			
//		jMenuBar.add(MainInvoice);
//		setJMenuBar(jMenuBar);
//		invoiceview = new InvoiceView(ex9Main);
//		mainPanel.add(invoiceview, VIEW_IV);
		
		
//		JMenu ReceiveMenu	
		
		JMenu MainReceive = new JMenu(RECEIVE);
		JMenuItem menuviewReceive = new JMenuItem(VIEW_RE);
		menuviewReceive.addActionListener(this);
		MainReceive.setForeground(Color.WHITE);
		MainReceive.add(menuviewReceive);			
		jMenuBar.add(MainReceive);
		setJMenuBar(jMenuBar);
		receiveview = new ReceiptView(ex9Main);
		mainPanel.add(receiveview, VIEW_RE);
		
		JMenu MainInvoice_Details = new JMenu(ReceiptDetalis);
		JMenuItem menuviewInvoice_Details = new JMenuItem(VIEW_RCD);
		menuviewInvoice_Details.addActionListener(this);
		MainInvoice_Details.add(menuviewInvoice_Details);
		MainInvoice_Details.setForeground(Color.WHITE);
		jMenuBar.add(MainInvoice_Details);
		setJMenuBar(jMenuBar);
		Receipt_detalisView viewReceiptDetalis = new Receipt_detalisView(ex9Main);
		mainPanel.add(viewReceiptDetalis, VIEW_RCD);
		
		

		add(mainPanel);

	}

	public void actionPerformed(ActionEvent evt) {

		String command = evt.getActionCommand();
		System.out.println("command:" + command);
		Object source = evt.getSource();
		System.out.println("source:" + source.toString());
		if (command.equals(ADD_CUS)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, ADD_CUS);
		} else if (command.equals(EDIT_CUS)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, EDIT_CUS);
		} else if (command.equals(DELETE_CUS)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, DELETE_CUS);
		} else if (command.equals(VIEW_CUS)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, VIEW_CUS);

		} else if (command.equals(ADD_GOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, ADD_GOOD);
		} else if (command.equals(EDIT_GOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, EDIT_GOOD);
		} else if (command.equals(DELETE_GOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, DELETE_GOOD);
		} else if (command.equals(VIEW_GOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, VIEW_GOOD);

		} else if (command.equals(ADD_SUP)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, ADD_SUP);
		} else if (command.equals(EDIT_SUP)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, EDIT_SUP);
		} else if (command.equals(DELETE_SUP)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, DELETE_SUP);
		} else if (command.equals(VIEW_SUP)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, VIEW_SUP);

		} else if (command.equals(ADD_SUPGOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, ADD_SUPGOOD);
		} else if (command.equals(EDIT_SUPGOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, EDIT_SUPGOOD);
		} else if (command.equals(DELETE_SUPGOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, DELETE_SUPGOOD);
		} else if (command.equals(VIEW_SUPGOOD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, VIEW_SUPGOOD);
			
	
		
//		} else if (command.equals(ADD_IV)) {
//			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//			cardLayout.show(mainPanel, ADD_IV);
//		} else if (command.equals(EDIT_IV)) {
//			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//			cardLayout.show(mainPanel, EDIT_IV);
//		} else if (command.equals(EDIT_IV)) {
//			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//			cardLayout.show(mainPanel, EDIT_IV);
//		} else if (command.equals(DELETE_IV)) {
//			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//			cardLayout.show(mainPanel, DELETE_IV);
		
		} else if (command.equals(VIEW_RE)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, VIEW_RE);
		} else if (command.equals(VIEW_RCD)) {
			CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
			cardLayout.show(mainPanel, VIEW_RCD);
			

			if (command.equals(EXIT_STR)) {
				System.exit(0);
			}

		}

	}
}
