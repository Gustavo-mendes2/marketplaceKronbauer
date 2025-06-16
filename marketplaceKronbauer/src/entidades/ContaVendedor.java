package entidades;

import entidades.enumeradas.Tipo;

public class ContaVendedor extends Conta{
    private Integer valorestoque;
    private String loja;

    public ContaVendedor(Integer id, String nome, String email, String senha, Tipo tier, Integer valorestoque, String loja) {
        super(id, nome, email, senha, tier);
        this.valorestoque = valorestoque;
        this.loja = loja;
    }

    public Integer getValorestoque() {
        return valorestoque;
    }

    public void setValorestoque(Integer valorestoque) {
        this.valorestoque = valorestoque;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }
}
