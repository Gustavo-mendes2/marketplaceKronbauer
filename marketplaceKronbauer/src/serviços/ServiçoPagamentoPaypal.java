package serviços;

import entidades.Conta;
import entidades.enumeradas.Tipo;

public class ServiçoPagamentoPaypal implements ServiçoPagamento {
    @Override
    public double Pagamento(Conta conta, Double PagamentoTotal) {
        if (conta.getTier() == Tipo.BRONZE){
            return PagamentoTotal * 1.20;
        }
        if(conta.getTier() == Tipo.PRATA){

        }
        if(conta.getTier() == Tipo.OURO){

        }
        if(conta.getTier() == Tipo.PLATINA){

        }
        if (conta.getTier() == Tipo.DIAMANTE){

        }
        return 0;
    }
    // por tier
}
