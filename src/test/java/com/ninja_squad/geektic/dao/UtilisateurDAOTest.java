package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.Utilisateur;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UtilisateurDAOTest extends BaseDaoTest {

    @Autowired
    private UtilisateurDAO dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf();
        DbSetup dbSetup = new DbSetup(destination, operation);
        dao = new UtilisateurDAO(em);
        dbSetup.launch();
    }

    @Test
    public void findByIdTest() {
    	String expected = "Antoine";
    	Utilisateur u1 = dao.findById(1);
		assertEquals(expected, u1.prenom);
		
		assertEquals("3", dao.findById(1).listeCentreInteret.get(0).id);
    	
    }
    
    @Test
    public void findByNomTest() {
    	int expected = 1;
    	List<Utilisateur> listeUtilisateur = dao.findByNom("CROIN");
		assertEquals(expected, listeUtilisateur.get(0).id);
    	
    }
    
    @Test
    public void findByPrenomTest() {
    	int expected = 1;
    	List<Utilisateur> listeUtilisateur = dao.findByPrenom("Antoine");
    	assertEquals(expected, listeUtilisateur.get(0).id);
    	
    }
    
    @Test
    public void findByCentreInteretTest() {
    	int expected = 1;
    	List<Utilisateur> listeUtilisateur = dao.findByCentreInteret("C++");
    	assertEquals(expected, listeUtilisateur.get(0).id);
    	
    }
    
    @Test
    public void findByCentreInteretEtCiviliteTest() {
    	int expected = 1;
    	List<Utilisateur> listeUtilisateur = dao.findByCentreInteretEtCivilite("3", "Homme");
    	assertEquals(expected, listeUtilisateur.get(0).id);
    	
    }
    
}
