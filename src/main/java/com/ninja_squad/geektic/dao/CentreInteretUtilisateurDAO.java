package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

public class CentreInteretUtilisateurDAO implements ICentreInteretUtilisateurDAO {

	private EntityManager entityManager;
	
	public CentreInteretUtilisateurDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public CentreInteretUtilisateur findById(int id) {

		String requete = "";
		requete = "SELECT ciu FROM CentreInteret_Utilisateur ciu WHERE ciu.id = :id" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("id", id);
		return (CentreInteretUtilisateur) query.getSingleResult();
		
	}

	@Override
	public List<CentreInteretUtilisateurDAO> findByUtilisateur(Utilisateur u) {

		String requete = "";
		requete = "SELECT ciu FROM CentreInteret_Utilisateur ciu WHERE ciu.utilisateur.id = :utilisateur" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("utilisateur", u.id);
		return query.getResultList();
		
	}

}
