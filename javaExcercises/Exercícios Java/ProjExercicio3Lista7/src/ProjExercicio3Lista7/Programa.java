package ProjExercicio3Lista7;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Digite o valor do lado A do tri�ngulo:");
		triangulo.setA(teclado.leDouble());

		System.out.println("Digite o valor do lado B do tri�ngulo:");
		triangulo.setB(teclado.leDouble());
		
		System.out.println("Digite o valor do lado C do tri�ngulo:");
		triangulo.setC(teclado.leDouble());
		
		System.out.println("O triangulo � do tipo: " + triangulo.obterTipoTriangulo() );
		
	}
}
