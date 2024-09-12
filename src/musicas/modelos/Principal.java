package musicas.modelos;

public class Principal {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("Lazaro");
        musicas.setArtista("Rodrigues");
        musicas.setAnoDeLancamento(2023);

        musicas.exibirFichaTecnica();

        musicas.avalia(10);
        musicas.avalia(10);
        musicas.avalia(10);

        System.out.println(musicas.media());
    }
}
