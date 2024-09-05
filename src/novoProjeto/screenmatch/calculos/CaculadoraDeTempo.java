package novoProjeto.screenmatch.calculos;

import novoProjeto.screenmatch.modelo.Titulo;

public class CaculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void iclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
