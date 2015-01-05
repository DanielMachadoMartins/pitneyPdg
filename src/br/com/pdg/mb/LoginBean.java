package br.com.pdg.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pdg.dao.UsuarioDAO;
import br.com.pdg.util.Usuario;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	
	public String efetuaLogin(){
		
		UsuarioDAO dao = new UsuarioDAO();
		boolean loginValido = dao.existe(this.usuario);
		
		if(loginValido){
			return "home?faces-redirect=true";
		} else {
			this.usuario = new Usuario();
			return "login?faces-redirect=true";
		}
	}
	
	public String efetuaLogout(){
		
		this.usuario = new Usuario();
		
		return "login?faces-redirect=true";
	}
	
	
	public boolean isLogado(){
		return usuario.getLogin() != null;
	}
	
	
	

	public Usuario getUsuario() {
		return usuario;
	}

}
