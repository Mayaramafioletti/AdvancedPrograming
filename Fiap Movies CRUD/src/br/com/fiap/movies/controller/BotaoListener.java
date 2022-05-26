package br.com.fiap.movies.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.movies.model.Filme;
import br.com.fiap.movies.dao.FilmeDao;


public class BotaoListener implements ActionListener {
	
	private br.com.fiap.movies.view.Janela view;
	private FilmeDao dao = new FilmeDao();

	public BotaoListener(br.com.fiap.movies.view.Janela view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Filme produto = new Filme();
		produto.setTitulo(view.getTxtTitulo());
		produto.setGenero(view.getTxtGenero());
		produto.setSinopse(view.getTxtSinopse());
		produto.setOndeAssistir(view.getTxtOndeAssistir());
		produto.setAssitido(view.getTxtAssitido());
		produto.setAvaliacao(view.getTxtAvaliacao());
		
		dao.inserir(produto);
		
		view.carregarDados();
		
		List<Filme> lista = dao.listarTodos();
		JOptionPane.showMessageDialog(null, produto);
		lista.forEach(System.out::println);
	}
	
}