package it.epicode;

import it.epicode.Catalogo.Catalogo;
import it.epicode.Catalogo.Riviste;
import it.epicode.Utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    private static List<Catalogo> catalogo = new ArrayList<>();

    public static void main(String[] args) {
        Random r=new Random();
        long codice=r.nextLong();

//        for (int i=0; i<5;i++){
//
//            Utils.aggiungiLibro(catalogo);
//            Utils.aggiungiRivista(catalogo);
//
//        }


        Utils.addlibbro(7,"Gli uomini danzanti",2001,350,"Arthur Conan Doyle","mistero", catalogo);
        Utils.addlibbro(8,"Sono il numero 4",2001,350,"Pittacus Lore","fantasy", catalogo);
        Utils.addrivista(6,"Magazine",2020,30, Riviste.periodicità.SETTIMANALE,catalogo);
        Utils.addrivista(5,"Cucina",2024,36, Riviste.periodicità.SETTIMANALE,catalogo);

        Utils.rimuovi(9,catalogo);

        System.out.println(catalogo);




    }


}
