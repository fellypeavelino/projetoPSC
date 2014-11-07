package Classes;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer codigo;
	private String telefone;
	private String celular;
	private String mail;
	private String endereco;
    private String senha;
    //private String estado, cep, municipio, logradouro, complemento;
    //private int numero;
    private String nome;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
