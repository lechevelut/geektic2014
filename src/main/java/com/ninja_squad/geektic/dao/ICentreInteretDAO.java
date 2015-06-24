package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.CentreInteret;

public interface ICentreInteretDAO {

	/**
	 * 
	 * @param id : ID du centre d'interet
	 * @return CentreInteret
	 */
	public CentreInteret findById(String id);
	
	/**
	 * 
	 * @param label : libelle
	 * @return List<CentreInteret>
	 */
	public List<CentreInteret> findByLibelle(String label);
	
	/**
	 * 
	 * @return List<CentreInteret>
	 */
	public List<CentreInteret> findAll();
}
