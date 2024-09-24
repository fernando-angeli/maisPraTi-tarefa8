package exercicio_2;

import exercicio_1.Produto;
import exercicio_1.ProdutoTeste;

import java.text.NumberFormat;
import java.util.Locale;

public class ProdutoDescontoTeste {
    public static void main(String[] args) {

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Produto p1 = new Produto();
        p1.setNome("Fone de ouvido bluetooth");
        p1.setPreco(100.00);
        p1.setQuantidadeEmEstoque(5);
        System.out.println("Nome: " + p1.getNome() + " | Preço: " + formatter.format(p1.getPreco()) + " | Estoque: " + p1.getQuantidadeEmEstoque());
        try{
            p1.aplicarDesconto(50);
            System.out.println("Nome: " + p1.getNome() + " | Preço: " + formatter.format(p1.getPreco()) + " | Estoque: " + p1.getQuantidadeEmEstoque());
            // Vai gerar exceção ao tentar aplicar percentual maior que 50% de desconto
            p1.aplicarDesconto(55.0);
        } catch (Exception e){
        System.out.println("Erro: " + e.getMessage());
    }
    }
}
