package com.ninja_squad.geektic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CentreInteret")
public class CentreInteret {
	
	@Id
	@Column(name = "ID")
	public int id;
	
	@Column(name = "Libelle")
	public String libelle;
	
}
