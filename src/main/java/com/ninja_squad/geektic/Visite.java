package com.ninja_squad.geektic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Visite")
public class Visite {

	@Id
	@Column(name = "ID")
	public int id;
	
	@ManyToOne
	@JoinColumn(name = "FK_IdUtilisateur")
	public Utilisateur utilisateur;
	
	@Column(name = "AdresseIp")
	public String adresseIp;
	
	@Column(name = "InstantVisite")
	public Date dateVisite;
	
}
