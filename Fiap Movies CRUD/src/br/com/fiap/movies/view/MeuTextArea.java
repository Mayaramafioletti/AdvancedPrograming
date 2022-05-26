package br.com.fiap.movies.view;

import javax.swing.JTextArea;

import br.com.fiap.movies.view.BorderFactory;

public class MeuTextArea extends JTextArea{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int colunas = 30;
	private int linhas = 10;

	public MeuTextArea() {
		init();
	}

	private void init() {
		this.setColumns(colunas);
		this.setRows(linhas);
		this.setBorder(BorderFactory.create());
		
	}
}