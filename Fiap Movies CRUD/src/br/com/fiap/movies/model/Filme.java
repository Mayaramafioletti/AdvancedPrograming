package br.com.fiap.movies.model;

import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String genero;
	private String sinopse;
	private String ondeAssistir;
	private String assitido;
	private String avaliacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getOndeAssistir() {
		return ondeAssistir;
	}

	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}

	public String getAssitido() {
		return assitido;
	}

	public void setAssitido(String assitido) {
		this.assitido = assitido;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Filme [Título: " + titulo + ", Genêro: " + genero + ", Sinopse: " + sinopse + ", Streaming: " + ondeAssistir + ", Assitido: " + assitido + ", Avaliação: " + avaliacao + "]";
	}

	public Vector<String> getData() {
		
		Vector<String> data = new Vector<String>();
		data.add(id.toString());
		data.add(titulo);
		data.add(genero);
		data.add(sinopse);
		data.add(ondeAssistir);
		data.add(assitido);
		data.add(avaliacao);
		
		return data;
	}

}

