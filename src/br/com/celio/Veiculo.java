package br.com.celio;

public class Veiculo {
    public int ano;
    public String nome;
    public String cor;
    public double precoDeCompra;
    public int quantidadeEmEstoque;

    public Veiculo(int ano, String nome, String cor, double precoDeCompra, int quantidadeEmEstoque) {
        this.ano = ano;
        this.nome = nome;
        this.cor = cor;
        this.precoDeCompra = precoDeCompra;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
