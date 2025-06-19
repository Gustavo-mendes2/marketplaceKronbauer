package entidades;

import entidades.enumeradas.Tipo;

public class ContaClient extends Conta {
    private Integer endereço;

    public ContaClient(Integer id, String nome, String email, String senha, Tipo tier, Integer endereço) {
        super(id, nome, email, senha, tier);
        this.endereço = endereço;
    }

    public Integer getEndereço() {
        return endereço;
    }

    public void setEndereço(Integer endereço) {
        this.endereço = endereço;
    }
    @Override
    public String toString() {
        return "\n" +
                "Informações da conta:" +
                "\n" +
                "Conta cliente" +
                "\n"
                +
                "Nome: " + getNome() +
                "\n" +
                "Email: " + getEmail() +
                "\n" +
                "Tier: " +getTier();
    }
}
