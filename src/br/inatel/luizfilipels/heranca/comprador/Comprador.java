package br.inatel.luizfilipels.heranca.comprador;


import br.inatel.luizfilipels.heranca.brownie.Brownie;

public class Comprador {

    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void comprarBrownie(Brownie brownie) {
        brownie.addCarrinhoDeCompra();
        brownie.calculaCarrinho();
        System.out.println("O comprador comprou o brownie: " + brownie.getNome());
    }



}
