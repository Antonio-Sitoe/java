package Banco.View.Executavel;

import Banco.Controllers.ContaCorrente.ContaCorrente;
import Banco.Controllers.ContaPoupanca.ContaPoupanca;
import Banco.Controllers.Relatorio.Relatorio;

public class Executavel {
    public static void main(String[] args) {
        ContaCorrente bim = new ContaCorrente();
        ContaPoupanca Bci = new ContaPoupanca();
        Relatorio relatorio = new Relatorio();

        bim.setNumeroDaConta(070420);
        bim.Depositar(3000);
        bim.Sacar(1500);
        relatorio.gerarRelatorio(bim);

        Bci.setNumeroDaConta(070420);
        Bci.Depositar(3000);
        Bci.Sacar(4000);
        relatorio.gerarRelatorio(Bci);


    }
}
