package br.com.avaliadorfuzzy.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.avaliadorfuzzy.model.VariavelLinguistica;

public class VariavelLinguisticaDAO extends GenericDAO {

	private static EntityManager em;

	@SuppressWarnings("unchecked")
	public ArrayList<VariavelLinguistica> findTermos() {
		em = createEntityManager();

		Query q = em.createQuery("SELECT Object(t) FROM Termo as t");

		if (q.getResultList().size() > 0) {
			return (ArrayList<VariavelLinguistica>) q.getResultList();
		} else {
			return new ArrayList<VariavelLinguistica>();
		}

	}
}
