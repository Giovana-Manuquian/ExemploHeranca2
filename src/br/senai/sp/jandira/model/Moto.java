package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Moto extends Veiculos {
    Scanner scanner = new Scanner(System.in);
    boolean bau, antena;
    public Moto(String marca){
        super(marca);
    }
    public void cadastrarMoto(){
        System.out.println("-------------------------------------------------");
        System.out.print("Informe o modelo: ");
        super.setModelo(scanner.nextLine());
        System.out.print("Informe a placa: ");
        super.setPlaca(scanner.nextLine());
        System.out.print("Informe o ano: ");
        super.setAno(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Informe se a moto tem bau [true - false]: ");
        bau = scanner.nextBoolean();
        System.out.print("Informe se a moto tem antena [true - false]: ");
        antena = scanner.nextBoolean();
        System.out.println("-------------------------------------------------");
    }
}
