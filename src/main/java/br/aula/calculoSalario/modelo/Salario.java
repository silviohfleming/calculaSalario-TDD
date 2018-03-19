package br.aula.calculoSalario.modelo;

public class Salario {

    // Quantidade de Horas Trabalhadas
    private int quantidadeDeHorasTrabalhadas;
    // Valor Salário por Hora
    private double valorSalarioPorHora;
    // Número de Dependentes
    private int numeroDeDependentes;

    // Construtor
    public Salario() { }

    // GETTERS AND SETTERS

    public double getQuantidadeDeHorasTrabalhadas() {
        return quantidadeDeHorasTrabalhadas;
    }

    public void setQuantidadeDeHorasTrabalhadas(int quantidadeDeHorasTrabalhadas) {
        this.quantidadeDeHorasTrabalhadas = quantidadeDeHorasTrabalhadas;
    }

    public double getValorSalarioPorHora() {
        return valorSalarioPorHora;
    }

    public void setValorSalarioPorHora(double valorSalarioPorHora) {
        this.valorSalarioPorHora = valorSalarioPorHora;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }

}
