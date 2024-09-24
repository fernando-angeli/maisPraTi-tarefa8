package exercicio_5;

public class Carro implements IMeioTransporte{

    private final static int ACELERACAO = 40;
    private final static int FRENAGEM = 20;
    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += ACELERACAO;
        System.out.println("Carro acelerou, velocidade: " + this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade -= FRENAGEM;
        System.out.println("Carro freiou, velocidade: " + this.velocidade);
    }

}
