package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

@Repository
public class CentreInteretDAO implements ICentreInteretDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public CentreInteretDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public CentreInteretDAO() {
		
	}
	
	@Override
	public CentreInteret findById(String id) {

		String requete = "";
		requete = "SELECT ci FROM CentreInteret ci WHERE ci.id = :id" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("id", id);
		return (CentreInteret) query.getSingleResult();
		
	}

	@Override
	public List<CentreInteret> findByLibelle(String label) {

		String requete = "";
		requete = "SELECT ci FROM CentreInteret ci WHERE ci.libelle = :libelle" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("libelle", label);
		return query.getResultList();
		
	}

	@Override
	public List<CentreInteret> findAll() {

		String requete = "";
		requete = "SELECT ci FROM CentreInteret ci" ;
		Query query = entityManager.createQuery(requete);
		return query.getResultList();
		
	}
	
}
