package br.fadep.cardapioads.controllers;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.fadep.cardapioads.models.Usuario;
import sun.security.pkcs11.Secmod.DbMode;

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
	
	
	public Usuario login(Usuario usuario) throws Exception{
		try {
			Query query = bdManager.createQuery("FROM Usuario u WHERE u.login = :login and u.senha = :senha");
			query.setParameter("login", usuario.getLogin());
			query.setParameter("senha", usuario.getSenha());
			Usuario usuarioRetorno = (Usuario) query.getSingleResult();
			return usuarioRetorno;
		} catch (NoResultException ex){	
			return null;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public void excluir(int idUsuario) throws Exception{
		try {
			Usuario usuario = bdManager.find(Usuario.class, idUsuario);
			bdManager.remove(usuario);
		} catch (Exception e) {
			throw e;
		}
		
	}
}
