package ProjExercicio1Lista8;

public class Programa {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		
		ItemCarrinhoCompras itemCarrinhoCompras = new ItemCarrinhoCompras();
		Produto produto = new Produto();
				
		System.out.println("Digite o nome do produto:");
		produto.setNome(teclado.leString());
		
		System.out.println("Digite o valor unitário do produto:");
		produto.setValorUnitario(teclado.leDouble());
		
		itemCarrinhoCompras.setProduto(produto);
		
		System.out.println("Digite a quantidade deste produto:");
		itemCarrinhoCompras.setQuantidade(teclado.leInt());
		
		System.out.println("O valor total: " + itemCarrinhoCompras.obterValorTotal() );
		
	}
}
