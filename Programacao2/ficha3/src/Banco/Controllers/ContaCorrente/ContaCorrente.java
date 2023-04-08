package Banco.Controllers.ContaCorrente;

import Banco.Models.ContaBancaria.ContaBancaria;
import Banco.Models.Imprimivel.Imprimivel;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
  public double taxaDeOperacao = 10;

  public boolean taxaPelaTransacao(double valor) {
    var valorAserRetirado = valor + this.taxaDeOperacao;
    var caluloDevalor = valorAserRetirado > super.getSaldo();
    if(caluloDevalor) return false;
    else return true;
  }

  @Override
  public void Sacar(double valor) {
    try {
      var possoSacar = this.taxaPelaTransacao(valor);
      if(possoSacar) {
        var saque = super.getSaldo() - valor - this.taxaDeOperacao;
        super.setSaldo(saque);
        System.out.println("Levantamento com sucesso no valor de "+ saque);
      }else {
        System.out.println("Levantamento sem sucesso O saldo continua "+ super.getSaldo());
      }
    }catch (Exception e){
      throw new UnsupportedOperationException("Unimplemented method 'Sacar'");
    }
  }

  @Override
  public void Depositar(double valor) {
    var verificaSePossoDepositar = valor - this.taxaDeOperacao;

    if(verificaSePossoDepositar > 0){
      var valorDeDeposito =super.getSaldo()+verificaSePossoDepositar;
      super.setSaldo(valorDeDeposito);
      System.out.println("Deposito com sucesso o seu saldo e "+ valorDeDeposito);
    }else {
      System.out.println("Falha ao depositar o saldo continua "+ super.getSaldo());
    }
  }

  @Override
  public void mostrarDados() {

    System.out.println("NUMERO DE CONTA" + super.getNumeroDaConta());
    System.out.println("SALDO " + super.getSaldo());
    System.out.println("HISTORICO " + super.getHistorico());
    System.out.println("TAXA DE OPERACAO " + this.taxaDeOperacao);

  }

}
