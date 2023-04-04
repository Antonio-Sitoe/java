package Banco.Controllers.ContaCorrente;

import Banco.Models.ContaBancaria.ContaBancaria;
import Banco.Models.Imprimivel.Imprimivel;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
  public double taxaDeOperacao = 0.9;

  public double taxaPelaTransacao(double valor) {
    var valorAserRetirado = valor * this.taxaDeOperacao;
    return valor - valorAserRetirado;
  }

  @Override
  public double Sacar(double valor) {
    var valorCorrente = this.taxaPelaTransacao(valor);
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Sacar'");
  }

  @Override
  public double Depositar(double valor) {
    var valorCorrente = this.taxaPelaTransacao(valor);
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Depositar'");
  }

  @Override
  public void mostrarDados() {
    // TODO Auto-generated method stub
    System.out.println("NUMERO DE CONTA" + this.numeroDaConta);
    System.out.println("SALDO " + this.saldo);
    System.out.println("HISTORICO " + this.historico);
    throw new UnsupportedOperationException("Unimplemented method 'mostrarDados'");
  }

}
