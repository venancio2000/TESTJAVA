package carro.modelos;

public class CarroAno {
    private String modelo;
    private String cor;
    private int anoDoCarro;

    public void exibiFicha(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + anoDoCarro);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.anoDoCarro = ano;
    }
    public int calculaIdade(){
        return 2024 - anoDoCarro;
    }

    public static void main(String[] args) {
        CarroAno carro = new CarroAno();

        carro.setModelo("Gol");
        carro.setCor("verde");
        carro.setAno(2016);

        carro.exibiFicha();

        System.out.println(carro.calculaIdade());
    }
}
