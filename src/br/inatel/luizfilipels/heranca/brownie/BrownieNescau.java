package br.inatel.luizfilipels.heranca.brownie;

public class BrownieNescau extends Brownie{
    public BrownieNescau(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addNescau() {
        System.out.println("Adicionando mais Nescau...");
    }
}
