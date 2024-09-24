package exercicio_5;

public class Trem implements IMeioTransporte{

    private final static double ACELERACAO = 25;
    private final static double FRENAGEM = 8;

    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += ACELERACAO;
        System.out.println("Trem acelerou, velocidade: " + this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade -= FRENAGEM;
        System.out.println("Trem freiou, velocidade: " + this.velocidade);    }

}
