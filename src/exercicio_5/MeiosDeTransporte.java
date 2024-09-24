package exercicio_5;

import java.sql.SQLOutput;

public class MeiosDeTransporte {
    public static void main(String[] args) {

        IMeioTransporte [] transportes = { new Carro(), new Bicicleta(), new Trem()};

        for(IMeioTransporte t : transportes){
            t.acelerar();
            t.acelerar();
            t.frear();
        }
    }
}
