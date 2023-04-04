package br.inatel.luizfilipels.heranca;

import br.inatel.luizfilipels.heranca.brownie.BrownieNescau;

public class Main {
    public static void main(String[] args) {
        BrownieNescau bn = new BrownieNescau("Brownie de Nescau", 30, "Nescau");

        System.out.println("--- Loja de Brownie ---");

        bn.addCarrinhoDeCompra();

        bn.addNescau();

        bn.calculaCarrinho();
    }
}
