
public class AvaliacaoImc {
	
	private String nomePessoa;
	private double altura;
	private double peso;

	public double calcularImc(){
		double imc = peso / (altura * altura);
		return imc;
	}
	
	public String obterClassificacaoImc() {
		double imc;
		String classificacao;
		imc = this.peso / (this.altura * this.altura); 
		
		if (imc < 18.5) {
			classificacao = "Abaixo do peso";
		}else {
			if (imc >= 18.5 && imc <= 25) {
				classificacao = "Peso normal";
			}else {
				if(imc >= 25 && imc <= 30) {
					classificacao = "Sobrepeso";
				}else {
					classificacao = "Obesidade"; 
				}
			}
		}
		
		return classificacao;
	}


	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getNomePessoa() {
		return this.nomePessoa;
	}
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
}
