import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ProdutoCarrinho produto1 = new ProdutoCarrinho();
		ProdutoCarrinho produto2 = new ProdutoCarrinho();
		ProdutoCarrinho produto3 = new ProdutoCarrinho();
		
		//Primeiro produto
		System.out.println("Digite o id do primeiro produto: ");
		produto1.setId(scan.next());
		
		System.out.println("Digite o nome do primeiro produto: ");
		produto1.setNome(scan.next());
		
		System.out.println("Digite a quantidade do primeiro produto: ");
		produto1.setQuantidade(scan.nextInt());
		
		System.out.println("Digite o valor unitário do primeiro produto: ");
		produto1.setValorUnitario(scan.nextDouble());
		
		//Segundo produto
		System.out.println("Digite o id do segundo produto: ");
		produto2.setId(scan.next());
		
		System.out.println("Digite o nome do segundo produto: ");
		produto2.setNome(scan.next());
		
		System.out.println("Digite a quantidade do segundo produto: ");
		produto2.setQuantidade(scan.nextInt());
		
		System.out.println("Digite o valor unitário do segundo produto: ");
		produto2.setValorUnitario(scan.nextDouble());
		
		//Terceiro produto
		System.out.println("Digite o id do terceiro produto: ");
		produto3.setId(scan.next());
		
		System.out.println("Digite o nome do terceiro produto: ");
		produto3.setNome(scan.next());
		
		System.out.println("Digite a quantidade do terceiro produto: ");
		produto3.setQuantidade(scan.nextInt());
		
		System.out.println("Digite o valor unitário do terceiro produto: ");
		produto3.setValorUnitario(scan.nextDouble());
		
		//Totalizando valores
		System.out.println("O valor total do(a) " + produto1.getNome() + " é R$" + produto1.calcularValorTotal() + "!");
		System.out.println("O valor total do(a) " + produto2.getNome() + " é R$" + produto2.calcularValorTotal() + "!");
		System.out.println("O valor total do(a) " + produto3.getNome() + " é R$" + produto3.calcularValorTotal() + "!");
		System.out.println("O valor total da compra foi de: R$" + (produto1.calcularValorTotal() + produto2.calcularValorTotal() + produto3.calcularValorTotal()));
		
	}
}
