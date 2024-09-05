package novoProjeto.screenmatch;

import novoProjeto.screenmatch.calculos.CaculadoraDeTempo;
import novoProjeto.screenmatch.calculos.FiltroRecomendacao;
import novoProjeto.screenmatch.modelo.Episodio;
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

        Filme outroFilme = new Filme();
        outroFilme.setNome("avatar");
        outroFilme.setAnoDeLancamento(2023);
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







    }
}
