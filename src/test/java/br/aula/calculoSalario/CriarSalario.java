package br.aula.calculoSalario;

import br.aula.calculoSalario.modelo.Salario;

public class CriarSalario {

    private Salario salario;

    public CriarSalario() {
        salario = new Salario();
    }

    public CriarSalario paraQuantidadeDeHorasTrabalhadas(int QuantidadeHorasTrabalhadas)
    {
        salario.setQuantidadeDeHorasTrabalhadas(QuantidadeHorasTrabalhadas);
        return this;
    }

    public CriarSalario paraValorSalarioPorHora(double valorSalarioHora)
    {
        salario.setValorSalarioPorHora(valorSalarioHora);
        return this;
    }

    public CriarSalario paraNumeroDeDependentes(int numDependentes)
    {
        salario.setNumeroDeDependentes(numDependentes);
        return this;
    }

    public Salario getSalario() {
        return salario;
    }


}
