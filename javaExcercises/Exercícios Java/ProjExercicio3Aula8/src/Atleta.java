
public class Atleta {

	private int idade;
	private double peso;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade >= 0) { 
				this.idade = idade;
		}
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
