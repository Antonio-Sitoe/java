package Funcionario;

public class Operador extends Funcionario {

    double bonus_anual = 0.05;

    @Override
    public double calcularSalario() {
        var salario = super.getSalario_base();
        var bonusAdquiridos = salario * this.bonus_anual;
        var salario_do_operador = salario + bonusAdquiridos;
        return salario_do_operador;
    }
    
    public double calcularSalario(double bonusAdicionais) {
        var salario = super.getSalario_base();
        var salario_do_operador = salario + bonusAdicionais;
        return salario_do_operador;
    }
}
