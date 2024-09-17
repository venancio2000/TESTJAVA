package teste.produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {




        Produto produto1 = new Produto("sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(produto1);
        listaProduto.add(produto2);

        System.out.println("Tamanho da lista: " + listaProduto.size());
        System.out.println("Produto da posição 0: " + listaProduto.get(0));

        for (Produto produto : listaProduto) {
            System.out.println(produto);
        }
    }
}
