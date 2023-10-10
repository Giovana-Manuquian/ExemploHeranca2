package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Moto;

public class App {
    public static void main(String[] args) {

        Moto moto = new Moto("Honda");
        moto.cadastrarMoto();

        moto.acelerar();

    }
}
