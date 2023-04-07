package Banco.Models.ContaBancaria;

public abstract class ContaBancaria {
  private int numeroDaConta;
  private double saldo;
  private double historico;

  public abstract double Sacar(double valor);

  public abstract double Depositar(double valor);


  public void setNumeroDaConta(int numeroDaConta){
    this.numeroDaConta  = numeroDaConta;
  }

  public double getHistorico() {
    return historico;
  }

  public void setHistorico(double historico) {
    this.historico = historico;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}

