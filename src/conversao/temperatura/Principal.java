package conversao.temperatura;

public class Principal {
    public static void main(String[] args) {

        double temperatura = 32;
        double fahrenheit = (temperatura * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celssius é equivalente a %f Fahrenheit", temperatura, fahrenheit);
        System.out.println(mensagem);
    }
}
