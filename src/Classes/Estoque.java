package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Estoque {

	public Estoque() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer codigo;
	private Date data_entrada;
	private Date data_saida;
	private int quantidade;
	private Date prazo;
    //private ArrayList<Produto> produto = new ArrayList<Produto>();
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Date getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}
	public Date getData_saida() {
		return data_saida;
	}
	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getPrazo() {
		return prazo;
	}
	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}
	
}
