/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.controller;

/**
 *
 * @author antoniositoe
 */
public class Operacao {

    private double primeiroNumero;
    private double segundoNumero;
    private double resultado;
    private String operacao;

    public double getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
