package model;
public class Pedidos {
	private String nomeCliente;
	private double preco;
	private int quantidadePedidos;//por cliente
	
	
	public Pedidos(String nomeCliente, double preco, int quantidadePedidos ) {		
		this.nomeCliente = nomeCliente;
		this.preco = preco;
		this.quantidadePedidos = quantidadePedidos;
		
		
		
	}
	
	public Pedidos(int quantidadePedidos) {
		this.quantidadePedidos = quantidadePedidos;
	}
	
	public Pedidos() {
	}

	public String getNomeCliente() {
		if(nomeCliente.isEmpty()) { 
			throw new RuntimeException("Nome não pode estar vazio!");
		}else {
			return nomeCliente;
		}
		
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getPreco() {
		return preco;
		
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadePedidos() {
		if(quantidadePedidos==0) {
			throw new RuntimeException("Quantidade de pedidos por cliente não pode ser 0");
		}else {
			return quantidadePedidos;
		}
		
	}
	
	public void setQuantidadePedidos(int quantidadePedidos) {
		this.quantidadePedidos = quantidadePedidos;
	}
	

	public void cardapioModelo() {
		System.out.println( ">>Cardápio<<"
				+ "\n---------------------"
                + "\n1)Pizza de Calabresa->R$80.00"
                + "\n2)Pizza Portuguesa->R$100.00"
                + "\n3)Pizza de Frango->R$90.00"
                + "\n4)Pizza de Marguerita->R$78.00"
                + "\n5)Pizza de Queijo->R$50.00"
                + "\n6)Pizza de Queijo com 4 bordas->R$105.00"
                + "\n7)Pizza de Queijo com catupiry->R$120.00"
                + "\n8)Anular pedido , caso tenha apertado errado!"
				+ "\n---------------------");
	}
	
	public double  cardapio(int num, double p) {
		 switch (num) {
		case 1: {
			System.out.println(">>Pizza de Calabresa");
			this.setPreco(p=80);
			return p;
		}
		case 2:{
			System.out.println(">>Pizza Portuguesa");
			this.setPreco(p=100);
			return p;
		} 
		case 3:{
			System.out.println(">>Pizza de Frango");
			this.setPreco(p=90);
			return p;
		}
		case 4:{
			System.out.println(">>Pizza de Marguerita");
			this.setPreco(p=78);
			return p;
		}
		
		case 5:{
			System.out.println(">>Pizza de Queijo");
			this.setPreco(p=50);
			return p;
		}
		case 6 :{
			System.out.println(">>Pizza de Queijo com 4 bordas");
			this.setPreco(p=105);
			return p;
		} 
		case 7 :{
			System.out.println(">>Pizza de Queijo com catupiry");
			this.setPreco(p=120);
			return p;
		}
		
		case 8:{
			System.out.println("Cancelamento do Pedido.");
			this.setPreco(0);
			return p;
		}
			
		default:
			throw new IllegalArgumentException("Escolha não consta na planilha! : " + num);
		}
		
	}
	
	
	
	
	public String toString() {
		return "---------------------------------------"
				+"\nNome do cliente: "
				+ this.getNomeCliente()
				+ " \nValor total do pedido: R$" 
				+ String.format("%.2f",this.getPreco()) 
				+ " \nQuatidade de pedidos: " 
				+ this.getQuantidadePedidos();
	}



}
	
	

	