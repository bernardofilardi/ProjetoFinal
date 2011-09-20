package br.com.avaliadorfuzzy.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.avaliadorfuzzy.model.Segmento;

public class SegmentoDAO extends GenericDAO {

	
	private static EntityManager em;
	
	@SuppressWarnings("unchecked")
	public ArrayList<Segmento> findTermos()
	{
		em = createEntityManager();
		
		Query q = em.createQuery("SELECT Object(s) FROM Segmento as s");
		
		if(q.getResultList().size() > 0){
			return (ArrayList<Segmento>) q.getResultList();
		} else {
			return new ArrayList<Segmento>();
		}
		
	}
}
