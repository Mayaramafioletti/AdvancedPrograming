package br.com.fiap.movies.view;

import java.awt.Color;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	public MeuLabel(String text) {
		this.setText(text);
		init();
	}
	
	private void init() {
		this.setForeground(new Color(255,0,150));
	}
}