package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

@Repository
public class CentreInteretDAO implements ICentreInteretDAO {

	private EntityManager entityManager;
	
	public CentreInteretDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public CentreInteretDAO() {
		
	}
	
	@Override
	public CentreInteret findById(int id) {

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

	
	
}
