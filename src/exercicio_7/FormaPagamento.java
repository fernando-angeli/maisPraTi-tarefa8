package exercicio_7;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class FormaPagamento {

    NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    protected abstract void processarPagamento(double valor);

    protected abstract boolean validarPagamento();

}
