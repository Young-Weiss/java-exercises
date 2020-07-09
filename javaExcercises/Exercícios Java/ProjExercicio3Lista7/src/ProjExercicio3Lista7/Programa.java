package ProjExercicio3Lista7;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Digite o valor do lado A do triângulo:");
		triangulo.setA(teclado.leDouble());

		System.out.println("Digite o valor do lado B do triângulo:");
		triangulo.setB(teclado.leDouble());
		
		System.out.println("Digite o valor do lado C do triângulo:");
		triangulo.setC(teclado.leDouble());
		
		System.out.println("O triangulo é do tipo: " + triangulo.obterTipoTriangulo() );
		
	}
}
