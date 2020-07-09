
public class Programa {
	
	public static void main(String [] args) {
		
		Teclado teclado = new Teclado();
		
		AvaliacaoImc pessoa1 = new AvaliacaoImc();
		
		System.out.println("Digite seus dados.");
		
		System.out.println("Digite seu nome: ");
		pessoa1.setNomePessoa(teclado.leString());
		
		System.out.println("Digite sua altura: ");
		pessoa1.setAltura(teclado.leDouble());
		
		System.out.println("Digite seu peso: ");
		pessoa1.setPeso(teclado.leDouble());
		
		System.out.println("O IMC da pessoa é: " + pessoa1.calcularImc() + " e sua classificação é de " + pessoa1.obterClassificacaoImc() );
		
	}

}
