package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private Integer idProduto;
    private String nome;
    private Double preço;

    public Produto(Integer idProduto, String nome, Double preço) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preço = preço;
    }

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
