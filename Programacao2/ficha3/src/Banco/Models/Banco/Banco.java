package Banco.Models.Banco;


import Banco.Controllers.ContaCorrente.ContaCorrente;
import Banco.Controllers.ContaPoupanca.ContaPoupanca;
import Banco.Controllers.Relatorio.Relatorio;
import Banco.Models.ContaBancaria.ContaBancaria;
import Banco.Models.Imprimivel.Imprimivel;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco implements Imprimivel {
    ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

    public  void init(){
        Scanner nc = new Scanner(System.in);
        int escolha=0;
        int numeroDeCanto;
        System.out.println("Bem vindo ao Banco LONGA_VIDA_AOS_DEVS");
        System.out.println("Qual operacao deseja fazer Hoje ?");

        while (escolha != 5) {
            System.out.println("__________________________");
            System.out.println("1. Criar conta");
            System.out.println("2. Selecionar conta");
            System.out.println("3. Remover conta");
            System.out.println("4. Gerar relatório");
            System.out.println("5. Finalizar");
            escolha = nc.nextInt();


            switch (escolha) {
                case 1:
                    this.criarConta();
                    break;

                case 2:
                    this.selecionarConta();
                    break;

                case 3:
                    System.out.println("Digite o numero da conta");
                    numeroDeCanto= nc.nextInt();

                    var conta = this.procurarConta(numeroDeCanto);
                    if(conta != null){
                        this.remover(conta);
                    }
                    break;

                case 4:
                    this.mostrarDados();
                    break;
                case 5:
                    System.out.println("Finalizou a operacao");
                    break;

                default:
                    System.out.println("Sem nenhuma escolha");
                    break;
            }
        }
    }
    public void selecionarConta(){
        Scanner nc = new Scanner(System.in);
        int numero;



        System.out.println("Digite o numero da conta");
        numero= nc.nextInt();

        var conta = this.procurarConta(numero);

        if(conta != null){
            int escolha;
            double valor;
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Gerar relatório");
            System.out.println("5. Retornar ao menu anterior");
            escolha = nc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor de deposito");
                    valor = nc.nextDouble();
                    conta.Depositar(valor);
                    break;

                case 2:
                    System.out.println("Digite o valor para levantar");
                    valor = nc.nextDouble();
                    conta.Sacar(valor);
                    break;

                case 3:
                    System.out.println("Digite o valor a transferir ");
                    valor = nc.nextDouble();
                    System.out.println("Digite o numero da conta transferir ");
                    numero = nc.nextInt();
                    var outraConta = this.procurarConta(numero);

                    if(outraConta != null){
                        conta.transferir(valor, outraConta);
                    }else {
                        System.out.println("Conta inexistente");
                    }
                    break;

                case 4:
                    Relatorio relatorio = new Relatorio();
                    relatorio.gerarRelatorio((Imprimivel) conta);
                    break;
                case 5:
                    System.out.println("Finalizou a operacao");
                    break;

                default:
                    System.out.println("Sem nenhuma escolha");
                    break;
            }



        }
        else {
            System.out.println(" conta inexistente");
        }
    }

   public  void criarConta(){
        int tipoDeConta;
        int numeroDeConta;
        double saldo;
       Scanner nc = new Scanner(System.in);
       ContaCorrente corrente = new ContaCorrente();
       ContaPoupanca poupanca = new ContaPoupanca();

       System.out.println("Escolha o tipo de conta");
       System.out.println("__________________________");
       System.out.println("1. Conta poupanca");
       System.out.println("2. Conta Corrente");
       tipoDeConta = nc.nextInt();

       System.out.print("Digite o numero da conta  ");
       numeroDeConta = nc.nextInt();

       System.out.print("Digite o Saldo inicial ");
       saldo = nc.nextDouble();

       corrente.setNumeroDaConta(numeroDeConta);
       corrente.setSaldo(saldo);

       poupanca.setNumeroDaConta(numeroDeConta);
       poupanca.setSaldo(saldo);

       switch (tipoDeConta){
           case 1:
               this.inserirConta(poupanca);
               break;

           case 2:
               this.inserirConta(corrente);
               break;

           default:
               System.out.println("Sem nenhuma escolha");
               break;
       }
   }

   public void inserirConta(ContaBancaria conta){
       contas.add(conta);
       System.out.println("Adicionado a conta "+conta.getNumeroDaConta());
   }
    public  void remover(ContaBancaria contaAremover){
       var indice = 0;
        for (int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getNumeroDaConta()==contaAremover.getNumeroDaConta()){
                indice=i;
            }
        }
        if(indice == 0) {
            System.out.println("Conta nao encontrada tente mais tarde");
        }else {
            contas.remove(indice);
            System.out.println("A conta " + contaAremover.getNumeroDaConta() + " foi removida com sucesso");
        }
    }
    public ContaBancaria procurarConta(int numeroDaConta){
       for (int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getNumeroDaConta() == numeroDaConta){
               return contas.get(i);
            }
        }
       return  null;
    }


    @Override
    public void mostrarDados() {
        Relatorio relatorio = new Relatorio();
        for (ContaBancaria conta: contas) {
            relatorio.gerarRelatorio((Imprimivel) conta);
        }
    }
}
