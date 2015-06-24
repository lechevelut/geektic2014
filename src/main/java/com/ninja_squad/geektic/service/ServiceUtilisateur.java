package com.ninja_squad.geektic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.Utilisateur;
import com.ninja_squad.geektic.dao.UtilisateurDAO;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Transactional
@RequestMapping("/api/rechercher")
public class ServiceUtilisateur {

	@Autowired
    private UtilisateurDAO dao;
	
    @RequestMapping(value="{centreInteret}/{civilite}", method = GET)
    public List<Utilisateur> getUtilisateur(@PathVariable("centreInteret") String centreInteret, @PathVariable("civilite") String civilite) {
    	return dao.findByCentreInteretEtCivilite(centreInteret, civilite);
    }
}