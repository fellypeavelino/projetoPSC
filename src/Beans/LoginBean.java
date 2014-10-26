package Beans;

import javax.faces.bean.ManagedBean;

import Classes.Cliente;
import Fachadas.ILoginBean;

@ManagedBean
public class LoginBean implements ILoginBean{
	public LoginBean(){
		
	}
	
	private Cliente cliente = new Cliente();
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String toMenu(){
		//System.out.println("teste");
		return "menu.xhtml?faces-redirect=true";
	}
	
	
}
