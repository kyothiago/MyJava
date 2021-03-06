package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Produto> produtos = new ArrayList<>();
	
	void addProduto(Produto produto) {
		produtos.add(produto);
		produto.compra = this;
	}
	
	double valorTotal() {
		double total = 0 ;
		for(Produto produto: produtos) {
			total += produto.qtde * produto.preco;
		}
		return total;

	}
}
