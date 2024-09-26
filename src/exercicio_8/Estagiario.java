package exercicio_8;

public class Estagiario extends Funcionario{

    private double valeAlimentacaoDia;
    private double valeTransporteDia;

    public Estagiario(String nome, double salario, double valeAlimentacaoDia, double valeTransporteDia) {
        super(nome, salario);
        this.valeAlimentacaoDia = valeAlimentacaoDia;
        this.valeTransporteDia = valeTransporteDia;
        setTipoFuncionario(TipoFuncionario.ESTAGIARIO);
    }

    public double getValeAlimentacaoDia() {
        return valeAlimentacaoDia;
    }

    public double getValeTransporteDia() {
        return valeTransporteDia;
    }

    public void setValeAlimentacaoDia(double valeAlimentacaoDia) {
        this.valeAlimentacaoDia = valeAlimentacaoDia;
    }

    public void setValeTransporteDia(double valeTransporteDia) {
        this.valeTransporteDia = valeTransporteDia;
    }

    @Override
    public double calcularPagamento(double diasTrabalhados) {
        double salario = this.getSalario() / 30 * diasTrabalhados;
        double bonificacao = this.getSalario() * this.getBonus();
        double valeAlimentacao = this.valeAlimentacaoDia * diasTrabalhados;
        double valeTransporte = this.valeTransporteDia * diasTrabalhados;
        double total = salario + bonificacao + valeAlimentacao + valeTransporte;
        System.out.print(this.getDados() + " | Salário " + formatarReal.format(salario));
        System.out.print(" | Bonificação " + formatarReal.format(bonificacao) + " ("+this.getBonus()*100 + "%)");
        System.out.print(" | Vale alimentação " + formatarReal.format(valeAlimentacao));
        System.out.print(" | Vale transporte: " + formatarReal.format(valeTransporte));
        System.out.println(" | TOTAL: " + formatarReal.format(total));
        return total;
    }

    public void promoverDesenvolvedor(){
        if(getTipoFuncionario() != TipoFuncionario.ESTAGIARIO) throw new IllegalArgumentException("Só é possível promover a desenvolvedor quem é estagiário.");
        this.setTipoFuncionario(TipoFuncionario.DESENVOLVEDOR);
        this.setSalario(this.getSalario() * 2);
    }
}
