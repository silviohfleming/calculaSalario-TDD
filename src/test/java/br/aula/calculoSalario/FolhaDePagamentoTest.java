package br.aula.calculoSalario;

import br.aula.calculoSalario.modelo.Salario;
import br.aula.calculoSalario.servico.FolhaDePagamento;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FolhaDePagamentoTest {

    private Salario salario;
    private FolhaDePagamento folhaDePagamento;

    @Before
    public void init()
    {
        salario = new CriarSalario().paraValorSalarioPorHora(250.0).paraQuantidadeDeHorasTrabalhadas(5).paraNumeroDeDependentes(2).getSalario();
        folhaDePagamento = new FolhaDePagamento();
    }

    @Test
    public void deveCalcularSalarioBruto() {

        double valor = folhaDePagamento.calculaSalarioBruto(salario);
        assertEquals(1350, valor, 00001);

    }

    @Test
    public void deveCalcularDescontoINSS() {

        double valor = folhaDePagamento.descontaINSS(salario);
        assertEquals(122, valor, 00001);

    }

    @Test
    public void deveCalcularDescontoIR() {

        double valor = folhaDePagamento.descontaIR(salario);
        assertEquals(95, valor, 00001);

    }

    @Test
    public void deveCalcularSalarioLiquido() {

        double valor = folhaDePagamento.calculaSalarioLiquido(salario);
        assertEquals(1133, valor, 00001);

    }

    @Test
    public void deveReceberVariasFolhasDePagamentos() {
        Salario salario2 = new CriarSalario().paraValorSalarioPorHora(150.0).paraQuantidadeDeHorasTrabalhadas(10).paraNumeroDeDependentes(1).getSalario();
        System.out.println("Salario 2 Num Dependentes: "+ salario2.getNumeroDeDependentes());
        System.out.println("Salario 2 Qtde Horas Trabalhadas: "+ salario2.getQuantidadeDeHorasTrabalhadas());
        System.out.println("Salario 2 Valor Hora Trabalhada: "+ salario2.getValorSalarioPorHora());

        Salario salario3 = new CriarSalario().paraValorSalarioPorHora(430.0).paraQuantidadeDeHorasTrabalhadas(6).paraNumeroDeDependentes(4).getSalario();
        System.out.println("Salario 3 Num Dependentes: "+ salario3.getNumeroDeDependentes());
        System.out.println("Salario 3 Qtde Horas Trabalhadas: "+ salario3.getQuantidadeDeHorasTrabalhadas());
        System.out.println("Salario 3 Valor Hora Trabalhada: "+ salario3.getValorSalarioPorHora());

        Salario salario4 = new CriarSalario().paraValorSalarioPorHora(130.0).paraQuantidadeDeHorasTrabalhadas(22).paraNumeroDeDependentes(0).getSalario();
        System.out.println("Salario 4 Num Dependentes: "+ salario4.getNumeroDeDependentes());
        System.out.println("Salario 4 Qtde Horas Trabalhadas: "+ salario4.getQuantidadeDeHorasTrabalhadas());
        System.out.println("Salario 4 Valor Hora Trabalhada: "+ salario4.getValorSalarioPorHora());
    }

}
