package app;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.Pedidos;
public class ProgramaPizzaria{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
		Pedidos objetoSup = new Pedidos();
		int contador=0;
		try {
			System.out.println(">>>BEM VINDOS A PIZZARIA<<<<");
			System.out.println(">>>Digite Qualquer Tecla Para Iniciar<<<<");
			while(true){
				int quantidadePedidosIndividual=0;
				double preco = 0;
				contador+=1;
				System.out.println("Cliente "+(contador));
				System.out.println("Nome: ");
				input.nextLine();
				String nome=input.nextLine();
				while(nome.isEmpty()) {
					System.err.println("Nome não pode estar vazio!");
					System.err.println("Digite novamente: ");
					nome=input.nextLine();
					if(nome.length()>0) {
						break;
					}
				}
				
				System.out.println("----------------------");
				
				objetoSup.cardapioModelo();
			do {
				System.out.println("Escolha um sabor: ");
				int escolha = input.nextInt();
				if(escolha>=1 && escolha<=8) {
					quantidadePedidosIndividual+=1;
					objetoSup.cardapio(escolha, preco);
					preco+=objetoSup.getPreco();
					if(escolha==8) {
						quantidadePedidosIndividual-=1;
					}
				}else {
					while(escolha<=0 || escolha>=9) {
						System.err.println("Escolha uma alternativa que conste na Lista!");
						System.out.println("Escolha um sabor: ");
						escolha = input.nextInt();
						if(escolha>=1 && escolha<=8) {
							quantidadePedidosIndividual+=1;
							objetoSup.cardapio(escolha, preco);
							preco+=objetoSup.getPreco();
							if(escolha==8) {
								quantidadePedidosIndividual-=1;
							}
						}
					}
				}
				
				System.out.println("Deseja mais alguma coisa? [ QualquerTecla ][ N ] ");
				input.nextLine();
				char continua = input.next().charAt(0);
				if(continua == 'N') {
            	   break;
				}
				
			}while(true);
			
			
			pedidos.add(new Pedidos(nome,preco,quantidadePedidosIndividual));
			
			System.out.println("Possui mais gente na fila? [ S ][ QualquerTecla ] ");
			input.nextLine();
			char continua2 = input.next().charAt(0);
			if(continua2 == 'S') {
				continue;
			}else {
				for(Pedidos obj : pedidos) {
					System.out.println(obj);
				}
				pedidos.toString();
				break;
			}
			
		}
			System.out.println("----------------------");
			
			while(true) {
				System.out.println("Algum pedido cancelado? [ S ][ QualquerTecla ]");
				char continua3=input.next().charAt(0);
				if (continua3 == 'S') {
					System.out.println("----------------------");
					System.out.println("Possui "+pedidos.size()+" pedidos ao todo!");
					for (int i=0;i<pedidos.size();i++){
						System.out.println("\t Cliente na posição : "+i);
				}
					//SE CONTINUA 2 FOR UM NÚMERO
					
					System.out.println("Qual pedido deve ser removido? ");
					int retirar = input.nextInt();
					//SE RETIRAR FOR UM STRING
					pedidos.remove(retirar);
					System.out.println("----------------------");
					System.out.println("INFORMAÇÕES ATUALIZADAS!");
					
					
					for(Pedidos obj : pedidos) {
						System.out.println(obj);
					}
					
					
					
					}else {
						break;
					}
				
				
				}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			input.close();
			System.out.println("Programa Encerrado!");
		}

	}										
}

