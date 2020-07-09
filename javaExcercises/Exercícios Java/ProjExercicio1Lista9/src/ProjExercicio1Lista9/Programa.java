package ProjExercicio1Lista9;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		int continuar = 0;
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		do {
			
			System.out.println("Digite o nome do produto:");
			String nome_produto = teclado.leString();
			
			System.out.println("Digite o valor unit�rio do produto:");
			double valorUnitario_produto = teclado.leDouble();
			
			Produto produto = new Produto(nome_produto, valorUnitario_produto);
			produtos.add(produto);
			
			System.out.println("Deseja adicionar outro produto? [1] Sim [2] N�o");
			continuar = teclado.leInt();
			
		} while (continuar == 1);
		
		double somaTotal = 0;
		
		for (int i = 0; i < produtos.size(); i++) {
			somaTotal = somaTotal + produtos.get(i).getValorUnitario();
		}
		
		System.out.println("A quantidade de produtos: " + (produtos.size()));
		System.out.println("A soma dos produtos: " + somaTotal);
		System.out.println("A m�dia dos produtos � de: " + somaTotal / produtos.size());
		System.out.println("O primeiro produto adicionado: " + produtos.get(0).getNome() + " de valor " + produtos.get(0).getValorUnitario());
		System.out.println("O �ltimo produto adicionado: " + produtos.get(produtos.size() - 1).getNome() + " de valor " + produtos.get(produtos.size() - 1).getValorUnitario());
		
				
	}
}
