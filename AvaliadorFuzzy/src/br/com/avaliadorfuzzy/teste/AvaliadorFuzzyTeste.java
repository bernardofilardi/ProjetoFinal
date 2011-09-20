package br.com.avaliadorfuzzy.teste;

import br.com.avaliadorfuzzy.controller.FuzzyController;

public class AvaliadorFuzzyTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FuzzyController ctrl = new FuzzyController();
		
		Double valorAvaliacao = ctrl.getFuzzyClassification(180, 1);
		
		System.out.println("O valor da avaliação é: " + valorAvaliacao);
	}

}
