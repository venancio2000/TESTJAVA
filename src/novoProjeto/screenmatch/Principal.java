package novoProjeto.screenmatch;

import novoProjeto.screenmatch.modelo.Filme;
import novoProjeto.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme:" + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Pega a Media das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporadas(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost:" + lost.getDuracaoEmMinutos());



    }
}
