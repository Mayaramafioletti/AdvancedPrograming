package br.com.fiap.movies.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.movies.model.Filme;

public class FilmeDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Filme");
	EntityManager manager = factory.createEntityManager();

	public void inserir(Filme filme) {

		manager.getTransaction().begin();
		manager.persist(filme);
		manager.getTransaction().commit();

	}

	public List<Filme> listarTodos() {
		String jpql = "SELECT f FROM Filme f";
		TypedQuery<Filme> query = manager.createQuery(jpql, Filme.class);

		return query.getResultList();
	}

	public void apagar(Filme filme) {
		manager.getTransaction().begin();
		manager.remove(filme);
		manager.getTransaction().commit();
	}

}