package paquete;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Prenda> prendasPepe = new ArrayList<>();
        prendasPepe.add(new Prenda("buzo", "adidas"));
        prendasPepe.add(new Prenda("campera", "nike"));
        prendasPepe.add(new Prenda("zapatillas deportivas", "reebok"));
        prendasPepe.add(new Prenda("gorra", "monster"));

        List<Prenda> prendasAgus = new ArrayList<>();
        prendasAgus.add(new Prenda("campera", "bross"));

        GuardaRopa gr = new GuardaRopa();

        int pepe = gr.guardarPrendas(prendasPepe);
        int agus = gr.guardarPrendas(prendasAgus);

        System.out.println("ids de guarda ropa:");
        System.out.println(pepe);
        System.out.println(agus);
        gr.mostrarPrendas();

        List<Prenda> prendaDevuelta = gr.devolverPrendas(agus);

        gr.mostrarPrendas();

    }

}
