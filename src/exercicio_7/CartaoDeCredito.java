package exercicio_7;

public class CartaoDeCredito extends FormaPagamento {

    private double limiteDisponivel;
    private boolean isDesbloqueado;

    public CartaoDeCredito(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
        this.isDesbloqueado = false;
    }

    public void setDesbloqueado(boolean desbloqueado) {
        isDesbloqueado = desbloqueado;
    }

    @Override
    protected void processarPagamento(double valor) {
        validarPagamento();
        if(valor > this.limiteDisponivel) throw new IllegalArgumentException("Limite insuficiente, você tentou fazer um pagamento de "+ formatter.format(valor) + ", mas seu limite é de " + formatter.format(this.limiteDisponivel) + ".");
        this.limiteDisponivel -= valor;
        System.out.println("Pagameto no valor de " + formatter.format(valor) + " efetuado com sucesso, seu limite agora é de " + formatter.format(this.limiteDisponivel) + ".");
    }

    @Override
   protected boolean validarPagamento() {
        if(!this.isDesbloqueado) throw new IllegalArgumentException("Cartão bloqueado.");
        return true;
    }
}
