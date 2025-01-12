package com.sea.sistemy.app.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_user")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Nome é obrigatório")
	@Size (min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
	private String name;
	
	@NotBlank(message = "CPF é obrigatório")
	@Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "CPF deve estar no formato XXX.XXX.XXX-XX")
	private String CPF;
	
	@NotBlank(message = "Endereço é obrigatório")
	private String endereco;
	
	@NotBlank(message = "Telefone é obrigatório")
	private String telefone;
	
	@Email(message = "E-mail deve ser válido")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_nivel_acesso")
	private Nivel_acesso nivel_acesso;

	public User () {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Nivel_acesso getNivel_acesso() {
		return nivel_acesso;
	}

	public void setNivel_acesso(Nivel_acesso nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}

		
}
