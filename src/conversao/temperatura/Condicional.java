package conversao.temperatura;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if(anoDeLancamento >= 2023){
            System.out.println("Lançamento que os cliente estão curtido!");
        }else {
            System.out.println("Filme retro  que vale a pena verificar assistir");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.print("Deve pagar a locação");
        }
    }
}
