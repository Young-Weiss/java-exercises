package ProjExercicio3Lita5;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		InscricaoEscolaFutebol inscricao = new InscricaoEscolaFutebol();
		
		System.out.println("Digite seu nome completo: ");
		inscricao.setNomeCompleto(teclado.leString());
		
		System.out.println("Digite o ano de nascimento: ");
		inscricao.setAnoNascimento(teclado.leInt());
		
		System.out.println(inscricao.getNomeCompleto() + " está na categoria " + inscricao.obterCategoria() );
		
	}
}
