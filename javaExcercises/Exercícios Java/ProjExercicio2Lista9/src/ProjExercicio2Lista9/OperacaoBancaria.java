package ProjExercicio2Lista9;

public class OperacaoBancaria {

	private String descricao;
	private double valor;
	private char tipo;
	
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
	public char getTipo() {
		return tipo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(double valor) {
		if ( valor >= 0)
			this.valor = valor;
	}
	public void setTipo(char tipo) {
		if ( tipo == 'C' || tipo == 'D' )
			this.tipo = tipo;
	}
	
	public OperacaoBancaria(String descricao, double valor, char tipo) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	
}
