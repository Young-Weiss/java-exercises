package ProjExercicio3Lista2;

public class Programa {
	
	static Teclado teclado = new Teclado();
	
	public static void main(String[] args) {
		
		//Produto 1
		ProdutoCarrinho prod = new ProdutoCarrinho();
		
		System.out.println("Digite o id do produto: ");
		prod.id = teclado.leInt();
		
		System.out.println("Digite o nome do produto: ");
		prod.nome = teclado.leString();
		
		System.out.println("Digite a quantidade: ");
		prod.quantidade = teclado.leInt();
		
		System.out.println("Digite o valor unit�rio: ");
		prod.valorUnitario = teclado.leDouble();
		
		//Produto 2
		ProdutoCarrinho prod2 = new ProdutoCarrinho();
		
		System.out.println("Digite o id do produto: ");
		prod2.id = teclado.leInt();
		
		System.out.println("Digite o nome do produto: ");
		prod2.nome = teclado.leString();
		
		System.out.println("Digite a quantidade: ");
		prod2.quantidade = teclado.leInt();
		
		System.out.println("Digite o valor unit�rio: ");
		prod2.valorUnitario = teclado.leDouble();
		
		//Produto 3
		ProdutoCarrinho prod3 = new ProdutoCarrinho();
		
		System.out.println("Digite o id do produto: ");
		prod3.id = teclado.leInt();
		
		System.out.println("Digite o nome do produto: ");
		prod3.nome = teclado.leString();
		
		System.out.println("Digite a quantidade: ");
		prod3.quantidade = teclado.leInt();
		
		System.out.println("Digite o valor unit�rio: ");
		prod3.valorUnitario = teclado.leDouble();
		
		//Produto 4
		ProdutoCarrinho prod4 = new ProdutoCarrinho();
		
		System.out.println("Digite o id do produto: ");
		prod4.id = teclado.leInt();
		
		System.out.println("Digite o nome do produto: ");
		prod4.nome = teclado.leString();
		
		System.out.println("Digite a quantidade: ");
		prod4.quantidade = teclado.leInt();
		
		System.out.println("Digite o valor unit�rio: ");
		prod4.valorUnitario = teclado.leDouble();
		
		System.out.println("O valor total do produto 1: " + prod.valorUnitario * prod.quantidade);
		System.out.println("O valor total do produto 2: " + prod2.valorUnitario * prod2.quantidade);
		System.out.println("O valor total do produto 3: " + prod3.valorUnitario * prod3.quantidade);
		System.out.println("O valor total do produto 4: " + prod4.valorUnitario * prod4.quantidade);
		
		System.out.println("A qauntidade total de produtos no carrinho de compras: " + (prod.quantidade + prod2.quantidade + prod3.quantidade + prod4.quantidade));
		
		System.out.println("O valor total do carrinho: " + (prod.valorUnitario * prod.quantidade) + (prod2.valorUnitario * prod2.quantidade) 
				+ (prod3.valorUnitario * prod3.quantidade) + (prod4.valorUnitario * prod4.quantidade));
	}
}
