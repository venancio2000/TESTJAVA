package novoProjeto.screenmatch.principal;


import novoProjeto.screenmatch.modelo.Filme;
import novoProjeto.screenmatch.modelo.Serie;
import novoProjeto.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Serie lost = new Serie("Lost", 2000);

        Filme outroFilme = new Filme("avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
       for (Titulo item : lista) {
           System.out.println(item.getNome());
           if (item instanceof Filme filme) {
               //Filme filme = (Filme) item;
               System.out.println("Classificação: " + filme.getClassificacao());
           }

           // lista.forEach(System.out::println);
       }
    ArrayList<String> buscarporArtista = new ArrayList<>();
       buscarporArtista.add("Adan sandler");
       buscarporArtista.add("Paulo");
       buscarporArtista.add("Jacqueline");
        System.out.println(buscarporArtista);

        Collections.sort(buscarporArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscarporArtista);

        Collections.sort(lista);
        System.out.println("Depois da ordenação de Filme: ");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);


    }
}
