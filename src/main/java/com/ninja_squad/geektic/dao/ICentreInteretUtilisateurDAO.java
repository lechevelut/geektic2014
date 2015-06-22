package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

public interface ICentreInteretUtilisateurDAO {

	/**
	 * 
	 * @param id : ID de la visite
	 * @return Visite
	 */
	public CentreInteretUtilisateur findById(int id);
	
	/**
	 * Recherche tous les centre d'interet d'un utilisateur pass� en param�tre
	 * @param u : utilisateur
	 * @return List<CentreInteretUtilisateur>
	 */
	public List<CentreInteretUtilisateurDAO> findByUtilisateur(Utilisateur u);
	
}
