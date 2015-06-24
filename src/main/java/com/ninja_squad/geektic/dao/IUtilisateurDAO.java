package com.ninja_squad.geektic.dao;

import java.util.List;

import com.ninja_squad.geektic.Utilisateur;

public interface IUtilisateurDAO {

	/**
	 * 
	 * @param id : ID de l'utilsiateur
	 * @return Utilisateur
	 */
	public Utilisateur findById(int id);
	
	/**
	 * 
	 * @param nom : nom de l'utilisateur
	 * @return list<Utilisateur>
	 */
	public List<Utilisateur> findByNom(String nom);
	
	/**
	 * 
	 * @param prenom : prenom de l'utilisateur
	 * @return list<Utilisateur>
	 */
	public List<Utilisateur> findByPrenom(String prenom);
	
	/**
	 * 
	 * @param centreInteret : centre interet de l'utilisateur
	 * @return list<Utilisateur>
	 */
	public List<Utilisateur> findByCentreInteret(String centreInteret);
	
	/**
	 * 
	 * @param centreInteret : centre interet de l'utilisateur
	 * @param civilite : sexe cherché
	 * @return list<Utilisateur>
	 */
	public List<Utilisateur> findByCentreInteretEtCivilite(String centreInteret, String civilite);
	
}
