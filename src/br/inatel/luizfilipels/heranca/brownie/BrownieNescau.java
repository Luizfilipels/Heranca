package br.inatel.luizfilipels.heranca.brownie;

public class BrownieNescau extends Brownie{
    public BrownieNescau(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando um maravilhoso Brownie de Nescau no carrinho de compras");
    }


    public void addNescau() {
        System.out.println("Adicionando mais Nescau...");
    }
}
