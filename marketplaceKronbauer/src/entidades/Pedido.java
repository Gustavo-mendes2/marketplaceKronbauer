package entidades;

import entidades.enumeradas.Status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer IDPedido;
    private Date data;
    private Status status;
    private Double total;
    List<ItensPedido> itensPedidoList = new ArrayList<>();

    public Pedido(Date data, Integer IDPedido, List<ItensPedido> itensPedidoList, Status status, Double total) {
        this.data = data;
        this.IDPedido = IDPedido;
        this.itensPedidoList = itensPedidoList;
        this.status = status;
        this.total = total;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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

}
