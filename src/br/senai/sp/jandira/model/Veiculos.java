package br.senai.sp.jandira.model;

public class Veiculos {
    private String modelo, marca, placa;
    private int ano;

    //construtor
    public Veiculos(String marca){
        this.marca = marca;
    }
    public void acelerar(){
        System.out.println("O veiculo está acelerando");
    }
    public void freiar(){
        System.out.println("O veiculo está freiando");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
