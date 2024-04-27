/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public abstract class CartaoSIM implements Serializable {

    private String proprietario;
    private String numero;
    private double saldo;

    public CartaoSIM(String prop, String numero) {
        this.setProprietario(prop);
        this.setNumero(numero);
        this.setSaldo(20);
    }

    public boolean transferir(CartaoSIM card, double valor) {
        if (this.getSaldo() >= valor && card != null && card != this) {
            this.setSaldo(valor);
            card.recarregar(valor, 0);
            return true;
        }
        return false;
    }


    public abstract boolean recarregar(double valor, double megas);

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\n ============================== \n"
                + "Proprietario: " + this.getProprietario() + "\n "
                + "Número: " + this.getNumero() + "\n"
                + "Saldo: " + this.getSaldo();
    }

}
