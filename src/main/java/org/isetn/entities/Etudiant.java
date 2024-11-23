package org.isetn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateNais;
	
    @ManyToOne
    @JsonIgnore
    @JsonManagedReference
	private Formation formation;
	
	@ManyToOne
	@JsonIgnore
	@JsonManagedReference
	private Classe classe;
	

	public Etudiant(Long id, String nom, String prenom, Date dateNais, Formation formation, Classe classe) {
	    this.id = id;
	    this.nom = nom;
	    this.prenom = prenom;
	    this.dateNais = dateNais;
	    this.formation = formation;
	    this.classe = classe;
	}


	public Etudiant() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNais() {
		return dateNais;
	}


	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}


	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	public Classe getClasse() {
		return classe;
	}


	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	

	
	
	
}
