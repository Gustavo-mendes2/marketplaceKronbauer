package entidades;

import entidades.enumeradas.Tipo;

public class ContaTransportadora extends Conta {
    private Integer NumPendentes;

    public ContaTransportadora(Integer id, String nome, String email, String senha, Tipo tier, Integer numPendentes) {
        super(id, nome, email, senha, tier);
        NumPendentes = numPendentes;
    }

    public Integer getNumPendentes() {
        return NumPendentes;
    }

    public void setNumPendentes(Integer numPendentes) {
        NumPendentes = numPendentes;
    }
}
