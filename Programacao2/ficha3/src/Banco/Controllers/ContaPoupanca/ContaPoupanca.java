package Banco.Controllers.ContaPoupanca;
import Banco.Models.ContaBancaria.ContaBancaria;
import Banco.Models.Imprimivel.Imprimivel;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

        public double limite = -10_000;

        @Override
        public void Sacar(double valor) {
            // TODO Auto-generated method stub
            var saldo = super.getSaldo();
            var saldoAtual = saldo - valor;


            if(saldoAtual >= limite){
                super.setSaldo(saldoAtual);
                System.out.println("Acaba de sacar "+ valor);
                System.out.println("O teu Saldo Atual e de "+ saldoAtual);
            }else {
                System.out.println("Nao tem saldo, nem credito suficiente tente um valor menor");
            }

        }

        @Override
        public void Depositar(double valor) {
            var valorAtual = super.getSaldo() +  valor;
            super.setSaldo(valorAtual);


        }

        @Override
        public void mostrarDados() {
            // TODO Auto-generated method stub
            System.out.println("NUMERO DE CONTA" + super.getNumeroDaConta());
            System.out.println("SALDO " + super.getSaldo());
            System.out.println("HISTORICO " + super.getHistorico());
            System.out.println("LIMITE " + this.limite);

        }

}
