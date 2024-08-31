package conversao.temperatura;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(10);
        int tentativas = 0;
        int numerodigitado = 0;

        while (tentativas < 5){
            System.out.println("Digite um numero entre 0 e 100: ");
            numerodigitado = leitura.nextInt();
            tentativas++;

            if (numerodigitado == numeroGerado){
                System.out.println("Parabéns, você acertou o numero em " + tentativas);
                break;
            } else if(numerodigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o numero gerado.");
            }else {
                System.out.println("O numero digitado é maior que o numero gerado.");
            }

        }
        if (tentativas == 5 && numerodigitado != numeroGerado){
            System.out.println("Você não conseguiu acertar o numero em 05 tentantivas");
        }

    }
}
