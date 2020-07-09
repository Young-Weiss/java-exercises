
public class Programa {

	public static void main(String[] args) {
		
		Contadora contadora = new Contadora();
		//Contando até 3
		contadora.contar1();
		contadora.contar1();
		contadora.contar1();
		
		System.out.println(contadora.getContagem());
	}
}
