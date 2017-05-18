package br.fadep.cardapioads.controllers;

import java.util.List;

import javax.ejb.Local;

import br.fadep.cardapioads.models.Usuario;

@Local
public interface UsuarioCtrlInterface {
	
	public Usuario salvar(Usuario usuario) throws Exception;
	
	public List<Usuario> getTodos() throws Exception;
	
	public Usuario login(Usuario usuario) throws Exception;
	
	public void excluir(int idUsuario) throws Exception;
	
}
