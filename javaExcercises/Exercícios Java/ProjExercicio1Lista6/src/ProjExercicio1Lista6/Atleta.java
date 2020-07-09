package ProjExercicio1Lista6;

public class Atleta {
	
	private int idade;
	private double peso;

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if ( idade > 0)
			this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if ( peso > 0 )
			this.peso = peso;
	}
	
	public String obterCategoria() {		
		double peso = this.peso;
		
		String categoria;
		
		if ( this.idade <= 12 ) {
			categoria = "Infantil";
		
		} else if ( this.idade >= 13 && this.idade <= 16) {
			if(peso <= 40) {
				categoria = "Juvenil leve"; 
			} else {
				categoria = "Juvenil pesado";
			}
		
		} else if ( this.idade >= 17 && this.idade <= 24) {
			if(peso < 45) {
				categoria = "Senior leve";
			} else if ( peso >= 45 && peso <= 60){
				categoria = "Senior médio";
			} else {
				categoria = "Senior pesado";
			}				
				
		} else {
			categoria = "Veterano";
		}
		
		return categoria;
	}
	
}
