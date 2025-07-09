package entidades;

import entidades.enumeradas.Tipo;

// Conta dos clientes

public class ContaClient extends Conta {

    // atributos

    private Integer endereço;
    private Tipo tier;

    // Constructor

    public ContaClient(Integer id, String nome, String email, String senha, Tipo tier, Integer endereço) {
        super(id, nome, email, senha);
        this.endereço = endereço;
        this.tier = tier;
    }

    //Getters e setters

    public Integer getEndereço() {
        return endereço;
    }

    public void setEndereço(Integer endereço) {
        this.endereço = endereço;
    }

    public Tipo getTier() { return tier; }

    @Override
    public String toString() {
        String linha = "+----------------------+--------------------------+\n";
        return linha +
                String.format("| %-20s | %-24s |\n", "Tipo de Conta", "Cliente") +
                linha +
                String.format("| %-20s | %-24d |\n", "ID", getId()) +
                String.format("| %-20s | %-24s |\n", "Nome", getNome()) +
                String.format("| %-20s | %-24s |\n", "Email", getEmail()) +
                String.format("| %-20s | %-24s |\n", "Tier", tier) +
                String.format("| %-20s | %-24s |\n", "Endereço", endereço) +
                linha;
    }
}
