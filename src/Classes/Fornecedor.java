package Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fornecedor extends PessoaJuridica{

	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}
	@Id 
	@GeneratedValue
	private Integer codigo;
}
