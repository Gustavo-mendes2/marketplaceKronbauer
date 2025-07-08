package serviços;

import entidades.Conta;
import entidades.enumeradas.Tipo;

public class ServiçoPagamentoPix implements ServiçoPagamento{

  @Override
  public double Pagamento(Tipo contaTipo, Double PagamentoTotal) {
      if (contaTipo == Tipo.BRONZE){
          return PagamentoTotal * 1.10;
      }
      if(contaTipo == Tipo.PRATA){
          return PagamentoTotal;
      }
      if(contaTipo == Tipo.OURO){
          return PagamentoTotal * 0.90;
      }
      if(contaTipo == Tipo.PLATINA){
          return PagamentoTotal * 0.80;
      }
      if (contaTipo == Tipo.DIAMANTE){
          return PagamentoTotal * 0.70;
      }
      return 0;
  }
  }

