package br.com.celio;

public class Carro extends Veiculo {
    public String tipo;

    Seguro seguro;

    public Carro(int ano, String nome, String cor, double precoDeCompra, int quantidadeEmEstoque, String tipo) {
        super(ano, nome, cor, precoDeCompra, quantidadeEmEstoque);
        this.tipo = tipo;
    }

    public double calcularPrecoVenda(int ano, String tipo) {
        double precoDeVenda;

        if(ano < 2018 && tipo == "Sedan") {
            precoDeVenda = this.precoDeCompra * 1.3;
        } else {
            precoDeVenda = this.precoDeCompra * 1.15;
        }
        return precoDeVenda;
    }

    public double calculoSeguro() {
        double precoDoSeguro = 0;

        if(this.seguro.tipo == 2) {
            precoDoSeguro = this.calcularPrecoVenda(this.ano, this.tipo) * 0.3;
        } else if (this.seguro.tipo == 1) {
            precoDoSeguro = this.calcularPrecoVenda(this.ano, this.tipo) * 0.2;
        }

        return precoDoSeguro;
    }
}
