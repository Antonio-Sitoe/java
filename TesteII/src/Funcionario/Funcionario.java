package Funcionario;

public abstract class Funcionario {
    private String nome;
    private double salario_base = 10_000 * 12; // 120_000 salario anul base da empresa 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public abstract double calcularSalario();
}
