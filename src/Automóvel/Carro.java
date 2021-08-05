package Automóvel;

public class Carro {

    public static void main(String[] args) {

        final MarcaCarro marca = new MarcaCarro("Ford");

        System.out.println("A marca do carro é: " + marca.getMarca());

        final ModeloCarro modelo = new ModeloCarro("Mustang Mach-E");

        System.out.println("O modelo do carro é: " + modelo.getModelo());

        final AnoCarro ano = new AnoCarro(2021);

            System.out.println("O carro é de " + ano.getAno());
    }
}
