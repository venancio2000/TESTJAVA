package novoProjeto.screenmatch.modelo;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epsodiosPorTemporadas;
    private int minutosPorEpsodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiosPorTemporadas() {
        return epsodiosPorTemporadas;
    }

    public void setEpsodiosPorTemporadas(int epsodiosPorTemporadas) {
        this.epsodiosPorTemporadas = epsodiosPorTemporadas;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporadas * minutosPorEpsodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
