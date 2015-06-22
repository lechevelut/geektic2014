package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertEquals;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.Utilisateur;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UtilisateurDAOTest extends BaseDaoTest {

    // You can autowire the DAO to test here. For example:
    @Autowired
    private UtilisateurDAO dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf(); // TODO define your operations here.
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }

    @Test
    public void findByIdTest() {
        
    	String expected = "Antoine";
    	Utilisateur u1 = dao.findById(1);
		assertEquals(expected, u1.prenom);
    	
    }
}
