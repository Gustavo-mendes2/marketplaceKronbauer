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

    //adicionando o tipo de pagamento
    private String forma;
    private ServiçoPagamento ServicoPagamento;
    private Tipo contaTipo;

    public ItensPedido(Double preço, Produto produto, Integer qtd, String forma, Tipo contaTipo) {
        this.preço = preço;
        this.produto = produto;
        this.qtd = qtd;
        //adicionando o tio de pagamento
        this.forma = forma;
        this.contaTipo = contaTipo;
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

        if (getForma().equalsIgnoreCase("C")){
            ServicoPagamento = new ServiçoPagamentoCrédito();
            return ServicoPagamento.Pagamento(contaTipo, getPreço());
        }
        if (getForma().equalsIgnoreCase("P")){
            ServicoPagamento = new ServiçoPagamentoPix();
            return ServicoPagamento.Pagamento(contaTipo, getPreço());
        }
        return 0.00;
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
