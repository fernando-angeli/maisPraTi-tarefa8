package exercicio_8;

public class Desenvolvedor extends Funcionario{

    private double valeAlimentacaoDia;

    public Desenvolvedor(String nome, double salario, double valeAlimentacaoDia) {
        super(nome, salario);
        this.valeAlimentacaoDia = valeAlimentacaoDia;
        setTipoFuncionario(TipoFuncionario.DESENVOLVEDOR);
    }

    public double getValeAlimentacaoDia() {
        return valeAlimentacaoDia;
    }

    public void setValeAlimentacaoDia(double valeAlimentacaoDia) {
        this.valeAlimentacaoDia = valeAlimentacaoDia;
    }

    @Override
    public double calcularPagamento(double diasTrabalhados) {
        double salario = this.getSalario() / 30 * diasTrabalhados;
        double bonificacao = this.getSalario() * this.getBonus();
        double valeAlimentacao = this.valeAlimentacaoDia * diasTrabalhados;
        double total = salario + bonificacao + valeAlimentacao;
        System.out.print(this.getDados() + " | Salário " + formatarReal.format(salario));
        System.out.print(" | Bonificação " + formatarReal.format(bonificacao) + " ("+this.getBonus()*100 + "%)");
        System.out.print(" | Vale alimentação " + formatarReal.format(valeAlimentacao));
        System.out.println(" | TOTAL: " + formatarReal.format(total));
        return total;
    }

}
