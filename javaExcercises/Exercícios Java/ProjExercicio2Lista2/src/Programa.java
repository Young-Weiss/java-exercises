import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MovimentacaoFinanceira Mov1 = new MovimentacaoFinanceira();
		MovimentacaoFinanceira Mov2 = new MovimentacaoFinanceira();
		MovimentacaoFinanceira Mov3 = new MovimentacaoFinanceira();
		
		System.out.println("Informe os dados da primeira movimenta��o financeira");
		
		System.out.printf("Digite a descri��o da movimenta��o:");
		Mov1.descricao = scan.next();
		
		System.out.printf("Digite a data da movimenta��o: ");
		Mov1.data = scan.next();
		
		System.out.printf("Digite o valor da movimenta��o: ");
		Mov1.valor = scan.nextDouble();
		
		System.out.println("Informe os dados da segunda movimenta��o financeira");
		
		System.out.printf("Digite a descri��o da movimenta��o: ");
		Mov2.descricao = scan.next();
		
		System.out.printf("Digite a data da movimenta��o: ");
		Mov2.data = scan.next();
		
		System.out.printf("Digite o valor da movimenta��o: ");
		Mov2.valor = scan.nextDouble();
		
		System.out.println("Informe os dados da terceira movimenta��o financeira: ");
		
		System.out.printf("Digite a descri��o da movimenta��o: ");
		Mov3.descricao = scan.next();
		
		System.out.printf("Digite a data da movimenta��o: ");
		Mov3.data = scan.next();
		
		System.out.printf("Digite o valor da movimenta��o: ");
		Mov3.valor = scan.nextDouble();
		
		System.out.println("A soma daos valores das oprea��es � " + (Mov1.valor + Mov2.valor + Mov3.valor) + "!");
		System.out.println("A m�dia dos valores das opera��es � " + ((Mov1.valor + Mov2.valor + Mov3.valor) / 3) + "!");
	}
}
