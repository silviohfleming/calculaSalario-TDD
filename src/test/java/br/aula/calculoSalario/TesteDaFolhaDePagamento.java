package br.aula.calculoSalario;

import br.aula.calculoSalario.modelo.Salario;
import br.aula.calculoSalario.servico.FolhaDePagamento;

public class TesteDaFolhaDePagamento {

    public static void main(String[] args) {

        // Criar Salario
        Salario salario = new CriarSalario().paraValorSalarioPorHora(250.0).paraQuantidadeDeHorasTrabalhadas(5).paraNumeroDeDependentes(2).getSalario();

        // Executando testes
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        System.out.println("====================");
        // R$ 1.350,00
        System.out.print("Salário Bruto: R$");
        System.out.println(folhaDePagamento.calculaSalarioBruto(salario));
        // R$ 122,00
        System.out.print("Desconto INSS: R$");
        System.out.println(folhaDePagamento.descontaINSS(salario));
        // R$ 95,00
        System.out.print("Desconto IR: R$");
        System.out.println(folhaDePagamento.descontaIR(salario));
        // R$ 1.133,00
        System.out.print("Salário Líquido: R$");
        System.out.println(folhaDePagamento.calculaSalarioLiquido(salario));
        System.out.println("====================");
    }

}
