package entidades;

import entidades.enumeradas.Status;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {
    private Integer qtd;
    private Double preço;
    Produto produto;

    //adicionando o tipo de pagamento
    private String forma;
    ServiçoPagamento ServicoPagamento;

    public ItensPedido(Double preço, Produto produto, Integer qtd, String forma, Conta conta) {
        this.preço = preço;
        this.produto = produto;
        this.qtd = qtd;
        //adicionando o tio de pagamento
        this.forma = forma;
        this.conta = conta;
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

    public String getForma() { return forma; }

    public Double precoFinal(){
        if (getForma() == 'C'){
            ServicoPagamento = new ServiçoPagamentoCrédito();
            return ServicoPagamento.pagamento(conta, getPreço());
        }
        if (getForma() = 'P'){
            ServicoPagamento = new ServiçoPagamentoPix();
            return ServicoPagamento.pagamento(conta, getPreço());
        }
    }

    @Override
    public String toString() {
        return "ItensPedido{" +
                "preço=" + precoFinal() +
                ", qtd=" + qtd +
                ", produto=" + produto +
                 +
                '}';
    }
}
