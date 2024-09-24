package exercicio_3;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "\nNome: " + nome + "\nSalário: " + formatter.format(salario);
    }
}
