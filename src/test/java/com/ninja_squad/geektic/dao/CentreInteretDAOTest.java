package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.CentreInteret;

public class CentreInteretDAOTest extends BaseDaoTest {

	@Autowired
    private CentreInteretDAO dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf();
        DbSetup dbSetup = new DbSetup(destination, operation);
        dao = new CentreInteretDAO(em);
        dbSetup.launch();
    }

    @Test
    public void findByIdTest() {
    	String expected = "C#";
    	CentreInteret centreInteret = dao.findById(1);
		assertEquals(expected, centreInteret.libelle);
    	
    }
    
    @Test
    public void findByLibelleTest() {
    	int expected = 1;
    	List<CentreInteret> listecentreInteret = dao.findByLibelle("C#");
		assertEquals(expected, listecentreInteret.get(0).id);
    	
    }
	
}
