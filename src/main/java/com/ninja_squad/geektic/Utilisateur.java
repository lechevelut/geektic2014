package com.ninja_squad.geektic;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
	
	@ManyToMany (fetch=FetchType.EAGER)
	@JoinTable(name="CentreInteret_Utilisateur", joinColumns={@JoinColumn(name="FK_IdUtilisateur", referencedColumnName="ID")},
	      inverseJoinColumns={@JoinColumn(name="FK_IdCentreInterer", referencedColumnName="ID")})
	public List<CentreInteret> listeCentreInteret;
	
}
