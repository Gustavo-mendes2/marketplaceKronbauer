package entidades;

import entidades.enumeradas.Tipo;

// Contas das transportadoras

public class ContaTransportadora extends Conta {

    // Atributos

    private String transportadoraResponsavel;

    // Constructor

    public ContaTransportadora(Integer id, String nome, String email, String senha, String transportadoraResponsavel) {
        super(id, nome, email, senha);
        this.transportadoraResponsavel = transportadoraResponsavel;
    }

    // toString que mostra os dados da transportadora

    @Override
    public String toString() {
        String linha = "+----------------------+--------------------------+\n";
        return linha +
                String.format("| %-20s | %-24s |\n", "Tipo de Conta", "Transportadora") +
                linha +
                String.format("| %-20s | %-24d |\n", "ID", getId()) +
                String.format("| %-20s | %-24s |\n", "Nome", getNome()) +
                String.format("| %-20s | %-24s |\n", "Email", getEmail()) +
                String.format("| %-20s | %-24s |\n", "Responsável", transportadoraResponsavel) +
                linha;
    }
}
