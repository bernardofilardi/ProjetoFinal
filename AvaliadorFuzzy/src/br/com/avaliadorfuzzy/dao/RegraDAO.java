package br.com.avaliadorfuzzy.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import br.com.avaliadorfuzzy.model.Regra;

public class RegraDAO extends GenericDAO {

	@SuppressWarnings("unchecked")
	public ArrayList<Regra> findRegras()
	{
		em = createEntityManager();
		Query q = em.createQuery("SELECT Object(r) FROM Regra as r");
		
		if(q != null)
		{
			return (ArrayList<Regra>) q.getResultList();
		} else {
			return new ArrayList<Regra>();
		}
		
	}
	
	public void createRegra(Regra regra)
	{
		em = createEntityManager();
		em.getTransaction().begin();
		em.persist(regra);
		em.getTransaction().commit();
	}
	
}
