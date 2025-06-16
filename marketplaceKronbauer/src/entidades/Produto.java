package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private Integer idProduto;
    private String nome;
    private String descrição;
    private Double preço;

    public Produto(Integer idProduto, String descrição, String nome, Double preço) {
        this.idProduto = idProduto;
        this.descrição = descrição;
        this.nome = nome;
        this.preço = preço;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
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
}
