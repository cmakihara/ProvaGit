package br.univel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Principal extends JFrame{
		
		
	

		public Principal(){
			super();
			this.setSize(800,600);
			
			this.setLocationRelativeTo(null);
			
			JTable table = new JTable();
			JScrollPane js = new JScrollPane(table);
			this.setContentPane(js);
			
			
		//	Exe02 modelo = new Exe02();
			table.setModel(new Ex02Model());
			
			
		}
		
		public static void main(String[] args) {
			
			Principal ts = new Principal();
			ts.setVisible(true);
		
		
	}

}
