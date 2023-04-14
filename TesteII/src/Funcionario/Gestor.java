/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author antoniositoe
 */
public class Gestor extends Funcionario{
    double bonus_anual = 0.10;// 10 porcentos anuais do salario base
    double bonus_fixos = 20_000;

    @Override
    public double calcularSalario() {
        var salario = super.getSalario_base();
        var bonusAnuaisDiscontados = salario * this.bonus_anual;
        var salarioDoGestor = salario + bonusAnuaisDiscontados + this.bonus_fixos;
        
        return salarioDoGestor;
    }
    
    
}
