package entidades;

import entidades.enumeradas.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer IDPedido;
    private LocalDateTime data;
    private Status status;
    private Double total = 0.00;
    List<ItensPedido> itensPedidoList = new ArrayList<>();

    public Pedido(LocalDateTime data, Integer IDPedido, List<ItensPedido> itensPedidoList, Status status) {
        this.data = data;
        this.IDPedido = IDPedido;
        this.itensPedidoList = itensPedidoList;
        this.status = status;
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
        for (ItensPedido itensPedido : itensPedidoList){
            total += itensPedido.totalPedido();
        }
        return total;
        }

    @Override
    public String toString() {
        return "Pedido{" +
                "data=" + data +
                ", IDPedido=" + IDPedido +
                ", status=" + status +
                ", total=" + valorTotal() +
                ", itensPedidoList=" + itensPedidoList +
                '}';
    }
}
