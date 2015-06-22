package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

public interface ICentreInteretUtilisateurDAO {

	/**
	 * 
	 * @param id : ID
	 * @return CentreInteretUtilisateur
	 */
	public CentreInteretUtilisateur findById(int id);
	
	/**
	 * Recherche tous les centre d'interet d'un utilisateur passé en paramètre
	 * @param u : utilisateur
	 * @return List<CentreInteretUtilisateur>
	 */
	public List<CentreInteretUtilisateur> findByUtilisateur(Utilisateur u);
	
}
