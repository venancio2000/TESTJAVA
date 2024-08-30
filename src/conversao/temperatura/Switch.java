package conversao.temperatura;

public class Switch {
    public static void main(String[] args) {

        int dia = 3;
        String nomeDia;

        switch (dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Seunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            default:
                nomeDia = "Dia inálido";
                break;
        }
        System.out.println("o dia seria " + dia + " na semana " + nomeDia);
    }
}
