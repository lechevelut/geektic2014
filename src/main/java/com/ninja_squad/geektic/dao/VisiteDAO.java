package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.Utilisateur;
import com.ninja_squad.geektic.Visite;

@Repository
public class VisiteDAO implements IVisiteDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public VisiteDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public VisiteDAO() {
		
	}
	
	@Override
	public Visite findById(int id) {
		
		String requete = "";
		requete = "SELECT v FROM Visite v WHERE v.id = :id" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("id", id);
		return (Visite) query.getSingleResult();
		
	}

	@Override
	public List<Visite> findByUtilisateur(Utilisateur u) {

		String requete = "";
		requete = "SELECT v FROM Visite v WHERE v.utilisateur.id = :utilisateur" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("utilisateur", u.id);
		return query.getResultList();
		
	}

}
