package br.inatel.luizfilipels.heranca.brownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando ao carrinho de compras: " + nome);
    }

    public void calculaCarrinho() {
        System.out.println("Calculando o item: " + nome + " -- Preço: " + preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}
