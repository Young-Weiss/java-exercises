package ProjExercicio2Lista6;

public class AlunoAcademia {
	private String nomeCompleto;
	private int altura;
	private int genero;
	
	public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
    	if (altura > 0) {
        this.altura = altura;
        }
    }
    public int getGenero() {
        return genero;
    }
    public void setGenero(int genero) {
    	if ( genero == 1 || genero == 2) {
        this.genero = genero;
    	} else {
    		System.out.println("O gênero deve ser informado com 1 para masculino ou 2 para feminino!");
    	}
    }

    public double obterPesoIdeal() {
        double pesoIdeal = 0;

        if(this.genero == 1) {
            pesoIdeal = (altura - 100) * 0.90;
        }
        
        if(this.genero == 2) {
            pesoIdeal = (altura - 100) * 0.85;
        }
        return pesoIdeal;
    }
}
