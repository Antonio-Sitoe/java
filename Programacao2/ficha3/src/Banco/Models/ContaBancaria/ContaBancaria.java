package Banco.Models.ContaBancaria;

public abstract class ContaBancaria {
  private int numeroDaConta;
  private double saldo;
  private double historico;

  public abstract double Sacar(double valor);

  public abstract double Depositar(double valor);

}
