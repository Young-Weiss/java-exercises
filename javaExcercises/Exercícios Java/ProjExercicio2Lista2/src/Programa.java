import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MovimentacaoFinanceira Mov1 = new MovimentacaoFinanceira();
		MovimentacaoFinanceira Mov2 = new MovimentacaoFinanceira();
		MovimentacaoFinanceira Mov3 = new MovimentacaoFinanceira();
		
		System.out.println("Informe os dados da primeira movimentação financeira");
		
		System.out.printf("Digite a descrição da movimentação:");
		Mov1.descricao = scan.next();
		
		System.out.printf("Digite a data da movimentação: ");
		Mov1.data = scan.next();
		
		System.out.printf("Digite o valor da movimentação: ");
		Mov1.valor = scan.nextDouble();
		
		System.out.println("Informe os dados da segunda movimentação financeira");
		
		System.out.printf("Digite a descrição da movimentação: ");
		Mov2.descricao = scan.next();
		
		System.out.printf("Digite a data da movimentação: ");
		Mov2.data = scan.next();
		
		System.out.printf("Digite o valor da movimentação: ");
		Mov2.valor = scan.nextDouble();
		
		System.out.println("Informe os dados da terceira movimentação financeira: ");
		
		System.out.printf("Digite a descrição da movimentação: ");
		Mov3.descricao = scan.next();
		
		System.out.printf("Digite a data da movimentação: ");
		Mov3.data = scan.next();
		
		System.out.printf("Digite o valor da movimentação: ");
		Mov3.valor = scan.nextDouble();
		
		System.out.println("A soma daos valores das opreações é " + (Mov1.valor + Mov2.valor + Mov3.valor) + "!");
		System.out.println("A média dos valores das operações é " + ((Mov1.valor + Mov2.valor + Mov3.valor) / 3) + "!");
	}
}
