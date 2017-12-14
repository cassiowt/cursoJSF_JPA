package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	private Usuario usuario;
	private ArrayList<Usuario> usuarios;
	private String msg;

	public UsuarioMB() {
		usuario = new Usuario();
		usuarios = new ArrayList<>();
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public String salvaUsuario() {
		//this.msg = "Usuario Salvo: " + this.usuario.getNome();
		this.usuarios.add(this.usuario);
		usuario = new Usuario();
		
		return "lUsuario";
		
	}
}
