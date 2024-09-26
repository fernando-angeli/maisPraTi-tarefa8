package exercicio_8;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
        setTipoFuncionario(TipoFuncionario.GERENTE);
    }

    @Override
    public double calcularPagamento(double diasTrabalhados) {
        double salario = this.getSalario() / 30 * diasTrabalhados;
        double bonificacao = this.getSalario() * this.getBonus();
        double total = salario + bonificacao;
        System.out.print(this.getDados() + " | Salário " + formatarReal.format(salario));
        System.out.print(" | Bonificação " + formatarReal.format(bonificacao) + " ("+this.getBonus()*100 + "%)");
        System.out.println(" | TOTAL: " + formatarReal.format(total));
        return total;
    }
}
