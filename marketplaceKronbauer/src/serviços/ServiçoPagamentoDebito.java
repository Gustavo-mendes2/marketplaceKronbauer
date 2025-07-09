package serviços;


import entidades.Conta;
import entidades.enumeradas.Tipo;

// Classe que ajusta o preço levando em consideração apenas o ranking.

public class ServiçoPagamentoDebito implements ServiçoPagamento{

    // Função que retorna o valor após o ajuste

    @Override
    public double Pagamento(Tipo contaTipo, Double PagamentoTotal) {
        if (contaTipo == Tipo.BRONZE) {
            return PagamentoTotal * 1.15;
        }
        if (contaTipo == Tipo.PRATA) {
            return PagamentoTotal * 1.10;
        }
        if (contaTipo == Tipo.OURO) {
            return PagamentoTotal * 1.05;
        }
        if (contaTipo == Tipo.PLATINA) {
            return PagamentoTotal;
        }
        if (contaTipo == Tipo.DIAMANTE) {
            return PagamentoTotal * 0.95;
        }
        return 0;
    }
    }

