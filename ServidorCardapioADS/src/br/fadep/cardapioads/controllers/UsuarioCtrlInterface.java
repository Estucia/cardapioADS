package br.fadep.cardapioads.controllers;

import javax.ejb.Local;

import br.fadep.cardapioads.models.Usuario;

@Local
public interface UsuarioCtrlInterface {
	
	public Usuario salvar(Usuario usuario) throws Exception;
	
}
