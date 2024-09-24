package exercicio_3;

public class Desenvolvedor extends Funcionario {

    private final static double BONUS = 0.1;

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return this.salario * BONUS;
    }

    @Override
    public void trabalhar(String cargo) {
        super.trabalhar(cargo);
        System.out.println(" - Desenvolvimento de softaware;");
        System.out.println(" - Segurança de aplicativos;");
        System.out.println(" - Controle de solicitações de suporte;");
        System.out.println(" - Levantamento de requisitos.");
    }
}
