package teste.revisao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é  o Screem Match");
        System.out.println("Fime: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        boolean icluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double mediaDoFilme = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Ano de Lancamento" + anoDeLancamento);
        System.out.println(mediaDoFilme);

        String sinopse;
        //sinopse = "Filme de anvetura com galã dos anos 80";
        //System.out.println(sinopse);
        sinopse = """
                  Filme Top Gun
                  Filme de anvetura com galã dos anos 80
                  Ano de lançamento
                  """ + anoDeLancamento;
        System.out.println(sinopse);

        System.out.println(String.format("Filme de anvetura com galã dos anos 80 ano de lancamento: %d", anoDeLancamento));

        String mensagem = """
                          Filme Top Gun
                          Filme de anvetura com galã dos anos 80
                          Ano de lançamento %d
                          """.formatted(anoDeLancamento);
        System.out.println(mensagem);

        int classificacao;
        classificacao = (int) mediaDoFilme / 2;
        System.out.println(classificacao);
    }
}