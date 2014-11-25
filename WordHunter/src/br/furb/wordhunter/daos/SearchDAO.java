package br.furb.wordhunter.daos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.furb.wordhunter.models.Search;

/**
 * DAO das buscas
 * 
 * @author Will Glück
 * @created 20/11/2014
 *
 */
public class SearchDAO {

	/** 
	 * @return Retorna todas as buscas já feitas.
	 */
	public List<Search> fetchAll() {
		return new ArrayList<Search>();
		//TODO
	}
	
	/**
	 * Adiciona ou atualiza uma busca que foi realizada.	
	 * @param search Busca realizada
	 */
	public void addOrUpdate(Search search) {
		//TODO
	}
	
	/**
	 * Deleta todas as buscas de acordo com o filtro passado
	 * @param lastSearch Última vez que foi buscada (mais antigas corta).
	 * @param timesSearched Quantidade de vezes que foi buscada (menos vezes corta).
	 */
	public void deleteWhere(Date lastSearch, int timesSearched) {
		
	}
	
}
