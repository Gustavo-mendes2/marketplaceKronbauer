package serviços;

import entidades.enumeradas.Tipo;

public interface ServiçoPagamento {
    public double Pagamento(Tipo contaTipo, Double PagamentoTotal);
}
