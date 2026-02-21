import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("limite do cartão: ");
        double limite = input.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("digite o nome do produto: ");
            String nome = input.next();

            System.out.println("digite o valor do produto: ");
            double valor = input.nextDouble();

            Produto produto = new Produto(nome, valor);
            boolean compraRealizada = cartao.registraProduto(produto);

            if (compraRealizada == true) {
                System.out.println("Produto realizado com sucesso!");
                System.out.println("0 para sair 1 para continuar: ");
                sair = input.nextInt();
            }else {
                System.out.println("saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("Compras Realizadas!");
        Collections.sort(cartao.getCompras());
        for (Produto p : cartao.getCompras()) {
            System.out.println(p.getNome() + " - " + p.getPreco());

        }
        System.out.println("***********************");
        System.out.println("\n saldo cartão: "+ cartao.getSaldo());

    }
}
