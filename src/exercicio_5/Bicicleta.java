package exercicio_5;

public class Bicicleta implements IMeioTransporte{

    private final static int ACELERACAO = 4;
    private final static int FRENAGEM = 3;

    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += ACELERACAO;
        System.out.println("Bicicleta acelerou, velocidade: " + this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade -= FRENAGEM;
        System.out.println("Bicicleta freiou, velocidade: " + this.velocidade);
    }

}
