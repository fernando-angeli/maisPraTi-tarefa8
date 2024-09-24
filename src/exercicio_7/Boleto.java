package exercicio_7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Boleto extends FormaPagamento{

    private static final int PRAZO_MINIMO_BOLETO = 7;

    private int prazo;
    private LocalDate vencimento;

    public Boleto(int prazo) {
        this.prazo = prazo;
        this.vencimento = LocalDate.now();
    }

    @Override
    protected void processarPagamento(double valor) {
        if(validarPagamento()){
            DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Boleto no valor de " + formatter.format(valor) + " gerado com sucesso, vencimento para " + formatterDate.format(vencimento) + ".");
        }
    }

    @Override
    protected boolean validarPagamento() {
        if(this.prazo < PRAZO_MINIMO_BOLETO) throw new IllegalArgumentException("O prazo minimo para emissão de boletos é de " + PRAZO_MINIMO_BOLETO + " dias.");
        this.vencimento = this.vencimento.plusDays(this.prazo);
        return true;
    }
}
