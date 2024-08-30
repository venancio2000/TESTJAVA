package conversao.temperatura;

public class Calculadora {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10){
            double resultado = contador * 10;
            System.out.println(contador +" X 10: " + resultado);
            contador++;
        }
    }
}
