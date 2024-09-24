package exercicio_3;

public class Desenvolvedor extends Funcionario {

    private final static double BONUS = 0.1;

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return this.salario * BONUS;
    }
}
