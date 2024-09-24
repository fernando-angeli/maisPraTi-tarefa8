package exercicio_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SonsDeAnimais {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Vaca vaca = new Vaca();

        List<Animal> animais = new ArrayList<>(Arrays.asList(gato, cachorro, vaca));
        animais.forEach(animal -> System.out.println(animal.emitirSom()));
    }
}
