package br.com.celio;

public class Moto extends Veiculo {
    public boolean esportivo;

    public Moto(int ano, String nome, String cor, double precoDeCompra, int quantidadeEmEstoque, boolean esportivo) {
        super(ano, nome, cor, precoDeCompra, quantidadeEmEstoque);
        this.esportivo = esportivo;
    }

    public double calcularPrecoVenda(String cor) {
        double precoDeVenda;

        if(cor == "Verde" || cor == "Vermelha") {
            precoDeVenda = this.precoDeCompra * 1.4;
        } else {
            precoDeVenda = this.precoDeCompra * 1.1;
        }
        return precoDeVenda;
    }
}
