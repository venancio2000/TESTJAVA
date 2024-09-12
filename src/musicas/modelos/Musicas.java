package musicas.modelos;

public class Musicas {
    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int numeroAvaliacao;

    public void exibirFichaTecnica(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Ano de Lancamento: " + this.anoDeLancamento);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        numeroAvaliacao++;
    }
    public double media(){
        return somaDasAvaliacoes / numeroAvaliacao;
    }
}
