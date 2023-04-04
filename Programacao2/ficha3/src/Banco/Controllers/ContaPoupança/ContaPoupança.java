package Banco.Controllers.ContaPoupança;

import Banco.Models.ContaBancaria.ContaBancaria;
import Banco.Models.Imprimivel.Imprimivel;

public class ContaPoupança extends ContaBancaria implements Imprimivel {
  public double limite = 10_000;

  @Override
  public double Sacar(double valor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Sacar'");
  }

  @Override
  public double Depositar(double valor) {
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
