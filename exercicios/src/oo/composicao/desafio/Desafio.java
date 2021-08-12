package oo.composicao.desafio;

public class Desafio {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		Compra c1 = new Compra ();
		c1.addItem("Caneta", 9.67, 100);
		c1.addItem("Notebook", 1897.88, 2);
		
		Compra c2 = new Compra();
		c2.addItem("Caderno", 10, 10);
		c2.addItem("Impressora", 998.90, 1);
		
		cliente.addCompra(c1);
		cliente.compras.add(c2);
		System.out.println("O valor total das compras do cliente foi R$: " + cliente.obterValorTotal());
	}
}
