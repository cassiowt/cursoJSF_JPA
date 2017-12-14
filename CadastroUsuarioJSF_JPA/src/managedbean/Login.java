package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String senha;

	public Login() {
		// TODO Auto-generated constructor stub
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

    // se o login = adm e senha=123 retornar"sucesso",retornar"erro"

	public String validaLogin() {

		if(login.equals("adm") && senha.equals("123")) {
			return "sucesso";
		}
		return "erro";
	}

}
