package novoProjeto.screenmatch;

import novoProjeto.screenmatch.calculos.CaculadoraDeTempo;
import novoProjeto.screenmatch.calculos.FiltroRecomendacao;
import novoProjeto.screenmatch.modelo.Episodio;
import novoProjeto.screenmatch.modelo.Filme;
import novoProjeto.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme:" + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Pega a Media das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporadas(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost:" + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("avatar", 2023);
        //outroFilme.setNome("avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CaculadoraDeTempo caculadoraDeTempo = new CaculadoraDeTempo();
        caculadoraDeTempo.iclui(meuFilme);
        caculadoraDeTempo.iclui(outroFilme);
        caculadoraDeTempo.iclui(lost);
        System.out.println(caculadoraDeTempo.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setSerie(lost);
        episodio.setNome("lost");
        episodio.setNumero(1);
        episodio.setTotalVisualizacao(1000);
        System.out.println(episodio.getClassificacao());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);
        filtroRecomendacao.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList <Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoPaulo);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilme.size());
        System.out.println("Primeiro filme " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);









    }
}
