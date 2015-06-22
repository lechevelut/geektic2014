package com.ninja_squad.geektic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="CentreInteret_Utilisateur")
public class CentreInteretUtilisateur {

	@Id
	@Column(name = "ID")
	public int id;
	
	@ManyToOne
	@JoinColumn(name = "FK_IdUtilisateur")
	public Utilisateur utilisateur;
	
	@ManyToOne
	@JoinColumn(name = "FK_IdCentreInterer")
	public CentreInteret centreInteret;
	
}
