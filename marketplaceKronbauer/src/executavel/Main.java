package executavel;

import entidades.*;
import entidades.enumeradas.Status;
import entidades.enumeradas.Tipo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

		ContaTransportadora contaTransportadora1 = new ContaTransportadora(21, "Mariana", "Marina@email.com", "marina123","Gol");
		ContaTransportadora contaTransportadora2 = new ContaTransportadora(22, "Cartola", "Cartola@email.com", "cartola123", "Sedex");
		ContaTransportadora contaTransportadora3 = new ContaTransportadora(23, "Samuel", "samuel@email.com", "samuel123", "AmericanExpress");
		ContaTransportadora contaTransportadora4 = new ContaTransportadora(24, "Henry", "henry@email.com", "henry123",  "TransMoveis");
		ContaTransportadora contaTransportadora5 = new ContaTransportadora(25, "Olivia", "Oliviaa@email.com", "olivia123", "BrasilTrans");
		ContaTransportadora contaTransportadora6 = new ContaTransportadora(26, "Rodrigo", "Rodrigo@email.com", "rodrigo123", "ExtraExpress");
		ContaTransportadora contaTransportadora7 = new ContaTransportadora(27, "Cícero", "cicero@email.com", "cicero123", "AmazonDelivery");
		contaList.add(contaTransportadora1);
		contaList.add(contaTransportadora2);
		contaList.add(contaTransportadora3);
		contaList.add(contaTransportadora4);
		contaList.add(contaTransportadora5);
		contaList.add(contaTransportadora6);
		contaList.add(contaTransportadora7);

        Produto produto1 = new Produto(1,"Parati", 8000.00);
        Produto produto2 = new Produto(2, "Gol", 12000.00);
        Produto produto3 = new Produto(3, "Civic", 35000.00);
        Produto produto4 = new Produto(4, "Palio", 9500.00);
        Produto produto5 = new Produto(5, "Onix", 48000.00);
        Produto produto6 = new Produto(6, "Corolla", 52000.00);
        Produto produto7 = new Produto(7, "Uno", 7000.00);


        ArrayList<ItensPedido> itensPedidoList = new ArrayList<>();

        ItensPedido itemPedido1 = new ItensPedido(produto1.getPreço(),produto1,2);
        ItensPedido itemPedido2 = new ItensPedido(produto2.getPreço(), produto2, 1);
        ItensPedido itemPedido3 = new ItensPedido(produto3.getPreço(), produto3, 3);
        ItensPedido itemPedido4 = new ItensPedido(produto4.getPreço(), produto4, 2);
        ItensPedido itemPedido5 = new ItensPedido(produto5.getPreço(), produto5, 1);
        ItensPedido itemPedido6 = new ItensPedido(produto6.getPreço(), produto6, 4);
        ItensPedido itemPedido7 = new ItensPedido(produto7.getPreço(), produto7, 2);

        itensPedidoList.add(itemPedido1);
        itensPedidoList.add(itemPedido2);
        itensPedidoList.add(itemPedido3);
        itensPedidoList.add(itemPedido4);
        itensPedidoList.add(itemPedido5);
        itensPedidoList.add(itemPedido6);
        itensPedidoList.add(itemPedido7);




        Pedido pedido1 = new Pedido(contaClient1,contaTransportadora1,contaVendedor1, LocalDateTime.parse("01/07/2025 07:20",fmt),'p',1,itensPedidoList,1,Status.ENCAMINHADO);

        Pedido pedido2 = new Pedido(contaClient2,contaTransportadora2, contaVendedor2, LocalDateTime.parse("03/07/2025 10:15",fmt), 'c', 2, itensPedidoList, 1, Status.EM_ROTA_DE_ENTREGA);

        Pedido pedido3 = new Pedido(contaClient3,contaTransportadora3,contaVendedor3,LocalDateTime.parse("05/07/2025 14:30",fmt),'d',3, itensPedidoList, 1, Status.ENTREGUE);

        Pedido pedido4 = new Pedido(contaClient4,contaTransportadora4,contaVendedor4,LocalDateTime.parse("07/07/2025 09:45",fmt),'p',4,itensPedidoList,1,Status.ENCAMINHADO);

        Pedido pedido5 = new Pedido(contaClient5,contaTransportadora5,contaVendedor5,LocalDateTime.parse("08/07/2025 17:00",fmt),'c',5,itensPedidoList,1,Status.EM_ROTA_DE_ENTREGA);

        Pedido pedido6 = new Pedido(contaClient6,contaTransportadora6,contaVendedor6,LocalDateTime.parse("09/07/2025 12:20",fmt),'d',6,itensPedidoList,1,Status.ENTREGUE);

        Pedido pedido7 = new Pedido(contaClient7,contaTransportadora7,contaVendedor7,LocalDateTime.parse("10/07/2025 08:00",fmt),'p',7,itensPedidoList,1,Status.ENCAMINHADO);

        pedidoArrayList.add(pedido1);
        pedidoArrayList.add(pedido2);
        pedidoArrayList.add(pedido3);
        pedidoArrayList.add(pedido4);
        pedidoArrayList.add(pedido5);
        pedidoArrayList.add(pedido6);
        pedidoArrayList.add(pedido7);


		int op;
		do {
			System.out.println("1- Alterar pedido ou conta");
			System.out.println("2- Listar");
			System.out.println("3- Adicionar nova conta");
			System.out.println("4- Adicionar um novo pedido");

			op = sc.nextInt();
			switch (op) {
                case 1:
                    System.out.println("O que você quer alterar (1-CONTA 2-PEDIDO)");
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
                    System.out.println("Você quer listar a contas(1) ou pedidos(2)");
                    int opListagem = sc.nextInt();
                    if(opListagem == 1){
                        System.out.println("Digite por qual varivel você quer buscar/listar a conta(1-ID DE CONTA 2-NOME DA CONTA");
                        int opListar = sc.nextInt();
                        System.out.println("Você quer listar ou procurar uma ID especifica?(1-PROCURAR 2-LISTAR");
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
                                System.out.println("Digite o ID mínimo");
                                int idMin = sc.nextInt();
                                System.out.println("Digite o ID máximo");
                                int idMax = sc.nextInt();
                                if(opListar == 1) {
                                    for (Conta conta : contaList) {
                                        if (conta.getId() >= idMin && conta.getId() <= idMax) {
                                            System.out.println(conta);
                                        }
                                    }
                                }
                            }
                            if (opListar == 2){
                                System.out.println("Digite a letra inicial dos nomes que você quer listar:");
                                char letraInicial = sc.next().toLowerCase().charAt(0);
                                for (Conta conta : contaList) {
                                    if (!conta.getNome().isEmpty() &&
                                            Character.toLowerCase(conta.getNome().charAt(0)) == letraInicial) {
                                        System.out.println(conta);
                                    }
                                }
                            }
                        }
                    }
                    if(opListagem == 2){
                        System.out.println("Você quer buscar ou listar o pedido ?(1-BUSCAR 2-LISTAR)");
                        int opListarPedidoL = sc.nextInt();
                        if(opListarPedidoL == 1){
                            System.out.println("Digite por qual variavel você quer buscar o pedido (1-ID 2-Nome do cliente 3-Nome da transportadora)");
                            int opListarPedido = sc.nextInt();
                            if(opListarPedido == 1){
                                System.out.println("Digite o ID que deseja procurar");
                                int idPedidoProcura = sc.nextInt();
                                for (Pedido pedidoListagem : pedidoArrayList){
                                    if (idPedidoProcura == pedidoListagem.getIDPedido()){
                                        System.out.println(pedidoListagem);
                                    }
                                }
                            }
                            if (opListarPedido == 2){
                                System.out.println("Digite o nome do cliente");
                                String nomeClienteP = sc.next();
                                for (Pedido pedidoListagem1 : pedidoArrayList){
                                    if(pedidoListagem1.getContaClient().getNome().equalsIgnoreCase(nomeClienteP)){
                                        System.out.println(pedidoListagem1);
                                    }
                                }
                            }
                            if(opListarPedido == 3){
                                System.out.println("Digite o nome do motorista");
                                String nomeMotoP = sc.next();
                                for (Pedido pedidoListagem2 : pedidoArrayList){
                                    if (pedidoListagem2.getContaTransportadora().getNome().equalsIgnoreCase(nomeMotoP)){
                                        System.out.println(pedidoListagem2);
                                    }
                                }
                            }
                        }
                        if(opListarPedidoL == 2){
                            System.out.println("Digite por qual variavel você quer buscar o pedido (1-ID 2-Nome do cliente 3-Nome da transportadora)");
                            int opListarPedido2 = sc.nextInt();
                            if (opListarPedido2 == 1){
                                System.out.println("Digite o ID mínimo");
                                int idMin = sc.nextInt();
                                System.out.println("Digite o ID máximo");
                                int idMax = sc.nextInt();
                                    for (Pedido pedidolistagem : pedidoArrayList) {
                                        if (pedidolistagem.getIDPedido() >= idMin && pedidolistagem.getIDPedido() <= idMax) {
                                            System.out.println(pedidolistagem);
                                        }
                                    }
                            }
                            if (opListarPedido2 == 2){
                                System.out.println("Digite o nome do cliente");
                                String nomeClienteL = sc.next();
                                for (Pedido pedidolistagem : pedidoArrayList){
                                    if(pedidolistagem.getContaClient().getNome().equalsIgnoreCase(nomeClienteL)){
                                        System.out.println(pedidolistagem);
                                    }
                                }
                            }
                            if(opListarPedido2 == 3){
                                System.out.println("Digite o nome do motorista");
                                String nomeMotoristaL = sc.next();
                                for (Pedido pedidoListagem : pedidoArrayList){
                                    if (pedidoListagem.getContaTransportadora().getNome().equalsIgnoreCase(nomeMotoristaL)){
                                        System.out.println(pedidoListagem);
                                    }
                                }
                            }
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
                            if(Conta.existeId(contaList, ID)){
                                System.out.println("Uma conta com esse ID já existe");
                            }
                            else {
                                ContaClient contaClientNOVA = new ContaClient(ID, nome, email, senha, tipo, CEP);
                                contaList.add(contaClientNOVA);
                            }
                            break;
                        case 2:
                            System.out.println("Digite o nome");
                            nome = sc.next();
                            System.out.println("Digite o email");
                            email = sc.next();
                            System.out.println("Digite a senha");
                            senha = sc.next();
                            System.out.println("Digite a loja");
                            String loja = sc.next();
                            System.out.println("Digite o ID");
                            int id = sc.nextInt();
                           if(Conta.existeId(contaList, id)){
                               System.out.println("Uma conta com esse ID já existe");
                           }
                           else {
                               ContaVendedor contaVendedorNOVA = new ContaVendedor(id, nome, email, senha, loja);
                               contaList.add(contaVendedorNOVA);
                           }
                            break;
                        case 3:
                            System.out.println("Digite o nome");
                            nome = sc.next();
                            System.out.println("Digite o email");
                            email = sc.next();
                            System.out.println("Digite a senha");
                            senha = sc.next();
                            System.out.println("Digite a transportadora responsavel");
                            String transportadora = sc.next();
                            System.out.println("Digite o ID");
                            ID = sc.nextInt();
                           if(Conta.existeId(contaList, ID)){
                             System.out.println("Já existe uma conta com esse ID");
                           }
                           else{
                            ContaTransportadora contaTransportadoraNOVA = new ContaTransportadora(ID, nome, email, senha, transportadora);
                            contaList.add(contaTransportadoraNOVA);
                        }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Qual a ID do cliente");
                    ID = sc.nextInt();
                    ContaClient contaC = (ContaClient) buscarContaPorId(contaList, ID);
                    System.out.println("Digite o ID do transportador responsavel");
                    int IDT = sc.nextInt();
                    ContaTransportadora contaT = (ContaTransportadora) buscarContaPorId(contaList, IDT);
                    System.out.println("Digite o ID do vendedor responsavel");
                    int IDV = sc.nextInt();
                    ContaVendedor contaV = (ContaVendedor) buscarContaPorId(contaList, IDV);
                    if (contaC != null) {
                        if (contaT != null) {
                            if (contaV != null) {
                                System.out.println("Digite o ID do pedido");
                                int PedidoID = sc.nextInt();
                                System.out.println("Quantos produtos tem o pedido");
                                int qtdProdutos = sc.nextInt();
                               // ArrayList<ItensPedido> itensPedidoList = new ArrayList<>();
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
                                System.out.println("Digite a forma de pagamento (C)rédito, (P)ix e (D)ébito");
                                Character formaScan = sc.next().charAt(0);
                                LocalDateTime agora = LocalDateTime.now();
                                int parcelas = 1;
                                if (Character.toLowerCase(formaScan) == 'c') {
                                    System.out.println("Quantas parcelas ? (Máximo de 12)");
                                    parcelas = sc.nextInt();

                                    if (parcelas > 12) {
                                        parcelas = 12;
                                    }
                                }
                                Pedido pedido = new Pedido(contaC, contaT, contaV, agora, formaScan, PedidoID, itensPedidoList, parcelas, Status.ENCAMINHADO);
                                pedidoArrayList.add(pedido);
                                System.out.println(pedidoArrayList);
                            }
                        }
                    }
                    break;
            }

		}while(op != 0);
    }
}