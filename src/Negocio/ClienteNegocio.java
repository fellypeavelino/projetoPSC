package Negocio;

import Base.ClienteBase;
import Classes.Cliente;
import Interfaces.IClienteBase;

public class ClienteNegocio {
	
	public ClienteNegocio(){
		
	}
	
	IClienteBase cliente = new ClienteBase();
	
	public void inserir(Cliente cliente) throws Exception{
		this.cliente.inserir(cliente);
	}
	
	
}
