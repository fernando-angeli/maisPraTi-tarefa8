package exercicio_7;

public class Pix extends FormaPagamento{

    private String chavePix;
    private boolean isHabilitada;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public void setHabilitada(boolean habilitada) {
        isHabilitada = habilitada;
    }

    @Override
    protected void processarPagamento(double valor) {
        validarPagamento();
        System.out.println("PIX de " + formatter.format(valor) + " realizado com sucesso!");
    }

    @Override
    protected boolean validarPagamento() {
        if(!this.isHabilitada) throw new IllegalArgumentException("Chave PIX não habilitada.");
        return true;
    }
}
