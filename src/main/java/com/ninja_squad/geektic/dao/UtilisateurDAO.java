package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.Utilisateur;

@Repository
public class UtilisateurDAO implements IUtilisateurDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	public UtilisateurDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public UtilisateurDAO () {
		
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

	@Override
	public List<Utilisateur> findByCentreInteret(String centreInteret) {

		String requete = "";
		requete = "SELECT u FROM CentreInteretUtilisateur ciu "
				+ "INNER JOIN ciu.utilisateur u "
				+ "INNER JOIN ciu.centreInteret ci "
				+ "WHERE ci.libelle = :labelCentreInteret" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("labelCentreInteret", centreInteret);
		return query.getResultList();
		
	}

	@Override
	public List<Utilisateur> findByCentreInteretEtCivilite(String centreInteret, String civilite) {

		String requete = "";
		requete = "SELECT u FROM CentreInteretUtilisateur ciu "
				+ "INNER JOIN ciu.utilisateur u "
				+ "INNER JOIN ciu.centreInteret ci "
				+ "WHERE ci.id = :centreInteret AND u.civilite = :civilite" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("centreInteret", centreInteret);
		query.setParameter("civilite", civilite);
		return query.getResultList();
		
	}
	
}
