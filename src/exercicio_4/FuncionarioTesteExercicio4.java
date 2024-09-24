package exercicio_4;

import exercicio_3.Desenvolvedor;
import exercicio_3.Gerente;

public class FuncionarioTesteExercicio4 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João da Silva", 8000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria Nunes", 7800.00);
        gerente.trabalhar("Gerente");
        desenvolvedor.trabalhar("Desenvolvedora");

    }
}
