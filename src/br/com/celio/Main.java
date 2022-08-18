package br.com.celio;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao(
            2014,
            "Mercedez",
            "Branco",
            89750.98,
            9,
            2200.15
        );

        Carro carro1 = new Carro(
            2018,
            "Fusion",
            "Preto",
            38990.75,
            12,
            "Sedan"
        );

        Moto moto1 = new Moto(
            2013,
            "Honda",
            "Vermelha",
            5489.89,
            14,
            false
        );

        Van van1 = new Van(
            2017,
            "Chevrolet",
            "Azul",
            32590.19,
            4,
            8
        );

        System.out.println(van1.calcularPrecoVenda(van1.capacidadePessoas));
    }
}
