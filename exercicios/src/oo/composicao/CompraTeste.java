package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Jo?o pedro";
		
		c1.addProduto(new Produto("Caneta", 20, 7.45));
		c1.addProduto(new Produto("Borracha", 12, 3.89));
		c1.produtos.add(new Produto("Caderno", 3, 18.79));
		
		System.out.println(c1.produtos.size());
		System.out.println(c1.valorTotal());

	}
}
