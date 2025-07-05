package executavel;

import entidades.*;
import entidades.enumeradas.Status;
import entidades.enumeradas.Tipo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		ArrayList<Conta> contaList = new ArrayList<>();
		ArrayList<Pedido> pedidoArrayList = new ArrayList<>();
		 ContaVendedor contaVendedor1 = new ContaVendedor(11, "Carla", "Carla@email.com", "Carala123", Tipo.BRONZE, "Renner");
		ContaVendedor contaVendedor2 = new ContaVendedor(12, "Sara", "Sara@email.com", "Sara123", Tipo.PRATA, "C&A");
		ContaVendedor contaVendedor3= new ContaVendedor(13, "Laos", "laos@email.com", "laos123", Tipo.PLATINA, "Chanell");
		ContaVendedor contaVendedor4 = new ContaVendedor(14, "Milton", "Milton@email.com", "milton123", Tipo.OURO, "Americanas");
		ContaVendedor contaVendedor5 = new ContaVendedor(15, "Lara", "Lara@email.com", "lara123", Tipo.PRATA, "Casas Bahia");
		ContaVendedor contaVendedor6 = new ContaVendedor(16, "João", "João@email.com", "João123", Tipo.BRONZE, "Pernambucanas");
		ContaVendedor contaVendedor7 = new ContaVendedor(17, "Bob", "Bob@email.com", "bob123", Tipo.OURO, "Target");
		contaList.add(contaVendedor1);
		contaList.add(contaVendedor2);
		contaList.add(contaVendedor3);
		contaList.add(contaVendedor4);
		contaList.add(contaVendedor5);
		contaList.add(contaVendedor6);
		contaList.add(contaVendedor7);

		ContaClient contaClient1 = new ContaClient(1, "Chico", "Chico@email.com", "Chico123", Tipo.OURO, 1234);
	    ContaClient contaClient2 = new  ContaClient(2, "Gabriel", "Gabriel@email.com", "gabriel123", Tipo.BRONZE, 1235);
		ContaClient contaClient3 = new ContaClient(3, "Morissay", "morissay@email.com", "mor123", Tipo.PLATINA, 1236);
		ContaClient contaClient4 = new ContaClient(4, "Laufey", "laufey@email.com","laufey123", Tipo.DIAMANTE, 1237);
		ContaClient contaClient5 = new ContaClient(5, "Maria", "maria@email.com", "maria123", Tipo.OURO, 1238);
		ContaClient contaClient6 = new ContaClient(6, "Froid", "froid@email.com", "froid123", Tipo.PRATA, 1239);
		ContaClient contaClient7 = new ContaClient(7, "Laura", "laura@email.com", "laura123", Tipo.PRATA, 1240);
		contaList.add(contaClient1);
		contaList.add(contaClient2);
		contaList.add(contaClient3);
		contaList.add(contaClient4);
		contaList.add(contaClient5);
		contaList.add(contaClient6);
		contaList.add(contaClient7);

		ContaTransportadora contaTransportadora1 = new ContaTransportadora(21, "Mariana", "Marina@email.com", "marina123", Tipo.DIAMANTE, 1);
		ContaTransportadora contaTransportadora2 = new ContaTransportadora(22, "Cartola", "Cartola@email.com", "cartola123", Tipo.OURO, 3);
		ContaTransportadora contaTransportadora3 = new ContaTransportadora(23, "Samuel", "samuel@email.com", "samuel123", Tipo.PLATINA, 1);
		ContaTransportadora contaTransportadora4 = new ContaTransportadora(24, "Henry", "henry@email.com", "henry123", Tipo.PRATA, 4);
		ContaTransportadora contaTransportadora5 = new ContaTransportadora(25, "Olivia", "Oliviaa@email.com", "olivia123", Tipo.DIAMANTE, 2);
		ContaTransportadora contaTransportadora6 = new ContaTransportadora(26, "Rodrigo", "Rodrigo@email.com", "rodrigo123", Tipo.BRONZE, 10);
		ContaTransportadora contaTransportadora7 = new ContaTransportadora(27, "Cícero", "cicero@email.com", "cicero123", Tipo.PRATA, 5);
		contaList.add(contaTransportadora1);
		contaList.add(contaTransportadora2);
		contaList.add(contaTransportadora3);
		contaList.add(contaTransportadora4);
		contaList.add(contaTransportadora5);
		contaList.add(contaTransportadora6);
		contaList.add(contaTransportadora7);

		ArrayList<Pedido> pedidos = new ArrayList<>();
		int op;
		do {
			System.out.println("Escolha uma opção");
			System.out.println("1- Listar todas contas registradas");
			System.out.println("2- Procurar conta especifica por ID");
			System.out.println("3- Adicionar nova conta");
			System.out.println("4- Adicionar um novo pedido");

			op = sc.nextInt();
			switch (op){
				case 1:
					System.out.println(contaList);
					break;
				case 2:
					System.out.println("Digite o id da conta que você quer procurar");
					int idProcura = sc.nextInt();
					for (Conta conta : contaList){
						if (conta.getId() == idProcura){
							System.out.println(conta);
						}
					}
					break;
				case 3:
					System.out.println("Que tipo de conta você quer inserir?(1-Cliente 2-Vendedor 3- Transportadora");
					int opTipoConta = sc.nextInt();
					switch (opTipoConta){
						case 1:
							System.out.println("Digite o nome");
							String nome = sc.next();
							System.out.println("Digite o email");
							String email = sc.next();
							System.out.println("Digite a senha");
							String senha = sc.next();
							System.out.println("Digite o Tier da conta");
							Tipo tipo = Tipo.valueOf(sc.next().toUpperCase());
							System.out.println("Digite o CEP");
							int CEP = sc.nextInt();
							System.out.println("Digite o ID");
							int ID = sc.nextInt();
							Conta conta = new ContaClient(ID, nome, email, senha, tipo, CEP);
							contaList.add(conta);
							break;
						case 2:
							System.out.println("Digite o nome");
							 nome = sc.next();
							System.out.println("Digite o email");
					         email = sc.next();
							System.out.println("Digite a senha");
							 senha = sc.next();
							System.out.println("Digite o Tier da conta");
							 tipo = Tipo.valueOf(sc.next().toUpperCase());
							System.out.println("Digite a loja");
							String loja = sc.next();
							System.out.println("Digite o ID");
							int id = sc.nextInt();
							Conta conta1 = new ContaVendedor(id, nome, email, senha, tipo, loja);
							contaList.add(conta1);
							break;
						case 3:
							System.out.println("Digite o nome");
							nome = sc.next();
							System.out.println("Digite o email");
							 email = sc.next();
							System.out.println("Digite a senha");
							 senha = sc.next();
							System.out.println("Digite o Tier da conta");
							 tipo = Tipo.valueOf(sc.next().toUpperCase());
							System.out.println("Digite o ID");
							 ID = sc.nextInt();
							Conta conta2 = new ContaTransportadora(ID, nome, email, senha, tipo, 0);
							contaList.add(conta2);
							break;
					}
				case 4:

					System.out.println("Qual a ID do cliente");
					int ID = sc.nextInt();
					Tipo contaTipo = null;
					for (Conta conta : contaList){
						if (conta.getId() == ID){
							contaTipo = conta.getTier();
						}
					}

					System.out.println("Quantos produtos tem o pedido");
					int qtdProdutos = sc.nextInt();
					ArrayList<ItensPedido> itensPedidoList = new ArrayList<>();
					for (int a = 0; a < qtdProdutos; a++){
						System.out.println("Digite o nome do " + (a+1) +"° produto");
						String nomeProduto = sc.next();
						System.out.println("Digite o preço do produto");
						double preçoProduto = sc.nextDouble();
						System.out.println("Digite o id do produto");
						int IDProduto = sc.nextInt();
						Produto produto = new Produto(IDProduto, nomeProduto, preçoProduto);
						System.out.println("Quantidade:");
						int quantidadeProdutos = sc.nextInt();

                        String tipoPagamento;

                        System.out.println("Qual a forma de pagamento ? (C)redito ou (P)ix");
                        tipoPagamento = sc.next();

						ItensPedido itensPedido = new ItensPedido(preçoProduto,produto,quantidadeProdutos,tipoPagamento,contaTipo);
						itensPedidoList.add(itensPedido);
					}
					LocalDateTime agora = LocalDateTime.now();
					Pedido pedido = new Pedido(agora, 15, itensPedidoList, Status.ENCAMINHADO);
					pedidoArrayList.add(pedido);
					System.out.println(pedidoArrayList);
			}
		}while (op != 0);

    }

}
