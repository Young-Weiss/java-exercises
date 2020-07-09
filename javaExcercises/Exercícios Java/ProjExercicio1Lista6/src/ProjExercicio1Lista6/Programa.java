package ProjExercicio1Lista6;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		Atleta atleta = new Atleta();
		
		System.out.println("Informe a idade do atleta:");
		atleta.setIdade(teclado.leInt());
		
		System.out.println("Informe o peso do atleta:");
		atleta.setPeso(teclado.leDouble());
		
		System.out.println("O atleta é da categoria: " + atleta.obterCategoria());
		
	}
}
