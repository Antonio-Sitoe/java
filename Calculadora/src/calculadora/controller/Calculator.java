/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.controller;

import calculadora.model.CalculatorModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antoniositoe
 */
public class Calculator extends CalculatorModel {

    ArrayList<Operacao> operacoes = new ArrayList<>();

    public void mostrarLista() {
        this.mostrarArrayList(operacoes);
    }

    public void mostrarArrayList(ArrayList<Operacao> operacoes) {
        // Criando o modelo de tabela para exibir as operações
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Primeiro Número");
        model.addColumn("Segundo Número");
        model.addColumn("Resultado");
        model.addColumn("Operação");

        for (Operacao operacao : operacoes) {
            model.addRow(new Object[]{operacao.getPrimeiroNumero(), operacao.getSegundoNumero(), operacao.getResultado(), operacao.getOperacao()});
        }

        // Criando a tabela e adicionando o modelo
        JTable tabela = new JTable(model);

        // Criando o painel e adicionando a tabela com uma barra de rolagem
        JPanel painel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(tabela);
        painel.add(scrollPane, BorderLayout.CENTER);

        // Criando a janela e adicionando o painel
        JFrame janela = new JFrame("Operações");
//        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.add(painel);
        janela.pack();
        janela.setVisible(true);
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void removerUltimoCaractere(javax.swing.JTextField Input, String texto) {
        if (texto != null && texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 1);
        }

        Input.setText(texto);
    }

    public void calcula(javax.swing.JTextField Input, javax.swing.JLabel Message, String simbol, double primeiroValor, double segundoValor) {
        double resultado = 0;
        switch (simbol) {
            case "sub":
                resultado = this.subtrair(primeiroValor, segundoValor);
                break;
            case "mult":
                resultado = this.multiplicar(primeiroValor, segundoValor);
                break;
            case "div":
                if (segundoValor != 0) {
                    resultado = this.dividir(primeiroValor, segundoValor);
                } else {
                    Message.setText("Nao pode dividir por 0");
                }
                break;

            case "sum":
                resultado = this.somar(primeiroValor, segundoValor);
                break;

            case "exp":
                resultado = Math.pow(primeiroValor, segundoValor);
                break;
                
            case "rest":
                resultado = primeiroValor % segundoValor;
                break;
            default:
                throw new AssertionError();
        }
        Operacao operacao1 = new Operacao();

        operacao1.setPrimeiroNumero(primeiroValor);
        operacao1.setSegundoNumero(segundoValor);
        operacao1.setResultado(resultado);
        operacao1.setOperacao(simbol);

        operacoes.add(operacao1);

        String valoramostrar = String.format("%." + 1 + "f", resultado);

        Input.setText(valoramostrar);

    }

    public void difinirValor(javax.swing.JTextField Input, int valor) {
        var valoractualdoinput = Input.getText();
        var incrementa = valoractualdoinput + valor;
        Input.setText(incrementa);
    }

    public void reset(javax.swing.JTextField Input) {
        Input.setText("");
        operacoes.clear();
    }

    public void difinirPonto(javax.swing.JTextField Input, String valor) {
        var valoractualdoinput = Input.getText();
        var incrementa = valoractualdoinput + valor;
        Input.setText(incrementa);
    }

    @Override
    public double dividir(double primeiroNumero, double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }

    @Override
    public double multiplicar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    @Override
    public double somar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    @Override
    public double subtrair(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

}
