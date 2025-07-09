package serviços;

import entidades.enumeradas.Tipo;

// Classe que retorna o valor do pedido após taxas ou descontos de ranking da conta e dos juros do cartão.

public class ServiçoPagamentoCrédito implements ServiçoPagamento {

    // Função que ajusta o valor de acordo com o ranking da conta.

    @Override
    public double Pagamento(Tipo contaTipo, Double PagamentoTotal) {
        if (contaTipo == Tipo.BRONZE) {
            return PagamentoTotal * 1.20;
        }
        if (contaTipo == Tipo.PRATA) {
            return PagamentoTotal * 1.10;
        }
        if (contaTipo == Tipo.OURO) {
            return PagamentoTotal * 1;
        }
        if (contaTipo == Tipo.PLATINA) {
            return PagamentoTotal * 0.90;
        }
        if (contaTipo == Tipo.DIAMANTE) {
            return PagamentoTotal * 0.80;
        }
        return 0;
    }

    // Função que modifica o preço de acordo com o juros simples do valor total.

    public double Parcelamento( Double PagamentoTotal, Integer parcelas){

        double valorComJuros=0;

        valorComJuros = (PagamentoTotal/parcelas) + (PagamentoTotal * 0.10);

        return valorComJuros;
}
}
