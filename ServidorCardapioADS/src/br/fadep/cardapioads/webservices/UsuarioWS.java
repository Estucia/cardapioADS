package br.fadep.cardapioads.webservices;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import com.google.gson.Gson;

import br.fadep.cardapioads.controllers.UsuarioCtrlInterface;
import br.fadep.cardapioads.models.Usuario;

@Stateless
@Path("/webservice/usuario")
public class UsuarioWS {
	
	@EJB
	UsuarioCtrlInterface usuarioCtrl;
	
	@Path("/salvar")
	@POST
	public String salvar(@Context HttpServletRequest context, Usuario usuario){
		Gson gson = new Gson();
		try {
			usuarioCtrl.salvar(usuario);
			return gson.toJson(usuario);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@Path("/getTodos")
	@GET
	public String getTodos(@Context HttpServletRequest context){
		Gson gson = new Gson();
		try {
			return gson.toJson(usuarioCtrl.getTodos());
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
