package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.Utilisateur;
import com.ninja_squad.geektic.Visite;

public class VisiteDAOTest extends BaseDaoTest {

	@Autowired
    private VisiteDAO dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf();
        DbSetup dbSetup = new DbSetup(destination, operation);
        dao = new VisiteDAO(em);
        dbSetup.launch();
    }

    @Test
    public void findByIdTest() {
    	String expected = "192.168.1.10";
    	Visite visite = dao.findById(0);
		assertEquals(expected, visite.adresseIp);
    	
    }
    
    @Test
    public void findByUtilisateurTest() {
    	int expected = 0;
    	UtilisateurDAO daoUtilisateur = new UtilisateurDAO(em);
    	Utilisateur u1 = daoUtilisateur.findById(1);
    	List<Visite> listeVisite = dao.findByUtilisateur(u1);
		assertEquals(expected, listeVisite.get(0).id);
    	
    }
	
}
