package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ninja_squad.geektic.Utilisateur;

public class UtilisateurDAO implements IUtilisateurDAO{

	private EntityManager entityManager;
	
	public UtilisateurDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public Utilisateur findById(int id) {
		
		String requete = "";
		requete = "SELECT u FROM Utilisateur u WHERE u.id = :id" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("id", id);
		return (Utilisateur) query.getSingleResult();
		
	}

	@Override
	public List<Utilisateur> findByNom(String nom) {

		String requete = "";
		requete = "SELECT u FROM Utilisateur u WHERE u.nom = :nom" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("nom", nom);
		return query.getResultList();
		
	}

	@Override
	public List<Utilisateur> findByPrenom(String prenom) {

		String requete = "";
		requete = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("prenom", prenom);
		return query.getResultList();
		
	}
	
}
