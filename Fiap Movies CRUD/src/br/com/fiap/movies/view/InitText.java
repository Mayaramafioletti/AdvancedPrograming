package br.com.fiap.movies.view;

import java.awt.Color;

import javax.swing.JTextField;

import br.com.fiap.movies.view.BorderFactory;

public class InitText extends JTextField{

	/**
 * 
 */
private static final long serialVersionUID = 1L;

	public InitText() {
		super(20);
		init();
	}

	private void init() {
		this.setForeground(new Color(50,50,50));
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.create());
	}
}
