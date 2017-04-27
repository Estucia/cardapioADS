package br.fadep.cardapioads.controllers;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	
	public List<Usuario> getTodos() throws Exception {
		try {
			Query query = bdManager.createQuery("SELECT u FROM Usuario u");
			List<Usuario> usuarios = query.getResultList();
			return usuarios;
		} catch (Exception e) {
			throw e;
		}
	}
}
