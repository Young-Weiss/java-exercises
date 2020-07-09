package ProjExercicio1Lista8;

public class ItemCarrinhoCompras {
	
	private int quantidade;
	private Produto produto;
	
	public int getQuantidade() {
		return quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setQuantidade(int quantidade) {
		if (quantidade > 0)
			this.quantidade = quantidade;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double obterValorTotal() {
		
		//Retorna o quantidade de produtos vezes o seu valor
		return this.quantidade * this.produto.getValorUnitario();
		
	}
	
}
