package br.univel;

import javax.swing.JFrame;



public class Principal {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		
		jf.setSize(600, 600);
		jf.setLocationRelativeTo(null);
		
		Exe02 meuPainel = new Exe02();
		
		jf.setContentPane(meuPainel);
		
		
		
		jf.setVisible(true);
		
	}

}
