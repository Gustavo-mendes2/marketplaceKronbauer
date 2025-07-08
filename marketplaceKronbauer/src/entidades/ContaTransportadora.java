package entidades;

import entidades.enumeradas.Tipo;

public class ContaTransportadora extends Conta {
    private Integer NumPendentes;

    public ContaTransportadora(Integer id, String nome, String email, String senha, Integer numPendentes) {
        super(id, nome, email, senha);
        NumPendentes = numPendentes;
    }

    public Integer getNumPendentes() {
        return NumPendentes;
    }

    public void setNumPendentes(Integer numPendentes) {
        NumPendentes = numPendentes;
    }
    @Override
    public String toString() {
        return "\nInformações da conta:" +
                "ID" + getId() +
                "Nome: " + getNome() +
                "\n" +
                "Email: " + getEmail() +
                "\n" +
                "Pedidos pedentes de entrega: " +  getNumPendentes();
    }
}
