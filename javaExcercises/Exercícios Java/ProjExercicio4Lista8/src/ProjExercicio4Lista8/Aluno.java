package ProjExercicio4Lista8;

public class Aluno {

	private String nomeCompleto;
	private int altura;
	private int genero;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public int getAltura() {
		return altura;
	}
	public int getGenero() {
		return genero;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public void setAltura(int altura) {
		if ( altura > 0 )
			this.altura = altura;
	}
	public void setGenero(int genero) {
		// 1 = masculino - 2 = feminino
		if ( genero == 1 || genero == 2)
			this.genero = genero;
	}
	
		
	
}
