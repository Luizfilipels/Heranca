package br.inatel.luizfilipels.heranca;

import br.inatel.luizfilipels.heranca.brownie.BrownieCafe;
import br.inatel.luizfilipels.heranca.brownie.BrownieNescau;
import br.inatel.luizfilipels.heranca.comprador.Comprador;

public class Main {
    public static void main(String[] args) {
        BrownieNescau bn = new BrownieNescau("Brownie de Nescau", 30, "Nescau");
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 25, "Cafe");
        Comprador comprador = new Comprador("Comprador", 1000.55);

        comprador.comprarBrownie(bc);
        comprador.comprarBrownie(bn);


    }
}
