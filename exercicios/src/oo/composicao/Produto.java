package oo.composicao;

public class Produto {
	
	String nome;
	int qtde;
	double preco;
	Compra compra;
	
	Produto(String nome, int qtde, double preco){
		this.nome = nome;
		this.qtde = qtde;
		this.preco = preco;
	}
}
