package Beans;

import javax.faces.bean.ManagedBean;

import Fachadas.ILoginBean;

@ManagedBean
public class LoginBean implements ILoginBean{
	public LoginBean(){
		
	}
	
	public String toMenu(){
		//System.out.println("teste");
		return "menu.xhtml?faces-redirect=true";
	}
	
	
}
