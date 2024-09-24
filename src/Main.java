import exercicio_1.ProdutoTeste;
import exercicio_2.ProdutoDescontoTeste;

public class Main {
    public static void main(String[] args) {

        int exerciseNumber = 1;
        /*1. Criação de uma Classe Simples
        ○ Objetivo: Crie uma classe Produto que represente um produto de uma
        loja. A classe deve ter atributos privados nome, preco e quantidade em
        estoque. Implemente métodos públicos para acessar e modificar esses
        atributos. Garanta que o preço e a quantidade não possam ser negativos.*/
        System.out.println(" >>> Exercício "+ exerciseNumber++ + " <<<");
        ProdutoTeste.main(args);

        /*2. Melhorando a Classe com Validação
        ○ Objetivo: Extenda a classe Produto para incluir um método
        aplicarDesconto(double porcentagem) que reduz o preço do produto.
        Valide para garantir que o desconto não possa ser maior que 50%.
        Implemente a lógica que lança uma exceção se o desconto for inválido.*/
        System.out.println("\n >>> Exercício "+ exerciseNumber++ + " <<<");
        ProdutoDescontoTeste.main(args);

    }
}