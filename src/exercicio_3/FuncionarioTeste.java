package exercicio_3;

import java.text.NumberFormat;
import java.util.Locale;

public class FuncionarioTeste {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Gerente gerente = new Gerente("Antonio Carlos", 8000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Tiago dos Santos", 7000.00);
        System.out.println("Dados do Gerente: " + gerente);
        System.out.println("Bonus: " + formatter.format(gerente.calcularBonus()));
        System.out.println("Dados do Desenvolvedor: " + desenvolvedor);
        System.out.println("Bonus: " + formatter.format(desenvolvedor.calcularBonus()));
    }
}
