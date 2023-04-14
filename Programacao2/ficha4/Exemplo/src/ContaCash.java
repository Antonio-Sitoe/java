public class ContaCash {
    private int numeroConta;
    private String titular;
    private double saldo;

    public  ContaCash(int numeroConta, String titular, double saldo ){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTitular(){
        return this.titular;
    }
    public  void setTitular(String titular){
        this.titular = titular;
    }

    public  double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void tranferir(ContaCash contadestino){
        var saldo = this.getSaldo();
        contadestino.setSaldo(saldo);
        this.setSaldo(0);
    }

}
