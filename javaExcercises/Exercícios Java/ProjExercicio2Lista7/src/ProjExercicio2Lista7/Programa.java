package ProjExercicio2Lista7;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		double comprimento, altura;
		
		System.out.println("Digite a altura do muro: ");
		altura = teclado.leDouble();
		
		System.out.println("Digite o comprimento do muro: ");
		comprimento = teclado.leDouble();
				
		System.out.println("A quantidade de latas de tintas utilizadas sera: " +  CalculoTinta.calcularQuantidadeLatasTinta(comprimento, altura));
		
	}
}
