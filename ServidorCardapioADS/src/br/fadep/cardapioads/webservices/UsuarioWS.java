package br.fadep.cardapioads.webservices;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import com.google.gson.Gson;

import br.fadep.cardapioads.controllers.UsuarioCtrl;
import br.fadep.cardapioads.models.Usuario;

@Stateless
@Path("/webservice/usuario")
public class UsuarioWS {
	
	@EJB
	UsuarioCtrl usuarioCtrl;
	
	@Path("/salvar")
	@POST
	public String teste(@Context HttpServletRequest context, Usuario usuario){
		Gson gson = new Gson();
		try {
			usuarioCtrl.salvar(usuario);
			return gson.toJson(usuario);
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
