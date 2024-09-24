import exercicio_1.ProdutoTeste;
import exercicio_2.ProdutoDescontoTeste;
import exercicio_3.FuncionarioTeste;

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

        /*3. Criação de uma Hierarquia de Classes
        ○ Objetivo: Crie uma classe Funcionario com atributos nome e salario. Em
        seguida, crie duas subclasses: Gerente e Desenvolvedor. Adicione um
        método calcularBonus que retorna um valor diferente para cada tipo de
        funcionário (por exemplo, 20% do salário para Gerente e 10% para
        Desenvolvedor). Utilize protected para permitir que as subclasses
        acessem os atributos da classe base de forma segura.*/
        System.out.println("\n >>> Exercício "+ exerciseNumber++ + " <<<");
        FuncionarioTeste.main(args);

    }
}