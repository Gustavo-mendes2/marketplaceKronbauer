package serviços;

import entidades.enumeradas.Tipo;

// Interface das formas de pagamento.

public interface ServiçoPagamento {
    public double Pagamento(Tipo contaTipo, Double PagamentoTotal);
}
