package executavel;

import entidades.Conta;
import entidades.ContaClient;
import entidades.ContaTransportadora;
import entidades.ContaVendedor;
import entidades.enumeradas.Status;
import entidades.enumeradas.Tipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Conta> contaList = List.of(
				new ContaVendedor(11, "Carla", "Carla@email.com", "Carala123", Tipo.Bronze, "Renner"),
				new ContaVendedor(12, "Sara", "Sara@email.com", "Sara123", Tipo.Prata, "C&A"),
				new ContaVendedor(13, "Laos", "laos@email.com", "laos123", Tipo.Platina, "Chanell"),
				new ContaVendedor(14, "Milton", "Milton@email.com", "milton123", Tipo.Ouro, "Americanas"),
				new ContaVendedor(15, "Lara", "Lara@email.com", "lara123", Tipo.Prata, "Casas Bahia"),
				new ContaVendedor(16, "João", "João@email.com", "João123", Tipo.Bronze, "Pernambucanas"),
				new ContaVendedor(17, "Bob", "Bob@email.com", "bob123", Tipo.Ouro, "Target"),

				new ContaClient(1, "Chico", "Chico@email.com", "Chico123", Tipo.Ouro, 1234),
				new ContaClient(2, "Gabriel", "Gabriel@email.com", "gabriel123", Tipo.Bronze, 1235),
				new ContaClient(3, "Morissay", "morissay@email.com", "mor123", Tipo.Platina, 1236),
				new ContaClient(4, "Laufey", "laufey@email.com","laufey123", Tipo.Diamante, 1237),
				new ContaClient(5, "Maria", "maria@email.com", "maria123", Tipo.Ouro, 1238),
				new ContaClient(6, "Froid", "froid@email.com", "froid123", Tipo.Prata, 1239),
				new ContaClient(7, "Scorcesse", "scorcesse@email.com", "scorcesse123", Tipo.Platina, 1240),

				new ContaTransportadora(21, "Mariana", "Marina@email.com", "marina123", Tipo.Diamante, 1),
				new ContaTransportadora(22, "Cartola", "Cartola@email.com", "cartola123", Tipo.Ouro, 3),
				new ContaTransportadora(23, "Samuel", "samuel@email.com", "samuel123", Tipo.Platina, 1),
				new ContaTransportadora(24, "Henry", "henry@email.com", "henry123", Tipo.Prata, 4),
				new ContaTransportadora(25, "Olivia", "Oliviaa@email.com", "olivia123", Tipo.Diamante, 2),
				new ContaTransportadora(26, "Rodrigo", "Rodrigo@email.com", "rodrigo123", Tipo.Bronze, 10),
				new ContaTransportadora(27, "Cícero", "cicero@email.com", "cicero123", Tipo.Prata, 5)
		);


    }

}
