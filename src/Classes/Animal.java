package Classes;

public class Animal {

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer codigo;
    private Tipo tipo = new Tipo();
	private float peso;
	private int quantdade;
	private double preco;
	private Fornecedor fornecedor = new Fornecedor();
	private String recebimento;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getQuantdade() {
		return quantdade;
	}
	public void setQuantdade(int quantdade) {
		this.quantdade = quantdade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getRecebimento() {
		return recebimento;
	}
	public void setRecebimento(String recebimento) {
		this.recebimento = recebimento;
	}

}
