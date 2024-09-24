package exercicio_3;

public class Gerente extends Funcionario{

    private final static double BONUS = 0.2;
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return this.salario * BONUS;
    }

    @Override
    public void trabalhar(String cargo) {
        super.trabalhar(cargo);
        System.out.println(" - Gerenciamento de equipes;");
        System.out.println(" - Distribuição de atividades;");
        System.out.println(" - Revisão de equipamentos.");
    }
}
