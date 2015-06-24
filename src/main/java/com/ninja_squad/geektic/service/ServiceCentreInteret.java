package com.ninja_squad.geektic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.dao.CentreInteretDAO;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Transactional
@RequestMapping("api/recherche/centreInteret")
public class ServiceCentreInteret {

	@Autowired
    private CentreInteretDAO dao;
	
	@RequestMapping(method = GET)
    public List<CentreInteret> getCentreInteret()
    {
        return dao.findAll();
    }
}