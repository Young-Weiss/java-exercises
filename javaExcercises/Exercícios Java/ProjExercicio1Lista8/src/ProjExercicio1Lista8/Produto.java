package ProjExercicio1Lista8;

public class Produto {

	private String nome;
	private double valorUnitario;
	
	public String getNome() {
		return nome;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setValorUnitario(double valorUnitario) {
		if (valorUnitario >= 0)
			this.valorUnitario = valorUnitario;
	}
	
	public Produto(String nome, double valorUnitario) {
		this.setNome(nome);
		this.setValorUnitario(valorUnitario);
	}
	
	public Produto() {}	
	
}
