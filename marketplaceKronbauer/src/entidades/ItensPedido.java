package entidades;

import entidades.enumeradas.Status;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {
    private Integer qtd;
    private Double preço;
    Produto produto;
    Status status;

    public ItensPedido(Double preço, Produto produto, Integer qtd, Status status) {
        this.preço = preço;
        this.produto = produto;
        this.qtd = qtd;
        this.status = status;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    Double totalPedido(){
        return preço * qtd;
    }

    @Override
    public String toString() {
        return "ItensPedido{" +
                "preço=" + preço +
                ", qtd=" + qtd +
                ", produto=" + produto +
                ", status=" + status +
                '}';
    }
}
