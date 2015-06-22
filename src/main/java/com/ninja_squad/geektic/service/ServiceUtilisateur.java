package com.ninja_squad.geektic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.Utilisateur;
import com.ninja_squad.geektic.dao.UtilisateurDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Transactional
@RequestMapping("/api/rechercher")
public class ServiceUtilisateur {

	@Autowired
    private UtilisateurDAO dao;
	
    @RequestMapping(method = GET)
    public Utilisateur getUtilisateur() {
    	return dao.findById(1);
    }
}