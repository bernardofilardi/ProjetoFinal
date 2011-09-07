package br.com.avaliadorfuzzy.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDAO {

	private static final String AVALIADOR_FUZZY_PERSISTENCE_UNIT = "avaliadorFuzzyDB";
	
	public EntityManager em;
		
	public EntityManager createEntityManager()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(AVALIADOR_FUZZY_PERSISTENCE_UNIT);
		em = emf.createEntityManager();
		return em;
	}
}
