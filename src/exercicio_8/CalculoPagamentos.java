package exercicio_8;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CalculoPagamentos {
    public static void main(String[] args) {
        NumberFormat formatarReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        FuncionarioService service = new FuncionarioService();

        // Simulação para vários funcionarios
        Gerente func1_ger = new Gerente("Pedro", 4800.00);
        Desenvolvedor func2_dev = new Desenvolvedor("Marcio", 2420.00, 10.0);
        Estagiario func3_est = new Estagiario("Ana", 1800, 10.00, 7.50);

        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(func1_ger, func2_dev, func3_est));
        double total = 0;
        for(Funcionario f : funcionarios)
            total += f.calcularPagamento(30);
        System.out.println(" TOTAL DA FOLHA PARA " + 30 + " dias = " + formatarReal.format(total));

        // Simulação de promoções
        // Ana como estagiária
        System.out.println("\nAna antes de depois de promoção para DEV");
        func3_est.calcularPagamento(30);
        // Ana recebendo promoção para desevolvedora - aumento de 50% no salario e aumento no bonus
        Desenvolvedor func3_dev = service.promoverParaDesenvolvedor(func3_est); //promoção pela service de funcionarios
        func3_dev.calcularPagamento(30); //calculo de pagamento para demonstrar atualização
        updatedList(funcionarios, func3_est, func3_dev); //atualizao da folha de pagamento do mes

        //Exibição do novo calculo da folha atualizada.
        System.out.println("\n>> NOVO CALCULO APÓS PRIMEIRA PROMOÇÃO ANA <<");
        total = 0;
        for(Funcionario f : funcionarios)
            total += f.calcularPagamento(30);
        System.out.println(" TOTAL DA FOLHA PARA " + 30 + " dias = " + formatarReal.format(total));

        // Simulação de promoções
        // Ana como Gerente
        System.out.println("\nAna antes de depois de promoção para GERENTE");
        func3_dev.calcularPagamento(30);
        // Ana recebendo promoção para gerente - aumento de 50% no salario e aumento no bonus
        Gerente func3_ger = service.promoverParaGerente(func3_dev); //promoção pela service de funcionarios
        func3_ger.calcularPagamento(30); //calculo de pagamento para demonstrar atualização
        updatedList(funcionarios, func3_dev, func3_ger); //atualizao da folha de pagamento do mes

        //Exibição do novo calculo da folha atualizada.
        System.out.println("\n>> NOVO CALCULO APÓS PRIMEIRA PROMOÇÃO ANA <<");
        total = 0;
        for(Funcionario f : funcionarios)
            total += f.calcularPagamento(30);
        System.out.println(" TOTAL DA FOLHA PARA " + 30 + " dias = " + formatarReal.format(total));

    }

    private static void updatedList(List<Funcionario> funcionarios, Funcionario antigo, Funcionario atualizado){
        List<Funcionario> atualizados = new ArrayList<>();
        for (Funcionario f : funcionarios){
            atualizados.add(f.equals(antigo) ? atualizado : f);
        }
        funcionarios.clear();
        funcionarios.addAll(atualizados);
    }
}
