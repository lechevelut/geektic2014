package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.CentreInteretUtilisateur;
import com.ninja_squad.geektic.Utilisateur;

public class CentreInteretUtilisateurDAOTest extends BaseDaoTest {

	@Autowired
    private CentreInteretUtilisateurDAO dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf();
        DbSetup dbSetup = new DbSetup(destination, operation);
        dao = new CentreInteretUtilisateurDAO(em);
        dbSetup.launch();
    }

    @Test
    @Deprecated
    public void findByIdTest() {
    	String expected = "1";
    	CentreInteretUtilisateur centreInteretUtilisateur = dao.findById(1);
		assertEquals(expected, centreInteretUtilisateur.utilisateur.id);
    	
    }
    
    @Test
    @Deprecated
    public void findByUtilisateurTest() {
    	int expected = 3;
    	UtilisateurDAO daoUtilisateur = new UtilisateurDAO(em);
    	Utilisateur u1 = daoUtilisateur.findById(1);
    	List<CentreInteretUtilisateur> listeCentreInteretUtilisateur = dao.findByUtilisateur(u1);
		assertEquals(expected, listeCentreInteretUtilisateur.get(0).id);
    	
    }
	
}
