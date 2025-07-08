package entidades;

import entidades.enumeradas.Status;
import serviços.ServiçoPagamento;
import serviços.ServiçoPagamentoCrédito;
import serviços.ServiçoPagamentoPix;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer IDPedido;
    private LocalDateTime data;
    private Status status;
    private Double total;
    private ContaTransportadora contaTransportadora;
    private ContaClient contaClient;
    private Character formaDPagamento;
    List<ItensPedido> itensPedidoList = new ArrayList<>();
    public static Conta buscarContaPorId(ArrayList<Conta> lista, int id) {
        for (Conta conta : lista) {
            if (conta.getId() == id) {
                return conta;
            }
        }
        return null; // caso não encontre
    }

    public Pedido(ContaClient contaClient, ContaTransportadora contaTransportadora, LocalDateTime data, Character formaDPagamento, Integer IDPedido, List<ItensPedido> itensPedidoList, Status status) {
        this.contaClient = contaClient;
        this.contaTransportadora = contaTransportadora;
        this.data = data;
        this.formaDPagamento = formaDPagamento;
        this.IDPedido = IDPedido;
        this.itensPedidoList = itensPedidoList;
        this.status = status;
    }

    public Character getFormaDPagamento() {
        return formaDPagamento;
    }

    public void setFormaDPagamento(Character formaDPagamento) {
        this.formaDPagamento = formaDPagamento;
    }

    public ContaClient getContaClient() {
        return contaClient;
    }

    public void setContaClient(ContaClient contaClient) {
        this.contaClient = contaClient;
    }

    public ContaTransportadora getContaTransportadora() {
        return contaTransportadora;
    }

    public void setContaTransportadora(ContaTransportadora contaTransportadora) {
        this.contaTransportadora = contaTransportadora;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(Integer IDPedido) {
        this.IDPedido = IDPedido;
    }

    public List<ItensPedido> getItensPedidoList() {
        return itensPedidoList;
    }

    public void setItensPedidoList(List<ItensPedido> itensPedidoList) {
        this.itensPedidoList = itensPedidoList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    public void addItem(ItensPedido item) {
        itensPedidoList.add(item);
    }

    public void removeItem(ItensPedido item) {
        itensPedidoList.remove(item);
    }
    public Double valorTotal(){
        total = 0.0;
        for (ItensPedido itensPedido : itensPedidoList){
            total += itensPedido.totalPedido();
        }
        return 0.0;
    }
    public Double precoFinal(){
        ServiçoPagamento ServicoPagamento;
        valorTotal();
        if (Character.toLowerCase(formaDPagamento) == 'c'){
            ServicoPagamento = new ServiçoPagamentoCrédito();
            return ServicoPagamento.Pagamento(contaClient.getTier(), total);
        }
        if (Character.toLowerCase(formaDPagamento) == 'c'){
            ServicoPagamento = new ServiçoPagamentoPix();
            return ServicoPagamento.Pagamento(contaClient.getTier(), total);
        }
        return 0.00;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "data=" + data +
                ", IDPedido=" + IDPedido +
                ", status=" + status +
                ", total=" + precoFinal() +
                ", itensPedidoList=" + itensPedidoList +
                '}';
    }
}
