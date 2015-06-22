package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.CentreInteret;

@Deprecated
public interface ICentreInteretDAO {

	@Deprecated
	/**
	 * 
	 * @param id : ID du centre d'interet
	 * @return CentreInteret
	 */
	public CentreInteret findById(int id);
	
	@Deprecated
	/**
	 * 
	 * @param label : libelle
	 * @return List<CentreInteret>
	 */
	public List<CentreInteret> findByLibelle(String label);
	
}
