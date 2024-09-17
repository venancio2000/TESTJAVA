package conversao.temperatura;

public class CalculadoraDobrar {

    public int doblaValor(int numero){
        return numero * 2;
    }


    public static void main(String[] args) {

        CalculadoraDobrar calculadoraDobrar = new CalculadoraDobrar();

        int resultado = calculadoraDobrar.doblaValor(5);
        System.out.println(resultado);
    }

}
