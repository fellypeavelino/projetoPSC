package Classes;

public class PessoaFisica extends Pessoa{

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer codigo;
	private String cpf;
	private String nome;
	private String sexo;
	private String nascimento;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
}
