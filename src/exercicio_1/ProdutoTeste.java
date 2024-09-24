package exercicio_1;

import java.text.NumberFormat;
import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        Produto p1 = new Produto();
        try{
            p1.setNome("Mouse sem fio");
            p1.setPreco(45.90);
            p1.setQuantidadeEmEstoque(2);
            System.out.println("Nome: " + p1.getNome() + " | Preço: " + formatter.format(p1.getPreco()) + " | Estoque: " + p1.getQuantidadeEmEstoque());
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        // Simulando valor invalido para preço (nulos ou negativos)
        try{
            p1.setPreco(0.00);
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        // Simulando valor invalido para estoque (nulo ou negativo)
        try{
            p1.setQuantidadeEmEstoque(-1);
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
