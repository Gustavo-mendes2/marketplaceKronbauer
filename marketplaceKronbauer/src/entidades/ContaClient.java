package entidades;

import entidades.enumeradas.Tipo;

public class ContaClient extends Conta {
    private Integer endereço;
    private Tipo tier;

    public ContaClient(Integer id, String nome, String email, String senha, Tipo tier, Integer endereço) {
        super(id, nome, email, senha);
        this.endereço = endereço;
        this.tier = tier;
    }

    public Integer getEndereço() {
        return endereço;
    }

    public void setEndereço(Integer endereço) {
        this.endereço = endereço;
    }

    public Tipo getTier() { return tier; }

    @Override
    public String toString() {
        return "\n" +
                "Informações da conta:" +
                "\n" +
                "Conta cliente" +
                "\n"
                +
                "ID: "+ getId() +
                "\n" +
                "Nome: " + getNome() +
                "\n" +
                "Email: " + getEmail() +
                "\n" +
                "Tier: " +getTier();
    }
}
