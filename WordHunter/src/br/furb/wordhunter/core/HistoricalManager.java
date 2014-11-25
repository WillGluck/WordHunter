package br.furb.wordhunter.core;

import java.util.ArrayList;
import java.util.List;

import br.furb.wordhunter.daos.SearchDAO;

/**
 * Classe respons�vel pelo hist�rico de buscas, dicas, etc...
 * 
 * @author Will Gl�ck
 * @created 19/11/2014 
 *
 */
public class HistoricalManager {
	
	private SearchDAO searchDAO;
	
	/**
	 * 
	 * @param sarchWord Palavra que est� sendo buscada.
	 * @return Lista de dicas de palavras para busca.
	 */
	public List<String> getTips(String sarchWord) {
		//TODO	
		return new ArrayList<String>();
	}
	
	/**
	 * Adiciona nova busca no hist�rico.
	 * @param searchWord Palavra que foi buscada.
	 */
	public void newSearch(String searchWord) {
		//TODO
	}
	
	/**
	 * Rebalanceia o banco de dados (limpa registros antigos e talz)
	 */
	public void rebalanceDataBase() {
		//TODO
	}

}
