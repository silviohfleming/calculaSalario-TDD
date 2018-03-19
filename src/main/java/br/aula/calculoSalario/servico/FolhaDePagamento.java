package br.aula.calculoSalario.servico;

import br.aula.calculoSalario.modelo.Salario;

public class FolhaDePagamento {


    public double calculaSalarioBruto(Salario salario) {

        return Math.round(salario.getQuantidadeDeHorasTrabalhadas() * salario.getValorSalarioPorHora() + (50 * salario.getNumeroDeDependentes()));

    }

    public double descontaINSS(Salario salario) {

        double salarioBruto = calculaSalarioBruto(salario);

        return salarioBruto <= 1000.0 ? Math.round(salarioBruto * 0.085) : Math.round(salarioBruto * 0.09);

    }

    public double descontaIR(Salario salario) {

        double salarioBruto = calculaSalarioBruto(salario);
        double IR = 0.0;

        if (salarioBruto > 500.0 && salarioBruto <= 1000.0) {
            IR = salarioBruto * 0.05;
        }

        if (salarioBruto > 1000.0) {
            IR = salarioBruto * 0.07;
        }

        return Math.round(IR);

    }

    public double calculaSalarioLiquido(Salario salario) {

        return Math.round(calculaSalarioBruto(salario) - descontaINSS(salario) - descontaIR(salario));

    }


}
