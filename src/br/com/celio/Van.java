package br.com.celio;

public class Van extends Veiculo {
    public int capacidadePessoas;

    public Van(int ano, String nome, String cor, double precoDeCompra, int quantidadeEmEstoque, int capacidadePessoas) {
        super(ano, nome, cor, precoDeCompra, quantidadeEmEstoque);
        this.capacidadePessoas = capacidadePessoas;
    }

    public double calcularPrecoVenda(int capacidadePessoas) {
        double precoVenda;
        if(capacidadePessoas > 12) {
            precoVenda = this.precoDeCompra * 1.6;
        } else {
            precoVenda = this.precoDeCompra * 1.35;
        }

        return precoVenda;
    }
}
