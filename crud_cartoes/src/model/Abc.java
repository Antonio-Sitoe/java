/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class Abc extends CartaoSIM implements Serializable {

    private double megas;

    public Abc(String prop, String numero) {
        super(prop, numero);
        this.setMegas(0);
    }

    @Override
    public boolean recarregar(double valor, double megas) {
        if (valor > 0 && megas > 0) {
            this.setMegas(this.getMegas() + megas);
            this.setSaldo(this.getSaldo() + valor);
            return true;
        }
        return false;
    }

  

    public double getMegas() {
        return megas;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Megas: " + this.getMegas()+"\n"
                + "Operadora: Abc ";
    }

}
