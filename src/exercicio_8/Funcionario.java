package exercicio_8;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Funcionario implements CalcularPagamento{

    NumberFormat formatarReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private static final double BONUS_GERENTE = 0.25;
    private static final double BONUS_DESENVOLVEDOR = 0.15;
    private static final double BONUS_ESTAGIARIO = 0.05;

    private String nome;
    private TipoFuncionario tipoFuncionario;

    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus(){
        switch (this.tipoFuncionario){
            case GERENTE -> {
                return BONUS_GERENTE;
            } case DESENVOLVEDOR -> {
                return BONUS_DESENVOLVEDOR;
            }default -> {
                return BONUS_ESTAGIARIO;
            }
        }
    }

    public String getDados(){
        return this.nome + "/" + this.tipoFuncionario;
    }

}
