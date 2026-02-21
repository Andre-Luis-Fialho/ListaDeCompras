

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + ", preco: " + this.preco;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.valueOf(this.preco).compareTo(o.getPreco());
    }
}
