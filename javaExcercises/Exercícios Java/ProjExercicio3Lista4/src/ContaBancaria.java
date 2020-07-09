public class ContaBancaria {
	
	private String id;
	private String nomeTitular;
	private String sobrenomeTitular;
	private String enderecoResidencialTitular;
	private double saldo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
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
	
	public void depositar(double valorDepositado) {
		if(valorDepositado > 0) {
			this.saldo += valorDepositado;
		}
		
	}
	
	public void sacar(double valorSaque) {
		if(valorSaque > 0 && valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		}
	}
	
	
}
