package ProjExercicio2Lista5;

public class ContaBancaria {

	private int id;
	private String nomeTitular;
	private String sobrenomeTitular;
	private String enderecoResidencialTitular;
	private double saldo;
	
	public void depositar(double valorADepositar) {
		if(valorADepositar > 0) {
			this.saldo = this.saldo + valorADepositar;
		}
	}
	
	public void sacar(double valorASacar) {
		if(valorASacar > 0 && valorASacar <= this.saldo) {
			this.saldo = this.saldo - valorASacar;
		}
	}
	
	public void setId(int id) {
		if(id > 0){
			this.id = id;
		}
	}
	
	public int getId() {
		return this.id;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if(nomeTitular.length() > 2) {
			this.nomeTitular = nomeTitular;
		}
	}

	public String getSobrenomeTitular() {
		return sobrenomeTitular;
	}

	public void setSobrenomeTitular(String sobrenomeTitular) {
		this.sobrenomeTitular = sobrenomeTitular;
	}

	public String getEnderecoResidencialTitular() {
		return enderecoResidencialTitular;
	}

	public void setEnderecoResidencialTitular(String enderecoResidencialTitular) {
		this.enderecoResidencialTitular = enderecoResidencialTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
