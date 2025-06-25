package serviços;

import entidades.Conta;
import entidades.enumeradas.Tipo;

public class ServiçoPagamentoPaypal implements ServiçoPagamento {
    @Override
    public double Pagamento(Conta conta) {
        if (conta.getTier() == Tipo.BRONZE){

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
