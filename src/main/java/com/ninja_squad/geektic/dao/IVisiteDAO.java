package com.ninja_squad.geektic.dao;

import java.util.List;
import com.ninja_squad.geektic.Utilisateur;
import com.ninja_squad.geektic.Visite;


public interface IVisiteDAO {
	
	/**
	 * 
	 * @param id : ID de la visite
	 * @return Visite
	 */
	public Visite findById(int id);
	
	/**
	 * Recherche toutes les visites d'un profil utilisateur passé en paramètre
	 * @param u : utilisateur
	 * @return List<Visite>
	 */
	public List<Visite> findByUtilisateur(Utilisateur u);
	
}
