package exercicio_1;

public class Produto {

    private String nome;
    private Double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco > 0) this.preco = preco;
        else throw new IllegalArgumentException("O preço do produto não pode ser nulo ou negativo.");
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque > 0) this.quantidadeEmEstoque = quantidadeEmEstoque;
        else throw new IllegalArgumentException("A quantidade em estoque não pode ser nula ou negativa.");
    }

}
