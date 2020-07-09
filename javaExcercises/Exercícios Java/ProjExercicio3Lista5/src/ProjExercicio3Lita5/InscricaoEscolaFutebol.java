package ProjExercicio3Lita5;

import java.util.Calendar;

public class InscricaoEscolaFutebol {
	
	private String nomeCompleto;
	private int anoNascimento;
	
	int ano = Calendar.getInstance().get(Calendar.YEAR);

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public void setAnoNascimento(int anoNascimento) {
		if (anoNascimento > 0)
			this.anoNascimento = anoNascimento;
	}
	
	public String obterCategoria() {
		int idade = ano - this.anoNascimento;
		String categoria;
		
		if ( idade <= 4 ) {
			categoria = "Nenhuma";
		} else if ( idade >= 5 && idade <= 7) {
			categoria = "Infantil A";
		} else if ( idade >= 8 && idade <= 10) {
			categoria = "Infantil B";
		} else if ( idade >= 11 && idade <= 13) {
			categoria = "Juvenil A";
		} else if ( idade >= 14 && idade <= 17) {
			categoria = "Juvenil B";
		} else {
			categoria = "Adulto";
		}
		
		return categoria;
	}
	
}
