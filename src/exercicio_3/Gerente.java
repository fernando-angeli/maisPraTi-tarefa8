package exercicio_3;

public class Gerente extends Funcionario{

    private final static double BONUS = 0.2;
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return this.salario * BONUS;
    }

}
