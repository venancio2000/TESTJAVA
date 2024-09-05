package novoProjeto.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() > 4){
            System.out.println("Está entre os Preferidos do momento");
        } else if (classificavel.getClassificacao() > 2) {
            System.out.println("Muito bem avaliado no momento");
        }else {
            System.out.println("coloque na sua lista para assistir depois");
        }
    }
}
