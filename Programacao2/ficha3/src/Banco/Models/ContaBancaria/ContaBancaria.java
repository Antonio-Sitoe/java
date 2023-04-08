package Banco.Models.ContaBancaria;

public abstract class ContaBancaria {
  private int numeroDaConta;
  private double saldo;
  private double historico;

  public abstract void Sacar(double valor);

  public abstract void Depositar(double valor);

  public  void transferir(double valor, ContaBancaria outraConta){
    if (valor > 0 && valor <= this.getSaldo()) {
      this.Sacar(valor);
      outraConta.Depositar(valor);
      System.out.println("Transferência de " + valor + "MT realizada com sucesso para a conta de " + outraConta.getNumeroDaConta() + ".");
    } else {
      System.out.println("Saldo insuficiente para realizar a transferência.");
    }
  }



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

