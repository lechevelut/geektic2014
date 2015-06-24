package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

@Deprecated
public interface ICentreInteretUtilisateurDAO {

	@Deprecated
	/**
	 * 
	 * @param id : ID
	 * @return CentreInteretUtilisateur
	 */
	public CentreInteretUtilisateur findById(int id);
	
	@Deprecated
	/**
	 * Recherche tous les centre d'interet d'un utilisateur passé en paramètre
	 * @param u : utilisateur
	 * @return List<CentreInteretUtilisateur>
	 */
	public List<CentreInteretUtilisateur> findByUtilisateur(Utilisateur u);
	
}
