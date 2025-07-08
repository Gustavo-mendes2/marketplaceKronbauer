package executavel;

import entidades.*;
import entidades.enumeradas.Status;
import entidades.enumeradas.Tipo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static entidades.Pedido.buscarContaPorId;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		ArrayList<Conta> contaList = new ArrayList<>();
		ArrayList<Pedido> pedidoArrayList = new ArrayList<>();
		ContaVendedor contaVendedor1 = new ContaVendedor(11, "Carla", "Carla@email.com", "Carala123", "Renner");
		ContaVendedor contaVendedor2 = new ContaVendedor(12, "Sara", "Sara@email.com", "Sara123", "C&A");
		ContaVendedor contaVendedor3 = new ContaVendedor(13, "Laos", "laos@email.com", "laos123",  "Chanell");
		ContaVendedor contaVendedor4 = new ContaVendedor(14, "Milton", "Milton@email.com", "milton123", "Americanas");
		ContaVendedor contaVendedor5 = new ContaVendedor(15, "Lara", "Lara@email.com", "lara123", "Casas Bahia");
		ContaVendedor contaVendedor6 = new ContaVendedor(16, "João", "João@email.com", "João123", "Pernambucanas");
		ContaVendedor contaVendedor7 = new ContaVendedor(17, "Bob", "Bob@email.com", "bob123",  "Target");
		contaList.add(contaVendedor1);
		contaList.add(contaVendedor2);
		contaList.add(contaVendedor3);
		contaList.add(contaVendedor4);
		contaList.add(contaVendedor5);
		contaList.add(contaVendedor6);
		contaList.add(contaVendedor7);

		ContaClient contaClient1 = new ContaClient(1, "Chico", "Chico@email.com", "Chico123", Tipo.OURO, 1234);
		ContaClient contaClient2 = new ContaClient(2, "Gabriel", "Gabriel@email.com", "gabriel123", Tipo.BRONZE, 1235);
		ContaClient contaClient3 = new ContaClient(3, "Morissay", "morissay@email.com", "mor123", Tipo.PLATINA, 1236);
		ContaClient contaClient4 = new ContaClient(4, "Laufey", "laufey@email.com", "laufey123", Tipo.DIAMANTE, 1237);
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

		ContaTransportadora contaTransportadora1 = new ContaTransportadora(21, "Mariana", "Marina@email.com", "marina123",1);
		ContaTransportadora contaTransportadora2 = new ContaTransportadora(22, "Cartola", "Cartola@email.com", "cartola123", 3);
		ContaTransportadora contaTransportadora3 = new ContaTransportadora(23, "Samuel", "samuel@email.com", "samuel123", 1);
		ContaTransportadora contaTransportadora4 = new ContaTransportadora(24, "Henry", "henry@email.com", "henry123",  4);
		ContaTransportadora contaTransportadora5 = new ContaTransportadora(25, "Olivia", "Oliviaa@email.com", "olivia123", 2);
		ContaTransportadora contaTransportadora6 = new ContaTransportadora(26, "Rodrigo", "Rodrigo@email.com", "rodrigo123", 10);
		ContaTransportadora contaTransportadora7 = new ContaTransportadora(27, "Cícero", "cicero@email.com", "cicero123", 5);
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
			switch (op) {
                case 1:
                    System.out.println("Qual objeto você quer alterar(1-CONTA 2-PEDIDO)");
                    int opAlterar = sc.nextInt();
                    switch (opAlterar){
                        case 1:
                            System.out.println("Digite o ID da conta que você quer alterar");
                            int scanAlt = sc.nextInt();
                            for (Conta contaAlterar : contaList){
                                if (contaAlterar.getId() == scanAlt){
                                    System.out.println("Digite qual atributo você quer alterar (S)enha, (E)mail, (N)ome, En(D)ereço");
                                    char opAtributoAlterado = sc.next().charAt(0);
                                    switch (opAtributoAlterado){
                                        case 'S':
                                            System.out.println("Digite a senha nova");
                                            String senhaNova = sc.next();
                                            contaAlterar.setSenha(senhaNova);
                                            break;
                                        case 'N':
                                            System.out.println("Digite o novo nome");
                                            String novoNome = sc.next();
                                            contaAlterar.setNome(novoNome);
                                            break;
                                        case 'E':
                                            System.out.println("Digite o novo email");
                                            String novoEmail = sc.next();
                                            contaAlterar.setEmail(novoEmail);
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Digite o ID pedido que você quer alterar");
                            scanAlt = sc.nextInt();
                            for (Pedido pedidoAltera : pedidoArrayList){
                                if(pedidoAltera.getIDPedido() == scanAlt){
                                    System.out.println("Qual atributo você quer alterar (S)tatus, (A)dicionar item, (R)emover item");
                                    char opAltPedido = sc.next().charAt(0);
                                    switch (opAltPedido){
                                        case 'S':
                                            System.out.println("Digite o novo status");
                                            Status altStatus = Status.valueOf(sc.next());
                                            pedidoAltera.setStatus(altStatus);
                                            break;
                                        case 'A':
                                            System.out.println("Quantos produtos novos vão ser inseridos");
                                            int qtdProdutosALT = sc.nextInt();
                                            for (int a = 0; a < qtdProdutosALT; a++) {
                                                System.out.println("Digite o nome do " + (a + 1) + "° produto");
                                                String nomeProdutoALT = sc.next();
                                                System.out.println("Digite o preço do produto");
                                                double preçoProdutoALT = sc.nextDouble();
                                                System.out.println("Digite o id do produto");
                                                int IDProdutoALT = sc.nextInt();
                                                Produto produtoALT = new Produto(IDProdutoALT, nomeProdutoALT, preçoProdutoALT);
                                                System.out.println("Quantidade:");
                                                int quantidadeProdutosALT = sc.nextInt();
                                                ItensPedido itensPedidoALT = new ItensPedido(preçoProdutoALT, produtoALT, quantidadeProdutosALT);
                                                pedidoAltera.addItem(itensPedidoALT);
                                            }
                                            break;
                                        case 'R':
                                            System.out.println("Escreva o id do produto você deseja remover");
                                            int idProdutoALT = sc.nextInt();
                                            for (int i = pedidoAltera.getItensPedidoList().size() - 1; i >= 0; i--){
                                                ItensPedido item = pedidoAltera.getItensPedidoList().get(i);
                                                if (item.getProduto().getIdProduto() == idProdutoALT) {
                                                    pedidoAltera.removeItem(item);
                                            }
                                            }
                                            break;
                                    }
                                }
                            }
                    }
                    break;
                case 2:
                    System.out.println("Digite por qual varivel você quer buscar/listar a conta(1-NOME 2-ID DE CONTA");
                    int opListar = sc.nextInt();
                    System.out.println("Você quer listar ou procurar uma instancia especifica?(1-INSTANCIA 2-LISTAR TODOS");
                    int opListarEcolha = sc.nextInt();
                    if (opListarEcolha == 1) {
                        if (opListar == 1) {
                            System.out.println("Digite o id da conta que você quer procurar");
                            int idProcura = sc.nextInt();
                            for (Conta conta : contaList) {
                                if (conta.getId() == idProcura) {
                                    System.out.println(conta);
                                }
                            }
                        }
                        if (opListar == 2) {
                            System.out.println("Digite o nome da conta que você quer procurar");
                            String nomeContaProcura = sc.next();
                            for (Conta conta1 : contaList){
                                if (conta1.getNome().equalsIgnoreCase(nomeContaProcura)){
                                    System.out.println(conta1);
                                }
                            }
                        }
                    }
                    if (opListarEcolha == 2){
                        if(opListar == 1){
                          System.out.println(contaList);
                        }
                        if (opListar == 2){
                            System.out.println(contaList);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Que tipo de conta você quer inserir?(1-Cliente 2-Vendedor 3- Transportadora");
                    int opTipoConta = sc.nextInt();
                    int ID;
                    switch (opTipoConta) {
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
                            ID = sc.nextInt();
                            for (Conta conta : contaList) {
                                if (conta.getId() == ID) {
                                    System.out.println("Uma conta com esse ID já existe");
                                } else {
                                    conta = new ContaClient(ID, nome, email, senha, tipo, CEP);
                                }
                            }
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
                            for (Conta conta10 : contaList) {
                                if (conta10.getId() == id) {
                                    System.out.println("Uma conta com esse ID já existe");
                                } else {
                                    Conta conta1 = new ContaVendedor(id, nome, email, senha, loja);
                                    contaList.add(conta1);
                                }
                            }
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
                            for (Conta conta20 : contaList) {
                                if (conta20.getId() == ID) {
                                    System.out.println("Uma conta com esse ID já existe");
                                } else {
                                    Conta conta2 = new ContaTransportadora(ID, nome, email, senha, 0);
                                    contaList.add(conta2);
                                }
                            }
                            break;
                    }
                case 4:
                    System.out.println("Qual a ID do cliente");
                    ID = sc.nextInt();
                    ContaClient contaC = (ContaClient) buscarContaPorId(contaList, ID);
                    System.out.println("Digite o ID do transportador responsavel");
                    int IDT = sc.nextInt();
                    ContaTransportadora contaT = (ContaTransportadora) buscarContaPorId(contaList, IDT);
                    if (contaC != null) {
                        if (contaT != null) {
                            System.out.println("Digite o ID do pedido");
                            int PedidoID = sc.nextInt();
                            System.out.println("Quantos produtos tem o pedido");
                            int qtdProdutos = sc.nextInt();
                            ArrayList<ItensPedido> itensPedidoList = new ArrayList<>();
                            for (int a = 0; a < qtdProdutos; a++) {
                                System.out.println("Digite o nome do " + (a + 1) + "° produto");
                                String nomeProduto = sc.next();
                                System.out.println("Digite o preço do produto");
                                double preçoProduto = sc.nextDouble();
                                System.out.println("Digite o id do produto");
                                int IDProduto = sc.nextInt();
                                Produto produto = new Produto(IDProduto, nomeProduto, preçoProduto);
                                System.out.println("Quantidade:");
                                int quantidadeProdutos = sc.nextInt();
                                ItensPedido itensPedido = new ItensPedido(preçoProduto, produto, quantidadeProdutos);
                                itensPedidoList.add(itensPedido);
                            }
                            System.out.println("Digite a forma de pagamento (C) ou (P)");
                            char formaScan = sc.next().charAt(0);
                            LocalDateTime agora = LocalDateTime.now();
                            Pedido pedido = new Pedido(contaC, contaT, agora, formaScan, PedidoID, itensPedidoList, Status.ENCAMINHADO);
                            pedidoArrayList.add(pedido);
                            System.out.println(pedidoArrayList);
                        }
                    }
                    break;
            }

		}while(op != 0);
	}
}