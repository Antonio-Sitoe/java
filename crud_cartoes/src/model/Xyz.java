/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class Xyz extends CartaoSIM implements Serializable {

    private double txuna;

    public Xyz(String prop, String numero) {
        super(prop, numero);
        this.setTxuna(0);
    }

    public boolean txunar(double var) {
        if (this.getSaldo() <= 5 && this.getTxuna() == 0 && var >= 0) {
            this.setSaldo(var);
            this.setTxuna(this.getTxuna() + var);
            return true;
        }
        return false;
    }

    @Override
    public boolean recarregar(double valor, double megas) {
        if (valor > 0 && megas > 0) {
            this.setSaldo(this.getSaldo() + valor);
            return true;
        }
        return false;
    }

    /**
     * @return the txuna
     */
    public double getTxuna() {
        return txuna;
    }

    /**
     * @param txuna the txuna to set
     */
    public void setTxuna(double txuna) {
        this.txuna = txuna;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Txuna: " + this.getTxuna() + "\n"
                + "Operadora: Xyz";
    }
}
