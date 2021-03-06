package br.fadep.cardapioads.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Usuario" database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idusuario")
	private Long idUsuario;

	@Column(name="logado")
	private Boolean logado;

	@Column(name="login")
	private String login;

	@Column(name="nome")
	private String nome;

	@Column(name="senha")
	private String senha;

	public Usuario() {
	}

	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Boolean getLogado() {
		return this.logado;
	}

	public void setLogado(Boolean logado) {
		this.logado = logado;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}