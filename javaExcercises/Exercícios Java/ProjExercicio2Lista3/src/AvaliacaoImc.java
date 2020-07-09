
public class AvaliacaoImc {

	private String nomePessoa; 
	private double altura;
	private double peso;
	
	
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
						
	public double getIMC() {
		double imc;
		imc = this.peso / (Math.pow(this.altura, 2));
		return imc;
	}
	
}
