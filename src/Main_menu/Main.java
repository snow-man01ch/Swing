package  Main_menu;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public main_Menu JMenu;

	
	public Main() {
		
		JMenu = new main_Menu(this);   
		JMenu.setVisible(true);
			
	}
	
	public static void main(String[] args) {
		
		new Main();
		
	}

}