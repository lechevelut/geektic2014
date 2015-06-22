package com.ninja_squad.geektic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur {

	@Id
	@Column(name = "ID")
	public int id;
	
	@Column(name = "Nom")
	public String nom;
	
	@Column(name = "Prenom")
	public String prenom;
	
	@Column(name = "Email")
	public String email;
	
	@Column(name = "Civilite")
	public String civilite;
	
	@Column(name = "DateInscription")
	public Date dateInscription;
	
	@Column(name = "Visite")
	public int visite;
	
}
