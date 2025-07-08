package entidades;

import entidades.enumeradas.Status;
import entidades.enumeradas.Tipo;
import serviços.ServiçoPagamento;
import serviços.ServiçoPagamentoCrédito;
import serviços.ServiçoPagamentoPix;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {
    private Integer qtd;
    private Double preço;
    private Produto produto;

    public ItensPedido(Double preço, Produto produto, Integer qtd) {
        this.preço = preço;
        this.produto = produto;
        this.qtd = qtd;
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

    public Double totalPedido(){
        return preço * qtd;
    }


    @Override
    public String toString() {
        String linha = "+--------+--------------------------+----------------+\n";
        StringBuilder sb = new StringBuilder();
        sb.append(linha);
        sb.append(String.format("| %-6s | %-24s | %-14s |\n", "Qtd", "Produto", "Total Item"));
        sb.append(linha);
        sb.append(String.format("| %-6d | %-24s | R$ %-12.2f |\n", qtd, produto.getNome(), totalPedido()));
        sb.append(linha);
        return sb.toString();
    }
}
