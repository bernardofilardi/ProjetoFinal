package br.com.avaliadorfuzzy.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.avaliadorfuzzy.model.Termo;

public class TermoDAO extends GenericDAO {
	
	private static EntityManager em;
	
	@SuppressWarnings("unchecked")
	public ArrayList<Termo> findTermos()
	{
		em = createEntityManager();
		
		Query q = em.createQuery("SELECT Object(t) FROM Termo as t");
		
		if(q.getResultList().size() > 0){
			return (ArrayList<Termo>) q.getResultList();
		} else {
			return new ArrayList<Termo>();
		}
		
	}

}
