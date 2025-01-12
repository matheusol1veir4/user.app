package com.sea.sistemy.app.user.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "tb_nivel_acesso")
public class Nivel_acesso {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_nivel_acesso;
	
	private int nivel_acesso;
	
	public Nivel_acesso () {
		
	}

	public Long getId_nivel_acesso() {
		return id_nivel_acesso;
	}

	public void setId_nivel_acesso(Long id_nivel_acesso) {
		this.id_nivel_acesso = id_nivel_acesso;
	}

	public int getNivel_acesso() {
		return nivel_acesso;
	}

	public void setNivel_acesso(int nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
	
}
