package br.com.avaliadorfuzzy.model;
// default package
// Generated 07/09/2011 11:20:36 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Variavellinguistica generated by hbm2java
 */
@Entity
@Table(name = "variavellinguistica", catalog = "avaliadorfuzzydb")
public class VariavelLinguistica implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idVariavelLinguistica;
	private String nome;
	private Long inicioUniversoDiscursso;
	private Long fimUniversoDiscursso;
	private Set<Termo> termos = new HashSet<Termo>(0);

	public VariavelLinguistica() {
	}

	public VariavelLinguistica(int idVariavelLinguistica) {
		this.idVariavelLinguistica = idVariavelLinguistica;
	}

	public VariavelLinguistica(int idVariavelLinguistica, String nome,
			Long inicioUniversoDiscursso, Long fimUniversoDiscursso,
			Set<Termo> termos) {
		this.idVariavelLinguistica = idVariavelLinguistica;
		this.nome = nome;
		this.inicioUniversoDiscursso = inicioUniversoDiscursso;
		this.fimUniversoDiscursso = fimUniversoDiscursso;
		this.termos = termos;
	}

	@Id
	@Column(name = "idVariavelLinguistica", unique = true, nullable = false)
	public int getIdVariavelLinguistica() {
		return this.idVariavelLinguistica;
	}

	public void setIdVariavelLinguistica(int idVariavelLinguistica) {
		this.idVariavelLinguistica = idVariavelLinguistica;
	}

	@Column(name = "nome", length = 45)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "inicioUniversoDiscursso")
	public Long getInicioUniversoDiscursso() {
		return this.inicioUniversoDiscursso;
	}

	public void setInicioUniversoDiscursso(Long inicioUniversoDiscursso) {
		this.inicioUniversoDiscursso = inicioUniversoDiscursso;
	}

	@Column(name = "fimUniversoDiscursso")
	public Long getFimUniversoDiscursso() {
		return this.fimUniversoDiscursso;
	}

	public void setFimUniversoDiscursso(Long fimUniversoDiscursso) {
		this.fimUniversoDiscursso = fimUniversoDiscursso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "variavellinguistica")
	public Set<Termo> getTermos() {
		return this.termos;
	}

	public void setTermos(Set<Termo> termos) {
		this.termos = termos;
	}

}