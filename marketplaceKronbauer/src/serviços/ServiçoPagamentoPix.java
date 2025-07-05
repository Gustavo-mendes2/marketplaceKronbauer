package serviços;

import entidades.Conta;
import entidades.enumeradas.Tipo;

public class ServiçoPagamentoPix implements ServiçoPagamento{

  @Override
  public double Pagamento(Conta conta, Double PagamentoTotal) {
      if (conta.getTier() == Tipo.BRONZE){
          return PagamentoTotal * 1.20;
      }
      if(conta.getTier() == Tipo.PRATA){
          return PagamentoTotal * 1.10;
      }
      if(conta.getTier() == Tipo.OURO){
          return PagamentoTotal * 1;
      }
      if(conta.getTier() == Tipo.PLATINA){
          return PagamentoTotal * 0.90;
      }
      if (conta.getTier() == Tipo.DIAMANTE){
          return PagamentoTotal * 0.80;
      }
      return 0;
  }
}