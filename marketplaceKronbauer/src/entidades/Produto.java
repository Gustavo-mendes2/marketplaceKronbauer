package entidades;

import java.util.ArrayList;
import java.util.List;

// Classe que armazena os atributos de cada produto dos itens pedidos.

public class Produto {

    // atributos.

    private Integer idProduto;
    private String nome;
    private Double preço;

    // Constructor.

    public Produto(Integer idProduto, String nome, Double preço) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preço = preço;
    }

    // Getters e setters

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                ", idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
