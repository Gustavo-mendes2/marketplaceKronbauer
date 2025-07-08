package entidades;

import entidades.enumeradas.Status;
import serviços.ServiçoPagamento;
import serviços.ServiçoPagamentoCrédito;
import serviços.ServiçoPagamentoDebito;
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
    private Integer parcelas;
    private ContaVendedor contaVendedor;
    List<ItensPedido> itensPedidoList = new ArrayList<>();
    public static Conta buscarContaPorId(ArrayList<Conta> lista, int id) {
        for (Conta conta : lista) {
            if (conta.getId() == id) {
                return conta;
            }
        }
        return null; // caso não encontre
    }

    public Pedido(ContaClient contaClient, ContaTransportadora contaTransportadora, ContaVendedor contaVendedor, LocalDateTime data, Character formaDPagamento, Integer IDPedido, List<ItensPedido> itensPedidoList, Integer parcelas, Status status) {
        this.contaClient = contaClient;
        this.contaTransportadora = contaTransportadora;
        this.contaVendedor = contaVendedor;
        this.data = data;
        this.formaDPagamento = formaDPagamento;
        this.IDPedido = IDPedido;
        this.itensPedidoList = itensPedidoList;
        this.parcelas = parcelas;
        this.status = status;
    }

    public ContaVendedor getContaVendedor() {
        return contaVendedor;
    }

    public void setContaVendedor(ContaVendedor contaVendedor) {
        this.contaVendedor = contaVendedor;
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
            double valorSemJuros = ServicoPagamento.Pagamento(contaClient.getTier(), total);
            return ((ServiçoPagamentoCrédito) ServicoPagamento).Parcelamento(valorSemJuros, this.parcelas);
        }
        if (Character.toLowerCase(formaDPagamento) == 'p'){
            ServicoPagamento = new ServiçoPagamentoPix();
            return ServicoPagamento.Pagamento(contaClient.getTier(), total);
        }
        if(Character.toLowerCase(formaDPagamento) == 'd'){
            ServicoPagamento = new ServiçoPagamentoDebito();
            return ServicoPagamento.Pagamento(contaClient.getTier(), total);

        }
        return 0.00;
    }
    StringBuilder sb = new StringBuilder();
    @Override
    public String toString() {
        String linha = "+---------------------------+----------------------------------+\n";
        String tipoPagamento;

        switch (Character.toLowerCase(formaDPagamento)) {
            case 'c':
                tipoPagamento = "Crédito";
                break;
            case 'p':
                tipoPagamento = "Pix";
                break;
            case 'd':
                tipoPagamento = "Débito";
                break;
            default:
                tipoPagamento = "Desconhecido";
        }

        String totalFormatado;
        if (Character.toLowerCase(formaDPagamento) == 'c') {
            totalFormatado = parcelas + " x R$ " + String.format("%.2f", precoFinal());
        } else {
            totalFormatado = "R$ " + String.format("%.2f", precoFinal());
        }
        sb.append(linha);
        sb.append(String.format("| %-25s | %-32s |\n", "ID do Pedido", IDPedido));
        sb.append(String.format("| %-25s | %-32s |\n", "Data", data));
        sb.append(String.format("| %-25s | %-32s |\n", "Status", status));
        sb.append(String.format("| %-25s | %-32s |\n", "Forma de Pagamento", tipoPagamento));
        sb.append(String.format("| %-25s | %-32s |\n", "Total", totalFormatado));
        sb.append(linha);
        sb.append(String.format("| %-61s |\n", "Itens do Pedido"));
        sb.append(linha);

        for (ItensPedido item : itensPedidoList) {
            sb.append(String.format("| %-61s |\n", item));
        }

        sb.append(linha);
        return sb.toString();
    }
}
