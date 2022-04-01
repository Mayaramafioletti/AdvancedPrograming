package br.com.fiap;

import java.awt.Color;

import javax.swing.JLabel;

public class MeuLabel extends JLabel{
	
	public MeuLabel(String text) {
		init();
		this.setText(text);
	}
	
	private void init() {
		this.setForeground(new Color(255,0,150));
		
	}

}
