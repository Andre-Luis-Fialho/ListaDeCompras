import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Produto> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean registraProduto(Produto produto){
        if (this.saldo >= produto.getPreco()){
            this.saldo -= produto.getPreco();
            this.compras.add(produto);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getCompras() {
        return compras;
    }
}
