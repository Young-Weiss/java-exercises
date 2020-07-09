package ProjExercicio2Lista8;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();		
		
		System.out.println("Digite o X do primeiro ponto: ");
		ponto1.setX(teclado.leDouble());
		
		System.out.println("Digite o Y do primeiro ponto: ");
		ponto1.setY(teclado.leDouble());
		
		System.out.println("Digite o X do segundo ponto: ");
		ponto2.setX(teclado.leDouble());
		
		System.out.println("Digite o Y do segundo ponto: ");
		ponto2.setY(teclado.leDouble());
		
		Reta reta = new Reta(ponto1, ponto2);
		
		System.out.println("A distância entre os dois: " + reta.getDistancia() );
		
	}
}
