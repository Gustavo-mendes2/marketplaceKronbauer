package entidades;

import entidades.enumeradas.Tipo;

public class ContaVendedor extends Conta{
    private String loja;

    public ContaVendedor(Integer id, String nome, String email, String senha, Tipo tier,  String loja) {
        super(id, nome, email, senha, tier);
        this.loja = loja;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    @Override
    public String toString() {
        return "Informações da conta:" +
                "Nome: " + getNome() +
                "\n" +
                "Email: " + getEmail() +
                "\n" +
                "Tier: " +getTier() +
                "\n" +
                "Loja: " + loja;
    }
}
