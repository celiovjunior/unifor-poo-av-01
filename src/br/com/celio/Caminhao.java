package br.com.celio;

public class Caminhao extends Veiculo{

    public double capacidadeDeCarga;

    Seguro seguro;

    public Caminhao(int ano, String nome, String cor, double precoDeCompra, int quantidadeEmEstoque, double capacidadeDeCarga) {
        super(ano, nome, cor, precoDeCompra, quantidadeEmEstoque);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double calcularPrecoVenda(double capacidadeDeCarga) {
        double precoDeVenda;

        if(capacidadeDeCarga >= 3000) {
            precoDeVenda = this.precoDeCompra * 1.07;
        } else {
            precoDeVenda = this.precoDeCompra * 1.05;
        }
        return precoDeVenda;
    }

    public double calculoSeguro() {
        double precoDoSeguro = 0;

        if(this.seguro.tipo == 2) {
            precoDoSeguro = this.calcularPrecoVenda(this.capacidadeDeCarga) * 0.3;
        } else if (this.seguro.tipo == 1) {
            precoDoSeguro = this.calcularPrecoVenda(this.capacidadeDeCarga) * 0.2;            
        }
        
        return precoDoSeguro;
    }
}
