package serviços;

import entidades.enumeradas.Tipo;

public class ServiçoPagamentoCrédito implements ServiçoPagamento {
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

    public double Parcelamento( Double PagamentoTotal, Integer parcelas){

        double valorComJuros=0;

        valorComJuros = (PagamentoTotal/parcelas) + (PagamentoTotal * 0.10);

        return valorComJuros;
}
}
