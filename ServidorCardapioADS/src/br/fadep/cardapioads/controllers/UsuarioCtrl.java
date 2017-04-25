package br.fadep.cardapioads.controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.fadep.cardapioads.models.Usuario;

@Stateless
public class UsuarioCtrl implements UsuarioCtrlInterface {
	
	@PersistenceContext
	EntityManager bdManager;
	
	public Usuario salvar(Usuario usuario) throws Exception{
		try {
			bdManager.persist(usuario);
			return usuario;
		} catch (Exception e) {
			throw e;
		}
	}
}
