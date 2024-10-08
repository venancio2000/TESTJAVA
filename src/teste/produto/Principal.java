package teste.produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {




        Produto produto1 = new Produto("sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);
        Produto produto3 = new Produto("Arroz", 9.99, 6);

        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);

        System.out.println("Tamanho da lista: " + listaProduto.size());
        System.out.println("Produto da posição 0: " + listaProduto.get(0));

        double somaPrecos = 0;
        for (Produto produto : listaProduto) {
            somaPrecos += produto.getPreco();
        }
        double mediaPreco = somaPrecos / listaProduto.size();
        System.out.println(mediaPreco);
    }
}
