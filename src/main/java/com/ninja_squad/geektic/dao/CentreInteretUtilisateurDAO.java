package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

@Repository
@Deprecated
public class CentreInteretUtilisateurDAO implements ICentreInteretUtilisateurDAO {

	private EntityManager entityManager;
	
	@Deprecated
	public CentreInteretUtilisateurDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Deprecated
	public CentreInteretUtilisateurDAO() {
		
	}
	
	@Deprecated
	@Override
	public CentreInteretUtilisateur findById(int id) {

		String requete = "";
		requete = "SELECT ciu FROM CentreInteretUtilisateur ciu WHERE ciu.id = :id" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("id", id);
		return (CentreInteretUtilisateur) query.getSingleResult();
		
	}

	@Deprecated
	@Override
	public List<CentreInteretUtilisateur> findByUtilisateur(Utilisateur u) {

		String requete = "";
		requete = "SELECT ciu FROM CentreInteretUtilisateur ciu WHERE ciu.utilisateur.id = :utilisateur" ;
		Query query = entityManager.createQuery(requete);
		query.setParameter("utilisateur", u.id);
		return query.getResultList();
		
	}

}
