package entidades;

import entidades.enumeradas.Tipo;

public class ContaTransportadora extends Conta {
    private String transportadoraResponsavel;

    public ContaTransportadora(Integer id, String nome, String email, String senha, String transportadoraResponsavel) {
        super(id, nome, email, senha);
        this.transportadoraResponsavel = transportadoraResponsavel;
    }
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
