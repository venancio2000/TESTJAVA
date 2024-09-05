package carro.modelos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
